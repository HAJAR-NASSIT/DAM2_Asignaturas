""" Pide al usuario un comando del tipo «sumar 3 5», «restar 10 4» o «multiplicar 2 8» y ejecuta la operación correspondiente. """

comando = input("Introduce un comando:")
partes = comando.split()
print(partes)
operacion = partes[0]
numero1 = int(partes[1])
numero2 = int(partes[2])

if(operacion == "sumar" ):
    suma=numero1+numero2
    print(suma)

if(operacion == "multi"):
    multi=numero1*numero2
    print(multi)

if(operacion == "restar"):
    resta=numero1-numero2
    print(resta)



