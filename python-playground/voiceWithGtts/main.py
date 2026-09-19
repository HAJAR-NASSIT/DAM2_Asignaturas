from gtts import gTTS

text = "habibi , mi amor hicham que te parece si quedamos mas tarde enn el centro de bilbao es que te hecho de menos e qiuero que me das un gran abrazo e un besito profundo hasta que me lubrique mi hachon"


tts = gTTS(text=text, lang="es")
tts.save("arabic.mp3")
print("audio saved successfully")