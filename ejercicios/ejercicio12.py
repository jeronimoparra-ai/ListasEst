nombre = input(("Ingrese su nombre: "))
print("\n ---Ingrese que productos compro---")
articulos1 = (input("ingrese el producto: "))
valor1 = float(input("ingrese el valor del producto : "))
articulos2 = (input("ingrese el producto: "))
valor2 = float(input("ingrese el valor del prodcuto: "))
articulos3 = (input("ingrese el producto: "))
valor3 = float(input("ingrese el valor del producto:"))
valortotal = (valor1 + valor2 + valor3 )
print ("El monto total que gasto fue: ",valortotal)

if valortotal >= 300.000:
   descuento = valortotal * 2/100
   totalPagar = valortotal - descuento
   print ("Se le aplica descuento del 20% por su compra",totalPagar)
elif valortotal <= 300.000:
   descuento = valortotal * 2/100
   totalPagar = valortotal - descuento
   print ("Se le aplica descuento del 20% por su compra",descuento)
   print("El monto total a pagar es de:",totalPagar)
elif valortotal <= 150.000:
   print ("No se le aplica el descuento",nombre)
   print("El monto total a pagar es de:",valortotal)
else:
  ("Ingrese los datos correctamente")

print("Los productos que compro fueron: ",articulos1,articulos2,articulos3,"con un valor total de: ",valortotal)