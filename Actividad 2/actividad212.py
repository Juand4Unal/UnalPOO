nom = input("Ingrese nombre: ")
nht = int(input("Ingrese horas trabajadas: "))
vhn = float(input("Ingrese el valor de hora de trabajo: "))
het = 0
hees = 0
if nht > 40:
    
    hees = nht - 40
    if hees > 8:
        het = hees - 8
        het = het * vhn * 3
        hees = 8 * vhn * 2
    else:
        hees = hees * vaho * 2
    
    salario = (40 * vhn) + hees + het

else: 
    salario = vhn * nht


print(f"El trabajador {nom} devengo: {salario}")


