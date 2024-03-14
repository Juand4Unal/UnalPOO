valor1 = int(input("Ingrese un valor: "))
valor2 = int(input("Ingrese otro valor menor al que digito primero: "))
impares = 0
multiplo = 0
for i in range(valor2, valor1+1):
    if i % 2 != 0:
        impares = impares + 1
    if i % 3 == 0:
        multiplo = multiplo +1

print(f"Estos son los impares: {impares}")
print(f"Estos son los multiplos de 3: {multiplo}")


