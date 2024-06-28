class NumerosIgualesException (Exception): #Extiende de la class
    def __init__(self, mensaje):
        self.message = mensaje