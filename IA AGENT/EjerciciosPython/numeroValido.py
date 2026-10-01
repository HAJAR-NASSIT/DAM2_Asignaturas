while True:
    try:
        numero = int(input("introduce un numero :"))
        print(f"numero valido :{numero}")
        break
    except ValueError:
        print("valor introducido incorrecto")