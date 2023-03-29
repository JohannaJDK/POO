package FigurasGeometricas;
import java.util.Scanner;

public class Rectangulo extends Figura {
    //atributos
    float Base, Altura;
    //constructor

    public Rectangulo(float Base, float Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }
public Rectangulo() {
    }
    //métodos accesores
    public float getBase() {
        return Base;
    }

    public void setBase(float Base) {
        this.Base = Base;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }
// métodos propios

public void PedirDatosRectangulo(){
        
    Scanner leer= new Scanner(System.in);

    System.out.println("Digite el valor de la base");
    Base=leer.nextFloat();
    System.out.println("Digite la altura del rectangulo");
    Altura=leer.nextFloat();
}
public void calcularAreaRectangulo(){
    float area;
    area=Base*Altura;
    System.out.println("la altura del rectangulo es: "+Altura+" su base es: "+Base+" y su área es: "+area);
    }
@Override
public void calcularArea() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'calcularArea'");
}
    
    
    
}
