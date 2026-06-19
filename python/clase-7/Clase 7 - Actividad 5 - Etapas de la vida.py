Edad = int(input("Digite su edad: "))
mensaje = None

if 0<= Edad < 10:
    mensaje = "La infancia es increible y bella"
elif 10 <= Edad < 20:
    mensaje = "Tienes muchos cambios, mucho que estudiar"
elif 20 <= Edad < 30:
    mensaje = "Amor y comienza el trabajo"
elif 30 <= Edad < 40:
    mensaje = "Etapa de crecimiento personal y profesional"
elif 40 <= Edad < 50:
    mensaje = "Mayor experiencia y estabilidad"
elif 50 <= Edad < 60:
    mensaje = "Tiempo de reflexionar y disfrutar logros"
elif 60 <= Edad < 70:
    mensaje = "Disfruta la tranquilidad y la familia"
elif 70 <= Edad < 80:
    mensaje = "La sabiduría es tu mejor compañía"
elif 80 <= Edad < 90:
    mensaje = "Cada día es una experiencia valiosa"
elif 90 <= Edad <= 100:
    mensaje = "Una vida llena de historias y aprendizajes"
else:
    mensaje = "Edad no válida"

print(f"Tu edad es: {Edad}, {mensaje} ")
