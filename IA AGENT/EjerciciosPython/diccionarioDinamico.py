""" Crea un diccionario donde las claves sean nombres introducidos por el usuario y los valores sus edades. """

""" libro = {"titulo": "Obabakoak", "año": 1988}
 """
palabra =""
while palabra != "fin":
    diccionario = {}
    nombres = input("introduce los nombres :")
    edades = int(input("introduce los edades :"))
    diccionario["nombres"]=edades

    for key, value in diccionario.items():
        print(key, value)

