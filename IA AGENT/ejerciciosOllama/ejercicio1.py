import ollama
import sys
import time
sys.stdout.reconfigure(encoding="utf-8")

def ejecutar(modelo,pregunta,think) -> float:
    inicio=time.time()
    respuesta = ollama.chat(
            model=modelo,
            think=think,
            stream=True,
            messages=[

                {
                    'role': 'system',
                    'content': 'Texto'
                },
                {
                    "role": "user",
                    "content": pregunta
                    }
            ]
        )
    
    for r in respuesta:
        print(r["message"].get("content",""),end="",flush=True)
        
    final = time.time()-inicio
    
    return final


tiempo1 = ejecutar("qwen3.5:4b","Ana es mayor que Luis. Luis es mayor que Marta. ¿Quién es la persona más joven? Responde en una frase.",False)
print("***********************************************************\n")
tiempo2 = ejecutar("qwen3.5:4b","Ana es mayor que Luis. Luis es mayor que Marta. ¿Quién es la persona más joven? Responde en una frase.",True)
print("***********************************************************\n")
print("\nHE LLEGADO AL IF", flush=True)

if(tiempo2>tiempo1):
    veces=tiempo2/tiempo1
    print(f"con thinking es {veces: .1f} mas lento") 
elif tiempo1 > tiempo2:
    veces = tiempo1 / tiempo2
    print(f"Sin thinking es {veces:.1f} veces más lento")

else:
    print("Los tiempos son iguales")

print(f"respuesta 1 => {tiempo1} \n respuesta 2 => {tiempo2}")