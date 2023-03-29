package FigurasGeometricas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        float lado,base,altura;
        double rete=0.9;
        Scanner leer=new Scanner(System.in);
        System.out.println("Digite el lado del cuadrado");
        lado=leer.nextFloat();
        System.out.println("Digite la base del rectángulo");
        base=leer.nextFloat();
        System.out.println("Digite la altura del rectángulo");
        altura=leer.nextFloat();

        //NOMBRE CLASE NOMBRE OBJETO  CONSTRUCTOR 
        Cuadrado c1=new Cuadrado(lado);
        //NOMBRE CLASE  NOMBRE OBJETO  CONSTRUCTOR 
        Rectangulo r1=new Rectangulo(base, altura);
        c1.calcularArea();
        r1.calcularArea();
        leer.close();

    }
}
