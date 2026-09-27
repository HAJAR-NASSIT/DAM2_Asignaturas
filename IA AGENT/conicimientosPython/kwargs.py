# **kwargs recibe varios datos con nombre: clave = valor.
# Python los guarda dentro de un diccionario.

def hola(**kwargs):
    # Crea una función llamada hola.
    # **kwargs recibe, por ejemplo:
    # {'titulo': 'Señor', 'nombre': 'Alex', 'apellido': 'Smith'}

    # print('Hola ' + kwargs['nombre'] + ' ' + kwargs['apellido'])
    # Busca valores concretos usando su clave.
    # kwargs['nombre'] busca el valor de la clave nombre.
    # Esta opción sirve cuando sabes exactamente qué claves vas a recibir.

    print('Hola', end=' ')
    # Muestra "Hola" sin bajar a la siguiente línea.
    # end=' ' añade un espacio al final.

    for clave, valor in kwargs.items():
        # Recorre el diccionario completo.
        # clave = titulo, nombre, apellido...
        # valor = Señor, Alex, Smith...

        print(valor, end=' ')
        # Imprime cada valor sin bajar de línea.
        # No imprime las claves, solo los valores.


hola(titulo='Señor', nombre='Alex', apellido='Smith', segundo_nombre='Python')
# Llama a la función enviando datos con nombres.
# Resultado: Hola Señor Alex Smith Python