import random
# Importa el módulo random, que sirve para generar valores aleatorios.


x = random.randint(1, 6)
# Genera un número entero aleatorio entre 1 y 6.
# Incluye el 1 y también el 6.
# Ejemplo: simular un dado.


y = random.random()
# Genera un número decimal aleatorio entre 0 y 1.
# Ejemplo: 0.4582


mi_lista = ['Piedra', 'Papel', 'Tijera']
# Crea una lista con tres opciones.


z = random.choice(mi_lista)
# Elige un elemento aleatorio de la lista.
# Ejemplo: puede guardar 'Papel'.


cartas = ['1', '2', '3', '4', '5', '6', '7', '8', '9', 'J', 'Q', 'K', 'A']
# Crea una lista con cartas.


random.shuffle(cartas)
# Mezcla los elementos de la lista cartas.
# Cambia el orden original de la lista.


print(cartas)
# Muestra las cartas ya mezcladas.