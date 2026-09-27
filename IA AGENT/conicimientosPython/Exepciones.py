try:
    # Aquí ponemos el código que puede dar error.

    numerador = int(input("Ingresa un Número: "))
    # Pide el primer número y lo convierte a entero.

    denominador = int(input("Ingresa un Número: "))
    # Pide el segundo número y lo convierte a entero.

    resultado = numerador / denominador
    # Divide el numerador entre el denominador.


except ZeroDivisionError as e:
    # Se ejecuta si intentas dividir un número entre 0.

    print(e)
    # Muestra el error técnico: division by zero.

    print("No puedes dividir por cero!")
    # Muestra un mensaje claro para el usuario.


except ValueError as e:
    # Se ejecuta si escribes texto en vez de un número.

    print(e)
    # Muestra el error técnico.

    print("Por favor, ingresa solo números.")
    # Explica al usuario qué debe escribir.


else:
    # Se ejecuta solo si NO hubo ningún error en try.

    print(resultado)
    # Muestra el resultado de la división.


finally:
    # Se ejecuta siempre: haya error o no haya error.

    print("Esto se ejecutará siempre!")
    # Muestra este mensaje al final.