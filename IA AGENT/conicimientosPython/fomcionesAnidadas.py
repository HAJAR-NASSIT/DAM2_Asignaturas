# num = input("Ingresa un Número: ")
# Pide al usuario que escriba un número.
# input siempre guarda lo escrito como texto (string).

# num = float(num)
# Convierte el texto que escribió el usuario a número decimal.

# num = abs(num)
# Convierte un número negativo en positivo.
# Ejemplo: abs(-8.5) da como resultado 8.5.

# num = round(num)
# Redondea el número decimal al entero más cercano.
# Ejemplo: round(4.7) da como resultado 5.

# print(num)
# Muestra el resultado final por pantalla.


print(round(abs(float(input("Ingresa un Número: ")))))
# Hace lo mismo, pero todo en una sola línea:
# 1. input() pide un número.
# 2. float() lo convierte a decimal.
# 3. abs() lo convierte a positivo si era negativo.
# 4. round() lo redondea.
# 5. print() muestra el resultado.