from abc import ABC,_abstractmethod

class FiguraGeometrica(ABC):
    def __init__(self, ancho, alto):
        if self._validar_valores(ancho):
            self._ancho = ancho
        else:
            self.ancho = 0
            print(f'Valor erroneo para el ancho: {ancho}')
        if self._validar_valores(alto):
            self._alto = alto
        else:
            self.alto = 0
            print(f'Valor erroneo para el alto: {alto}')

    
    @property
    def ancho(self):
        return self._ancho
    
    @ancho.setter
    def ancho(self, ancho):
        if self._validar_valores(ancho):
            self._ancho = ancho
        else:
            print(f'Valor erroneo: {ancho}')

    @property
    def alto(self):
        return self._alto
    
    @alto.setter
    def alto(self, alto):
        if self._validar_valores(alto):
            self._alto = alto
        else:
            print(f'Valor erroneo: {alto}')

    @_abstractmethod
    def calcular_area(self):
        pass

    def __str__(self):
        return f'FiguraGeometrica [Ancho: {self._ancho}, Alto: {self._alto}]'
    
    def _validar_valores(self,valor):
        return True if 0 < valor < 10 else False 