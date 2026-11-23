import ollama
import sys
import time

sys.stdout.reconfigure(encoding="utf-8")

pregunta = "Ana es mayor que Luis. Luis es mayor que Marta. ¿Quién es la persona más joven? Responde en una frase."

systems = ["responde en una frase", "explique poco a poco"]
models = ["qwen3.5:0.8b", "qwen3.5:4b"]


def ejecutar(modelo, pregunta, system):

    inicio = time.time()

    respuesta = ollama.chat(
        model=modelo,
        think=False,
        stream=False,
        messages=[
            {"role": "system", "content": system},
            {"role": "user", "content": pregunta}
        ]
    )

    tiempo = time.time() - inicio

    texto = respuesta["message"]["content"]
    caracteres = len(texto)

    print("Respuesta:", texto)

    return tiempo, caracteres


print("MODELO | SYSTEM | TIEMPO | CARACTERES")

for m in models:
    for s in systems:
        tiempo, caracteres = ejecutar(m, pregunta, s)

        print(f"{m} | {s} | {tiempo:.2f}s | {caracteres}")