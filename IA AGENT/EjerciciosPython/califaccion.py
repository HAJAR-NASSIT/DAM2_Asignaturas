
temperatura = int(input("introduce una temperatura :"))
while temperatura !=0:
    
    if(temperatura<18):
        print("encender la cal")
    else:
        if temperatura>24:
            print("apagarla")
        else:
            print("encender")