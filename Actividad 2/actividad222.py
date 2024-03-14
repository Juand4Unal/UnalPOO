nombre = input("Ingrese el nombre del empleado: ")
salhora = int(input("Ingrese el salario basico del empleado por hora:"))
horas = int(input("Ingrese las horas trabajadas en el mes:"))

salario = salhora*horas

if salario>450000:
    print(nombre)
    print(salario)
else:
    print(nombre)