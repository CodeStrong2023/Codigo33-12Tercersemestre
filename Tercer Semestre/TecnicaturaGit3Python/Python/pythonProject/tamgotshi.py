class Stats:
    def __init__(self):
        self.hambre = 10
        self.cansancio = 10
        self.suenio = 10

    def alimentar(self, cantidad):
        self.hambre -= cantidad
        if self.hambre <= 0:
            self.hambre = 0
        self.cansancio += cantidad * 0.10sss
        if self.cansancio > 100:
            self.cansancio = 100

    def jugar(self):
        self.cansancio += 10
        if self.cansancio > 100:
            self.cansancio = 100
        self.hambre += 10
        if self.hambre > 100:
            self.hambre = 100

    def dormir(self):
        self.cansancio -= 100
        if self.cansancio <= 0:
            self.cansancio = 0


    def imprimir_estado(self):
    print("Hambre: " + str(self.hambre))
    print("Cansancio: " + str(self.cansancio))
    print("Suenio: " + str(self.suenio))