#Se crea un bucle que permitirá al usuario interactuar con el Tamagotchi.
#MENU INTERACTIVO EN DONDE EL USUARIO ELIGE QUE HACER

def main():
    nombre = input("¿Cómo se llama tu Tamagotchi? ")
    mascota = Tamagotchi(nombre)

    while True:
        print("\n¿Qué te gustaría hacer?")
        print("1. Alimentar")
        print("2. Jugar")
        print("3. Dormir")
        print("4. Ver estado") #ALIMENTO-DORMIR-JUGAR - - AGREGAR ALGO MAS SI ES ¿NECESARIO?
        print("5. Salir")

        opcion = input("Elige una opción: ")

#opciones del usario segun su eleccion -
        if opcion == "1":
            mascota.alimentar()
        elif opcion == "2":
            mascota.jugar()
        elif opcion == "3":
            mascota.dormir()
        elif opcion == "4":
            mascota.estado()
        elif opcion == "5":
            print("¡Hasta luego!")
            break
        else:
            print("Opción no válida.")

#SE CREA CLASE - STATS EN CERO(INICIALIZACION EN CERO) - - ¿AGREGAR ALGO MAS?

class Tamagotchi:
    def __init__(self, nombre):
        self.nombre = nombre
        self.hambre = 0
        self.aburrimiento = 0
        self.sueno = 0


#FUNCION PARA ALIMENTAR - - HACER DEMAS FUNCIONES - - FIJARSE LOS NOMBRES DE LOS STATS
#PARA CONTINUAR CON LAS DEMAS FUNCIONES
#¿CAMBIAR ALGO MAS?

    def alimentar(self):
        if self.hambre > 0:
            self.hambre -= 1
            print(f"Alimentaste a {self.nombre}. Hambre: {self.hambre}")
        else:
            print(f"{self.nombre} no tiene hambre.")

#HASTA AQUI REALICE FUNCIONES DE MENU - ELECCION DE USUARIO
# STATS - Y FUNCION ALIMENTAR - (JESSICA PAGANO)

#FUNCION QUE SE DEVUELVE AL MENU -
if __name__ == "__main__":
    main()