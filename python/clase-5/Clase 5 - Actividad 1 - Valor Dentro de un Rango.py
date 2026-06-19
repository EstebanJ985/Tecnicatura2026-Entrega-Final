valor = int(input("Ingrese un valor dentro del rango 0 a 5: "))
valorMin = 0
valorMax = 5
dentroRango = valor >= valorMin and valor <= valorMax

if dentroRango:
    print(f"El valor {valor} esta dentro del rango {valorMin}-{valorMax}")
else:
    print(f"El valor {valor} no esta dentro del rango {valorMin}-{valorMax}")