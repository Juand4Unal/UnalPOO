vd1 = 4200000
vd2 = 250000
vd3 = 3300000
salar = 380320
totven = vd1 + vd2 + vd3
porven = 0.33 * totven
salar1 = 0
salar2 = 0
salar3 = 0

if vd1 > porven:
    salar1 = salar + 0.2*salar
else: 
    salar1 = salar
if vd2 > porven:
    salar2 = salar + 0.2*salar
else: 
   salar2 = salar  
if vd3 > porven:
    salar3 = salar + 0.2*salar
else: 
    salar3 = salar


print(f"SALARIO VENDEDORES DEPTO. 1 {salar1} SALARIO VENDEDORES DEPTO. 2 {salar2} SALARIO VENDEDORES DEPTO. 3 {salar3}")