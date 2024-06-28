from FiguraGeometrica import FiguraGeometrica
from Color import Color

class Cuadrado(FiguraGeometrica, color):
    def __init__(self,lado, color):
        FiguraGeometrica.__init__(self,lado,lado)
        Color.__init__(self,color)

    def calcular_area(self):
        return self.alto * self.ancho 
    
    def _str_(self):
        return f'{FiguraGeometrica.__str__(self)} {Color.__str__(self)} {Color.__str__(self)}'