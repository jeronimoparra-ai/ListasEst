nombre = input(("Ingrese su nombre: "))
artcmp= int(input("ingrese cuantos articulos compro: "))
print("\n ---Ingrese que articulos compro---")
articulos = (input("ingrese el articulo: "))
valor1 = float(input("ingrese el valor del articulo: "))
articulos = (input("ingrese el articulo: "))
valor2 = float(input("ingrese el valor del articulo: "))
articulos = (input("ingrese el articulo: "))
valor3 = float(input("ingrese el valor del articulo:"))
valorArt = (valor1 + valor2 + valor3 )
print ("El monto total que gasto fue: ",valorArt)

if valorArt > 20.000:
   descuento = valorArt * 2/100
   totalPagar = valorArt - descuento
   print ("Se le aplica descuento del 2% por su compra",totalPagar)

else:
  ("No se le aplica descuento")