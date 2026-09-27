# Los diccionarios guardan datos en parejas: clave y valor.
# Se usan, por ejemplo, para guardar: país → capital, producto → precio.

capitales = {
    'EE.UU': 'Washington D.C',
    'Argentina': 'Buenos Aires',
    'Chile': 'Santiago de Chile',
    'Brasil': 'Brasilia',
    'cursos': ['Python', 'C++'],
    'años': 22
}
# Crea un diccionario llamado capitales.
# Cada clave tiene un valor asociado.


# capitales.update({'Alemania': 'Berlin'})
# Añade 'Alemania' con su capital 'Berlin'.
# Si la clave ya existe, cambia su valor.


# print(capitales.get('Argentina'))
# Busca la clave 'Argentina' y devuelve su valor: 'Buenos Aires'.


# print(capitales.keys())
# Muestra todas las claves del diccionario.


# print(capitales.values())
# Muestra todos los valores del diccionario.


# print(capitales.items())
# Muestra todas las parejas: clave y valor.


# for key, value in capitales.items():
#     print(key, value)
# Recorre todas las parejas del diccionario.
# key guarda la clave y value guarda su valor.


# capitales.pop('EE.UU')
# Elimina la pareja que tiene como clave 'EE.UU'.


# capitales.clear()
# Elimina todos los elementos del diccionario.
# El diccionario se queda vacío: {}