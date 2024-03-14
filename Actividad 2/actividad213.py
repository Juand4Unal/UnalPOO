valcomp = float(input("Ingrese el valor de la compra: "))
color = input("Color de la bolita: ")

if color == "BLANCO":
    pdes = 0
    valpag = valcomp

elif color == "VERDE":
    pdes = 10
    valpag = valcomp - ((valcomp * 10 )/100)
elif color == "AMARILLO":
    pdes = 25
    valpag = valcomp - ((valcomp * pdes )/100)
elif color == "AZUL":
    pdes = 50
    valpag = valcomp - ((valcomp * pdes )/100)
elif color == 'ROJO':
    pdes = 100
    valpag = valcomp - ((valcomp * pdes )/100)

print(valpag)