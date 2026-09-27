import os
# Importa el módulo os, que permite trabajar con archivos y carpetas.


path = 'C:\\Users\\COMPUMAR\\Desktop\\folder'
# Guarda la ruta de una carpeta o archivo.
# En Windows usamos \\ porque \ solo tiene un significado especial en Python.


if os.path.exists(path):
    # Comprueba si esa ruta existe.

    print('Esa ubicación existe!')
    # Muestra este mensaje si existe.

    if os.path.isfile(path):
        # Comprueba si la ruta corresponde a un archivo.

        print('Es un Archivo!')
        # Se ejecuta si path es un archivo.

    elif os.path.isdir(path):
        # Comprueba si la ruta corresponde a una carpeta/directorio.

        print('Es un Directorio!')
        # Se ejecuta si path es una carpeta.


else:
    # Se ejecuta si la ruta no existe.

    print('Esa ubicación NO existe!')
    # Informa de que no se ha encontrado la ruta.