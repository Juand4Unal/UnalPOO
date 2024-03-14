esferaA = float(input("Ingrese el peso de la esfera A: "))
esferaB = float(input("Ingrese el peso de la esfera B: "))
esferaC = float(input("Ingrese el peso de la esfera C: "))

if esferaA > esferaB and esferaA > esferaC:
    print("Esfera A es mas pesada")
elif esferaB > esferaA and esferaB > esferaC:
    print("Esfera B es mas pesada")
else:
    print("Esfera C es mas pesada")