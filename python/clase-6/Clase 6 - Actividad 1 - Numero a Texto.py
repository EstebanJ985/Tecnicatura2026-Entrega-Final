num = int(input("Ingrese un numero en el rango 1 a 3: "))
numTexto = " "

if num == 1:
    numTexto = "Numero Uno"
elif num == 2:
    numTexto = "Numero Dos"
elif num == 3:
    numTexto = "Numero Tres"
else:
    numTexto = "Ingresaste un numero fuera del rango 1 a 3"

print(f" El numero ingresado es: {num} - {numTexto}")