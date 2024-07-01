class Producto:
    contador_productos = 0 # Variable de clase 

    def __init__(self, nombre, precio):
        Producto.contador_productos += 1 # Aumento para la variable de clase 
        self._id_producto = Producto.contador_productos # Asignación desde la variable de clase
        self._nombre = nombre
        self._precio = precio
    
    # Métodos Setter and Getter
    @property
    def nombre(self):
        return self._nombre
    
    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def precio(self):
        return self._precio
    
    @precio.setter
    def precio(self, precio):
        self._precio = precio
    
    # Sobre escribimos el método str
    def __str__(self):
        return (f'Id Producto: {self._id_producto}, Nombre: {self._nombre}, Precio: {self._precio}')
    
if __name__ == '__main__': # Solo sera posible si la prueba se ejecuta desde aqui
    Producto1 = Producto('Camiseta', 100.00)
    print(Producto1)
    Producto2 = Producto('Pantalon', 150.00)
    print(Producto2)