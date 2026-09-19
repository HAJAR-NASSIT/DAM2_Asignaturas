import math
"""
print("hola python")

#x=0
#if(x>5): print("lo has conseguido")
#else: print("vaya has fallado")

x=3 ; y=7
suma = x+y
print(suma)

v=2
print(type(v))
v = "hajar" 
print(type(v))
v=[1,2,3]
print(type(v))
print()

numero = int(input("introduce un numero :"))
print(numero)
numero = float(input("introduce un numero :"))
print(numero)
print()

nombre = (input("introduce tu nombre :"))
edad = int(input("introduce tu edad :"))
print(f"mi nombre es {nombre}, mi edad es {edad}")
print()

n = 2
print(f"el cuadrado es {n**2}, el cubo es {n**3} el raiz cuadrada es {math.sqrt(n)}")


numero =int(input("dame un num :")) 
if(numero>0): print("positivo")
elif(numero<0): print("negativo")
else: print("cero")


numero =int(input("dame un num :")) 
print("pequeño" if numero < 10  else "medio" if numero < 99  else "grande") 


numero =int(input("dame un num :")) 
print("par" if numero%2==0 else "impar")

palabra =input("dame una palabra :")
print("muy bien " if palabra.lower() == "python" else "has fallado")


lista = ["hajar" , "hicham" ,"hanae"]
for nombre in lista:
    print(nombre)



for numeros in range(1 , 11):
    print(numeros)

    Repetir hasta que se cumpla una condición de parada.
suma =0
numero = int(input("introduce numero :"))
while numero!=0:
    suma+=numero
    numero = int(input("introduce numero :"))

print(f"la suma es {suma}")


for numeros in range(1,20):
    if numeros % 3 == 0 :
        continue
    print(numeros)

for numeros in range(1,20):
    if numeros % 7 == 0 :
        break
    print(numeros)


def saludar(nombre = "hajar"):
    print(f"hola{nombre}")

saludar()


def suma(a,b):
    return a+b
print(suma(1,3))



def saludo(nombre="invitado"):
    print(f"Hola {nombre}")
saludo()
saludo("Hajar")



def lista(lista):
    return sum(lista),max(lista),min(lista)
print(lista([1,2,3]))
suma, mayor, menor = lista([1,2,3])
print(suma);print(mayor);print(menor)

"""