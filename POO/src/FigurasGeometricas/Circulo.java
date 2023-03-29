package FigurasGeometricas;
import java.util.Scanner;

public class Circulo {
    float pi;
    float Radio;

    //METODO CONSTRUCTOR
    public Circulo() {
        this.pi = pi;
        this.Radio = Radio;
    }

    //METODO ACCESORES
    public float getpi() {
        //VALOR DE RETORNO
        return pi;
    }
    public float getRadio() {

        //VALOR RETORNO
        return Radio;
    }

    public void setDiametro(float pi) {
        this.pi = pi;  
    }
    public void setRadio(float Radio) {
        this.Radio = Radio; 
        
    }

    //METODOS PROPIOS
    //creamos el metodo pedir datos 
    public void PedirDatosCirculo(){
        
        Scanner leer= new Scanner(System.in);

        System.out.println("Digite el valor de pi");
        pi=leer.nextFloat();

        System.out.println("Digite el Radio");
        Radio=leer.nextFloat();

        leer.close();
    }


    public void calcularAreaCirculo(){
    float areaCirculo;
    areaCirculo= (pi)*(Radio)*2;
    System.out.println("Area del circulo: "+areaCirculo+" /nDeterminado por "+pi+ " y "+Radio);

    }

    
    
}

