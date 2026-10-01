""" Simula un agente que recibe un nivel de energía de 0 a 100. Si es menor que 20 debe recargar, 
entre 20 y 50 entra en modo ahorro, y por encima de 50 en modo activo. 
Según el estado, genera después la acción concreta: buscando estación, reduciendo consumo o realizando tareas. """

acciones = {
    "recargar": "buscando estación",
    "ahorro": "reduciendo consumo",
    "activo": "realizando tareas"
}

energia = int(input("Introduce un nivel de energía de 0 a 100: "))

if energia < 20:
    estado = "recargar"
elif 20 <= energia <= 50:
    estado = "ahorro"
else:
    estado = "activo"

accion = acciones[estado]

print(f"Estado: {estado}")
print(f"Acción: {accion}")

