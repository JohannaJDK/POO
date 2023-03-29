//Creamos paquete Salud
package SALUD;
//importamos la clase Scanner 
import java.util.Scanner;
//Creamos la clase Scanner

public class inicio {
  
    public static void main(String[] args) {
        
         Scanner leer= new Scanner(System.in);
    
        String TipoDoc;
        int Documento;
        String Nombre;
        String Apellido; 
        double Peso;
        double Estatura;
        int Edad;
        String Sexo;
        double PesoActual;

        Persona persona =new Persona();

        System.out.println("Digite el tipo de Documento");
        TipoDoc=leer.next();

        System.out.println("Digite el número Documento");
        Documento=leer.nextInt();

        System.out.println("Digite su Nombre");
        Nombre=leer.next();

        System.out.println("Digite su Apellido");
        Apellido=leer.next();

       
        System.out.println("Digite el Peso");
        Peso=leer.nextDouble();
            
      
        System.out.println("Digite la Estatura");
        Estatura=leer.nextDouble();
        
        System.out.println("Digite la Edad");
        Edad=leer.nextInt();

        System.out.println("Digite el tipo de Sexo F/M");
        Sexo=leer.next();
        
        PesoActual=persona.calcularImc(Peso, Estatura);

       
        if(PesoActual<20){
            System.out.println("El peso es bajo");
        }else if(PesoActual>=20 && PesoActual<=25){
            System.out.println("El peso que tienes es el ideal");
        }else if(PesoActual>25){
            System.out.println("Sobrepeso ");
        }
        System.out.println("Su peso es: "+PesoActual);


        Empleado empleo=new Empleado(TipoDoc, Documento, Nombre, Apellido, Peso, Estatura, Edad, Sexo, PesoActual );

        persona.PedirDatos();
        empleo.calcularHonorarios();
        empleo.imprimirInfo();


        }
        
        
    }
