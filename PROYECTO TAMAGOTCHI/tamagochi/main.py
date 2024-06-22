# PARTE VISUAL 
import flet as ft
from flet import *

async def main(page: ft.Page):
    # Caracteristicas de la ventana

    page.window_width = 400
    page.window_height = 450
    page.window_resizable = False
    page.padding = 0

    # Colores del tamagotchi

    azul = '#00215E'
    cyan = '#2C4E80'
    amarillo = '#FFC55A'
    rosado = '#A91D3A'
    negro = '0xFF000000'
    blanco = '0xFFFFFFF'
    blanco24 = '0x3DFFFFFF'

    #Imagenes
    imagenLogo = ft.Image (
        src = "Imagenes/logo.png",
        width = 105,
        height = 60,
        fit = ft.ImageFit.CONTAIN,
    )

    imagenTamagotchi = ft.Image (
        src = "Imagenes/tamagotchi.png",
        scale = 0.5,
    )

    # Botones (Salir, Flechas, Circulo)
    botonSalida = ft.ElevatedButton(
        width = 30,
        on_click = lambda _: page.go("/"),
        style = ft.ButtonStyle(
            shape = ft.CircleBorder(),
            bgcolor = cyan,
            side = ft.BorderSide(width=3, color=blanco),
        ),
    )

    # Diseño de la parte superior, se agrega el boton y la imagen de logo
    disenoSuperior = [ ft.Container(
            botonSalida,
            width = 80,
            height = 45 ,
            # border = ft.border.all() <-- margen para la creacion del diseño
        ),
        ft.Container(
            imagenLogo,
            alignment =ft.alignment.center,
            expand= True  # Permite que el contenedor de la imagen se expanda para centrar la imagen
        ),
    ]

    pantallaCentral = ft.Stack ([
        ft.Container(
            width = 330,
            height = 250,
            bgcolor = blanco24,
            border_radius = 20,
            border = ft.border.all(4, blanco),
            content = ft.Container(
                imagenTamagotchi,
            ),
            alignment = ft.alignment.center
        )
    ])

    # Cuadrantes de guia : Superior, Central e Inferior

    cuadroSuperior = ft.Container(
        content = ft.Row (
            disenoSuperior,
        ),
        width= 380,
        height= 45,
        margin= ft.margin.only(top=15),
        #border = ft.border.all() #<-- margen para la creacion del diseño
    )

    cuadroCentral = ft.Container(
        content= pantallaCentral,
        width= 380,
        height= 250,
        margin= ft.margin.only(top=15),
        alignment= ft.alignment.center,
        #border = ft.border.all(), <-- margen para la creacion del diseño

    )

    cuadroInferior = ft.Container(
        width = 380,
        height = 60,
        margin = ft.margin.only(top=15),
        #content = ft.Row(botonFlechaIzq), Flecha no creada aun
        #border = ft.border.all() <-- margen para la creacion del diseño
    )

    columna = ft.Column(
        spacing = 0,
        controls = [
            cuadroSuperior,
            cuadroCentral,
            cuadroInferior,
        ]
    )

    # Contenedor: Esta el color de fondo de toda la ventana, el tamaño, el centrado.
    # En este caso el tamaño de la ventana y contenedor coinciden, pero se podría modificar.
    contenedor = ft.Container(
        columna,
        width = 400,
        height = 500,
        bgcolor = cyan,
        gradient = ft.LinearGradient([
            azul,
            rosado,
            amarillo,
            ]),
        alignment = ft.alignment.top_center,
    )

    await page.add_async(contenedor)
    page.add(pantallaCentral)
ft.app(target=main)

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