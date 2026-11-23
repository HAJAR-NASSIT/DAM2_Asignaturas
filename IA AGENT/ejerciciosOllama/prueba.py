import ollama
import time
import sys

sys.stdout.reconfigure(encoding='utf-8')

respuesta = ollama.chat(
    model='qwen3.5:0.8b',
    messages=[
        {'role': 'system', 'content': 'Responde brevemente'},
        {'role': 'user', 'content': 'Que es Python'}
    ],
    think=False,
    stream=False
)
def ejecutar(modelo, pregunta, system, think=False, stream=False):
    inicio = time.time()
    respuesta = ollama.chat(
        model=modelo,
        messages=[
            {'role': 'system', 'content': system},
            {'role': 'user', 'content': pregunta}
        ],
        think=think,
        stream=stream
    )

    texto = ''
    primero = None

    if stream:
        for parte in respuesta:
            fragmento = parte.message.get('content', '')
            if fragmento:
                if primero is None:
                    primero = time.time() - inicio
                texto += fragmento
                print(fragmento, end='', flush=True)
        print()
    else:
        texto = respuesta.message.get('content', '')
        print(texto)

    total = time.time() - inicio
    return texto, primero, total

