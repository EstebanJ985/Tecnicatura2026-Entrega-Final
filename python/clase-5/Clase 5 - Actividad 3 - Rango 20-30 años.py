añoNacimiento = int(input("Ingrese su año de nacimiento: "))
edad = 2026 - añoNacimiento
valorMin = 20
valorMax = 30
dentroRango = edad >= valorMin and edad <= valorMax



if dentroRango:
    print(f"Su edad {edad} esta en el rango {valorMin}-{valorMax}: Podemos decir que esta en la etapa de trancision")
elif edad < valorMin:
    print(f"En tus {edad} aun no llegas al rango {valorMin}-{valorMax}, te queda mucho por delante")
else:
    print(f"En tus {edad} superaste al rango {valorMin}-{valorMax}, espero que la vida sea buena en lo que viene")
