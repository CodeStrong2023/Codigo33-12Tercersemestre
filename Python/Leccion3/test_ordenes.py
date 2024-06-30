
from Orden import Orden
from Producto import Producto


producto1 = Producto("Camisa", 100 )
producto2 = Producto("Pantalon",150)
productos1 = [producto1, producto2]
producto3 = Producto("Auriculares ",200)
producto4 = Producto("Monitor",250)
producto5 = Producto("Campera", 350)
producto6 = Producto("Blusa", 400)
productos2= [producto3, producto4]
Orden1 = Orden(productos1) 
Orden1.agregar_productos(producto5)
Orden1.agregar_productos(producto3)
print(Orden1)
print(f'Total de orden1: {Orden1.calcular_total()}')
Orden2 = Orden(productos2)
Orden2.agregar_productos(producto6)
Orden2.agregar_productos(producto2)
print(Orden2)
print(f'Total de orden2: {Orden2.calcular_total()}')