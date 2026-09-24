""" Validación robusta
Objetivo. Insistir hasta que la entrada sea correcta.

Pide un número entero y repite hasta que el usuario introduzca uno válido. """


""" while True:
    try:
        numero = int(input("introduce un numero:"))
        break;
    except ValueError:
        print("ERROR! por introducir un valor que no es un entero")

print("has introducido un numero correcto")
"""
numeros = []
while True :
    entrada = input("introduce un numero:")
    
    
    if entrada== "":
        print("no has introducido ninguna valor")
    elif entrada=="fin":
        break 
    else:
        try:
            valor=float(entrada)
            numeros.append(valor)
        except ValueError:
            print("el valor introducido no es un numero")


if(len(numeros)>0):
    media = sum(numeros) / len(numeros)      
    print("Media: ",media)
    print("Maximo: ",max(numeros))
    print("Minimo" ,min(numeros))
