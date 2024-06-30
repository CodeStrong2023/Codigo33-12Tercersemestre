from Cuadrado import Cuadrado 
from Rectangulo import Rectangulo

cuadrado1 = Cuadrado(5, "Violeta")
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(f'El area del cuadrado es: {cuadrado1.calcular_area()}')

#MRO
print(Cuadrado.mro())

print(cuadrado1)

rectangulo1 = Rectangulo(5,7,"Azul")
print(f'El area del rectangulo es: {rectangulo1.calcula_elarea()}')
#MRO
print(Rectangulo.mro())
print(rectangulo1)