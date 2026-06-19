from operator import truediv

condicion1 = ""

if condicion1 == True:
    print("Condicion Verdadera")
elif condicion1 == False:
    print("Condicion Falsa")
else:
    print("Condicion sin especificar")

#Al hacer click sobre el numero de linea, aparece un circulo rojo
#Esto marca una ruptura donde el codigo se va a detener

#Operador Ternario
#Esto nos permite poner las condiciones en una misma linea de codigo

condicion2 = True

print("Condicion Verdadera") if condicion2 else print("Condicion Falsa")