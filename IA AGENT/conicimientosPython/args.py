def suma(*args):
    # Crea una función llamada suma.
    # *args permite enviar muchos números a la función.

    suma = 0
    # Crea una variable acumuladora que empieza en 0.

    cosas = list(args)
    # Convierte los valores recibidos en una lista.
    # Ejemplo: args = (1, 5, 3, 2, 7, 1)
    # cosas = [1, 5, 3, 2, 7, 1]

    cosas[1] = 0
    # Cambia el elemento de la posición 1 por 0.
    # La posición 1 era el número 5.
    # Ahora la lista es: [1, 0, 3, 2, 7, 1]

    for i in cosas:
        # Recorre todos los números de la lista, uno por uno.

        suma += i
        # Va sumando cada número a la variable suma.
        # Es igual que escribir: suma = suma + i

    return suma
    # Devuelve el resultado final de la suma.


print(suma(1, 5, 3, 2, 7, 1))
# Llama a la función enviando varios números.
# Como el 5 se cambia por 0, el resultado es: 14