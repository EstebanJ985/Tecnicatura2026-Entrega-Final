#Tipos de Datos

#STR es solo una referencia
a = str = "Hola Mundo"
print(type(a))  #Devuelve que es STRING (str)

a = 50
print(type(a)) #Devuelve que es numerico (int)

a = 8.35
print(type(a)) #Devuelve que es decimal (Float)

#Tipo BOOLEAN +
a= True
print(type(a)) #Devuelve que es una boolean (Bool)

#Tipo BOOLEAN -
a = False
print(type(a)) #Devuelve que es una boolean (Bool)


#MANEJO DE CADENAS

#STRING

miGrupoFavorito = "The Letter Black: " "The Best Rock Band"
print("Mi Grupo Favorito Es: "+miGrupoFavorito)

miGrupoFavorito2 = "The Letter Black:"
caracteristicas = "The Best Rock Band"
print("Mi Grupo Favorito Es:", miGrupoFavorito2, caracteristicas)

#INT

num1 = "7"
num2 = "8"

print(int(num1) + int(num2))

#BOOLEAN

miBooleano = 3>2
print(miBooleano)

if miBooleano:
    print("Es verdadero")
else:
    print("Es falso")



#PROCESAR LA ENTRADA DE UN USUARIO

#Funcion Input

resultado = input("Introduce un numero: ") #Devolvera un str
print(resultado)


#Convertir la entrada del usuario

numero = int(input("Introduce el 1er numero: "))
numero2 = int(input("Introduce el 2do numero: "))
resultado = numero + numero2
print("El resultado de la suma es: ", resultado)

