import math as m

A = float(input("Escribir el valor de A: "))
B = float(input("Escribir el valor de B: "))
C = float(input("Escribir el valor de C: "))

respuesta1 = (-B + m.sqrt(B**2 - 4*A*C))/(2*A)
respuesta2 = (-B - m.sqrt(B**2 - 4*A*C))/(2*A)

print(respuesta1)
print(respuesta2)