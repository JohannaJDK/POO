package FigurasGeometricas;

import java.util.Scanner;

public class Ejecucion {
    
    public static void main(String[] args) {

    Scanner leer= new Scanner(System.in);
    Circulo circle= new Circulo();
    Cuadrado scuadre= new Cuadrado();
    Rectangulo rectangle= new Rectangulo();
    Triangulo triangle=new Triangulo();
    
    int   intentos;
    int   figuras;

   
        System.out.println("Digite el número de intentos que vas a realizar");
        intentos=leer.nextInt();

        for(int i=1; i<intentos; i++){

        System.out.println("Digite la figura para descubrir el area ");
        System.out.println("1.Circulo   2.Cuadrado   3.Rectangulo   4.Triangulo");
        figuras=leer.nextInt();

        if(figuras==1){
            
            circle.PedirDatosCirculo();
            circle.calcularAreaCirculo();

        }else if(figuras==2){

            scuadre.pedirDatosCuadrado();
            scuadre.calcularAreaCuadrado();

        }else if(figuras==3){

            rectangle.PedirDatosRectangulo();
            rectangle.calcularAreaRectangulo();


        }else if(figuras==4){

            triangle.pedirDatosTriangulo();
            triangle.calcularAreaTriangulo();

        }
        }

    }
}
