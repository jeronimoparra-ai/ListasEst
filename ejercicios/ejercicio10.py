print("\n--- EJERCICIO 10---")
print("\n---Ingrese Los numeros---")
num1 = int(input("ingrese el numero 1: "))
num2 = int(input("ingrese el numero 2: "))
num3 = int(input("ingrese el numero 3: "))

if num1 == num2 or num1 == num3 or num2 == num3:
    print("Sus numeros no pueden ser iguales")
elif num1 > num2 and num1 > num3:
    print("El valor mas grande es: ",num1)
elif num2 > num1 and num2 > num3:
    print("El valor mas grande es: ",num2)
else:
    print("El valor mas grande es: ",num3)