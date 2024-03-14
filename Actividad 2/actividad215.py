PESOA = float(input("Ingrese el peso de la esfera A: "))
PESOB = float(input("Ingrese el peso de la esfera B: "))
PESOC = float(input("Ingrese el peso de la esfera C: "))
PESOD = float(input("Ingrese el peso de la esfera D: "))

# Comprobación de pesos y determinación de la esfera diferente
if PESOA == PESOB == PESOC:
    if PESOD > PESOA:
        print("La esfera D es la diferente.")
    else:
        print("La esfera D es la diferente.")
elif PESOA == PESOB == PESOD:
    print("La esfera C es la diferente.")
    if PESOC > PESOA:
        print("Y es de mayor peso.")
    else:
        print("Y es de menor peso.")
elif PESOA == PESOC == PESOD:
    print("La esfera B es la diferente.")
    if PESOB > PESOD:
        print("Y es de mayor peso.")
    else:
        print("Y es de menor peso.")
else:
    print("La esfera A es la diferente.")
    if PESOA > PESOB:
        print("Y es de mayor peso.")
    else:
        print("Y es de menor peso.")
