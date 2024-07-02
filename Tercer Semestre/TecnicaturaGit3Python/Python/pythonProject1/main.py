class Tamagotchi:
     def __init__(self, nombre):
         self.nombre = nombre
         self.hambre = 0
         self.aburrimiento = 0
         self.suenio = 0

def alimentar(self):
    if self.hambre > 0:
        self.hambre -= 1
        print(f"Alimentaste a {self.nombre}. Hambre: {self.hambre}")
    else:
        print(f"{self.nombre} no tiene hambre.")