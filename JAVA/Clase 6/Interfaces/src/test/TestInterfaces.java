
package test;

import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
      IAccesoDatos datos = new ImplementacionMysql(); 
      //datos.listar();
      
      datos = new ImplementacionOracle();}
      //datos.listar();
      imprimir(datos);
    }
        
    public static void imprimir(IAceesoDatos datos){
        datos.listar();
    }
}

