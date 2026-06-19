# Ciclo WHILE (Mientras o Durante)

contador = 0
while contador < 3:
    print("Ejecutamos nuestro ciclo while ", contador)
    contador += 1
else:
    print("Fin del ciclo while ")

# Ciclo FOR

cadena = "hello"
for letra in cadena:
    print(letra)
else:
    print("Fin del ciclo for")

#BREAK

for letra in "Alemania":
    if letra == "a":
        print(f"Letra encontrada: {letra}")
        #Usar break, corta el codigo ahi, en este caso
        #No avanza al ELSE
        break
    else:
        print("Fin del ciclo for")

#CONTINUE

for i in range(6):
    if i % 2 == 0:
        print(f"Valor: {i}")

for i in range(6):
    if i % 2 != 0:
        #Usar CONTINUE hace que el codigo pase directamente al
        #print que sigue, obviando el 2do if
        continue
    print(f"Valor: {i}")