""" Pide números hasta que el usuario escriba «fin». Calcula la media, el máximo y el mínimo. """

numeros = []
while True:
    try:
        entrada = input("introduce un numero :")
        if entrada == "fin":
            break
        else:
            numeros.append(int(entrada))
    except ValueError:
        print("Error")

if len(numeros) > 0:
    suma = sum(numeros)
    lengitud = len(numeros)
    media = suma/lengitud
    maximo = max(numeros)
    minimo = min(numeros)
    print(f"media : {media} , maximo : {maximo} , minimo : {minimo}")
else:
    print("la lista esta vacia")