package FigurasGeometricas;
import java.util.Scanner;

public class Triangulo {
 //atributos
 float Base;
 float Altura;
 float D2;

 //metodo constructor
 public Triangulo(float Base, float Altura, float D2) {
     this.Base = Base;
     this.Altura = Altura;
     this.D2 = D2 ;
 }
 //metodos accesores
 public Triangulo() {
}

public float getbase() {
     return Base;
 }
 public float getaltura() {
    return Altura;
}
public float getd2() {
    return D2;
}

 public void setbase(float Base) {
     this.Base = Base;
 }
 public void setaltura(float Altura) {
    this.Altura = Altura;
}
public void setd2(float D2) {
    this.D2 = D2;
}
//métodos propios
//métodos propios

//creamos el metodo pedir datos 
public void pedirDatosTriangulo(){
        
Scanner leer = new Scanner(System.in);

System.out.println("Digite el valor de la base");
Base=leer.nextFloat();

System.out.println("Digite la altura");
Altura= leer.nextFloat();
}
    
    


 public void calcularAreaTriangulo(){
 float AreaTriangulo;
 AreaTriangulo=Base*Altura/2/2;
 System.out.println("El area del triangulo es: "+AreaTriangulo);
 }
 
    
}
