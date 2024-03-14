dato1 = float(input("Ingrese un dato: "))
dato2 = float(input("Ingrese un dato: "))
dato3 = float(input("Ingrese un dato: "))
dato4 = float(input("Ingrese un dato: "))

if dato1>dato2 and dato1>dato3 and dato1>dato4:
    print("Dato 1 es el mas grande")
elif dato2>dato1 and dato2>dato3 and dato2>dato4:
    print("Dato 2 es el mas grande")
elif dato3>dato1 and dato3>dato2 and dato3>dato4:
    print("Dato 3 es el mas grande")
else:
    print("Dato 4 es el mas grande")