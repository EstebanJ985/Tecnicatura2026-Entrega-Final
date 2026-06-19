#OPERADORES LOGICOS

#AND

#Si ambos son TRUE o FALSE, devuelve el valor de las variables
a = True
b = True
resultado = a and b
print(resultado)

#Si una variables es dista devuelte FALSE
a = True
b = False
resultado = a and b
print(resultado)


#OR

#Si ambas son FALSE, devuelve FALSE
a = False
b = False
resultado = a or b
print(resultado)

#Si ambas son TRUE, devuelve TRUE
a = True
b = True
resultado = a or b
print(resultado)

#Si son distintas devuelve TRUE
a = True
b = False
resultado = a or b
print(resultado)


#NOT

#Devuelto todos los datos menos el seleccionado
a = True
b = False
resultado = not b
print(resultado)

a = False
b = True
resultado = not a
print(resultado)
