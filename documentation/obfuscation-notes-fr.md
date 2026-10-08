# Godog : notes sur l’obfuscation

Note du 8 octobre 2026, en marge de la documentation technique en anglais.

La décompilation de Godog rencontre deux obstacles distincts : un nommage qui
rend le code difficile à lire et des métadonnées invalides qui perturbent les
décompilateurs. Le second problème est particulièrement trompeur : un outil peut
terminer sans erreur de processus tout en produisant une référence incomplète,
voire une signature de méthode incorrecte.

## Un nommage conçu pour brouiller la lecture ?

Une grande partie des classes porte des noms comme `kaaakka`, `kaajkkk` ou
`mmjamka`. À l’intérieur de `godog`, on trouve notamment `KkAmAjA`, `kkAmAjA` et
`KKAmAjA`. Java distingue les majuscules : ces identifiants sont différents,
mais leur proximité visuelle complique le suivi des références.

Le contraste avec les noms encore lisibles du moteur audio — `MAD`, `Mixable`,
`DeviceMSbase`, `DeviceSun` — est net. On peut constater l’obfuscation des noms ;
on ne dispose pas encore d’une preuve identifiant l’outil, ses auteurs ou son
mode d’emploi. Les chaînes de caractères, notamment les chemins des images et
les commandes de la séquence dans `godog`, restent des points d’appui lisibles.

Le rapprochement avec **Forward**, autre démo de Komplex, a été proposé pendant
le chantier. C’est une piste de comparaison, pas encore un résultat : les classes
de Forward n’ont pas été analysées dans cette étape. La ressemblance des noms ne
suffit pas à établir l’emploi du même obfuscateur ou de la même version.

## Le piège des tables de variables locales

Dans **101 des 112 classes**, une entrée de `LocalVariableTable` présente un
`name_index` et un `descriptor_index` égaux à zéro. Ces indices devraient désigner
des chaînes valides dans la table des constantes. Cette anomalie a été confirmée
dans les octets des classes et par `javap`, qui signale `Bad CP index: 0`.

Cette table sert à décrire les variables locales pour le débogage. Elle est
distincte des instructions et de la signature déclarée de la méthode. Son contenu
invalide suffit pourtant à perturber la reconstruction du Java :

| Première passe, sur les classes intactes | CFR 0.152 | Procyon 0.6.0 |
| --- | --- | --- |
| Fichiers Java produits | 112 | 11 |
| Méthodes remplacées par un échec explicite | 78 | Aucune dans les 11 fichiers produits |
| Classes sans fichier de sortie | 0 | 101 |
| Code de sortie du processus | 0 | 0 |

Le cas de `main` illustre le danger. Le bytecode de `godog` déclare bien
`main(String[])`, mais la première sortie CFR affiche `main()` et introduit une
variable locale non initialisée pour le tableau d’arguments. Ce n’est pas une
bizarrerie du programme original : c’est un défaut de cette décompilation.

La répétition de la même anomalie dans 101 classes est compatible avec une
transformation systématique destinée à gêner les outils. L’intention exacte et
l’étape qui l’a introduite restent toutefois à établir.

## Le contournement retenu

Les archives et les classes extraites sont conservées intactes dans `original/`.
Les premières décompilations restent consultables dans `reverse/raw/`.

Un [script reproductible](../reverse/prepare_decompiler_input.py) construit un
JAR de travail séparé en retirant **uniquement les 101 entrées invalides**. Il ne
renomme aucun symbole et ne modifie ni les instructions, ni les signatures, ni
la table des constantes, ni les gestionnaires d’exceptions. Les autres
métadonnées sont conservées ; les tailles des attributs englobants sont ajustées.

Deux vérifications encadrent cette opération : les **1 115 blocs de code**
restent identiques dans le contrôle binaire du script, et la sortie indépendante
de `javap -p -c -s` est identique avant et après pour les **112 classes**. Le
[rapport de normalisation](../reverse/evidence/input-normalization.json)
consigne chaque entrée retirée ; le
[rapport de comparaison](../reverse/evidence/bytecode-comparison.json)
documente le second contrôle.

## Ce que les deux références permettent désormais

Après cette préparation, [CFR](../reverse/cfr/godog.java) et
[Procyon](../reverse/procyon/godog.java) produisent chacun **112 fichiers Java**.
Le paramètre de `main(String[])` réapparaît correctement dans les deux sorties.

CFR conserve **18 avertissements de structuration** et un échec dans
`DeviceMSbase.hoxBuff`. Procyon fournit une reconstruction de cette méthode et
ne présente pas de marqueur d’échec détecté dans ses sorties. Cela rend la double
référence utile, sans démontrer que chaque reconstruction est correcte.

Ces fichiers ne constituent donc pas encore une version recompilable ou validée
de Godog. Les ambiguïtés devront être tranchées avec le bytecode, en particulier
dans les boucles de rendu et de son. Pour un futur travail de renommage, une
table explicite de correspondance préserverait les liens avec les symboles
originaux ; aucun renommage n’a été entrepris à ce stade.

Référence de format : [spécification JVM, attribut LocalVariableTable](https://docs.oracle.com/javase/specs/jvms/se25/html/jvms-4.html#jvms-4.7.13).
