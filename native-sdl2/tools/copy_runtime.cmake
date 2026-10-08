foreach(library IN LISTS LIBRARIES)
  file(COPY "${library}" DESTINATION "${DESTINATION}")
endforeach()
