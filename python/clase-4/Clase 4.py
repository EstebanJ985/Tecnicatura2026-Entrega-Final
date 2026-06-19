#OPERADORES

operandoA = 8
operandoB = 5

suma = operandoA + operandoB

#Usamos f para que nos permita sumar la variable entre {}
print(f"La suma es: {suma}")

resta = operandoA - operandoB
print(f"La resta es: {resta}")

multiplicacion = operandoA * operandoB
print(f"La multiplicacion es: {multiplicacion}")

division = operandoA / operandoB
print(f"La division es: {division}")

dividendo = operandoA // operandoB
print(f"La dividendo es: {dividendo}")

modulo = operandoA % operandoB
print(f"La modulo es: {modulo}")

exponente = operandoA ** operandoB
print(f"La exponente es: {exponente}")


#OPERADORES DE REASIGNACION

miVariable = 10
print(miVariable)

#Sumar

miVariable = miVariable + 1
print(miVariable)

miVariable += 1
print(miVariable)

#Resta

miVariable -= 2
print(miVariable)

#Multiplicacion

miVariable *= 3
print(miVariable)

#Division

miVariable /= 2
print(miVariable)



#OPERADORES DE COMPARACION

#Igualdad

a = 2
d = 4
b = 4

resultado = d == b #Comprobamos que si son iguales
print(resultado)
resultado2 = d == a #Compronamos que no son iguales
print(resultado2)


#Diferencias

resultado = d != b
print(resultado)
resultado2 = d != a
print(resultado2)

#Mayor que

resultado = d > b
print(resultado)
resultado2 = d > a
print(resultado2)


#Menor que

resultado = d < b
print(resultado)
resultado2 = a < d
print(resultado2)

#Mayor o igual que   y    Menor o iguale que

resultado = d >= b
print(resultado)
resultado2 = d >= a
print(resultado2)
resultado = d <= b
print(resultado)
resultado2 = a <= d
print(resultado2)