//Creacion del paquete
package SALUD;
//Creación de la subclase extensión de la clase persona
public class Empleado extends Persona {

private static final int Valorhorario = 0;
//Atributos propios de la subclase
private String   Cargo;
private int      Valorhora;
private int      Horastrabajadas;
private String   Departamento;


//creamos el metodo constructor y empleamos los atributos de la super clase.
public Empleado(String TipoDoc,int Documento,String Nombre,String Apellido, int Peso,int Estatura, int Edad,String Sexo,double PesoActual,  String Cargo,int Valorhora,int Horastrabajadas,
    String Departamento){
super(
    TipoDoc,
    Documento, 
    Nombre, 
    Apellido, 
    Peso, 
    Estatura, 
    Edad, 
    Sexo, 
    PesoActual);
this.Cargo=Cargo; 
this.Valorhora=Valorhora; 
this.Horastrabajadas=Horastrabajadas; 
this.Departamento=Departamento;

}


public Empleado(String TipoDoc, int Documento, String Nombre, String Apellido, double Peso, double Estatura, int Edad,
        String Sexo, double PesoActual) {
}


//creación de metodos de la subclase
   public double calcularHonorarios(){
   int Honorarios =Valorhorario*Horastrabajadas;
   double Reteica = Honorarios*0.00966;
   return Honorarios-Reteica;


   }


//imprimir lo que vera el usuario

public void imprimirInfo() {
    System.out.println("Tipo de documento"+getTipoDoc());
    System.out.println("Número de documento"+getDocumento());
    System.out.println("Nombres: "+getNombre());
    System.out.println("Apellidos: "+getApellido());
    System.out.println("Cargo: "+Cargo);
    System.out.println("Horas trabjadas: "+Horastrabajadas);
    System.out.println("Valor por hora: "+Valorhorario);
    System.out.println("Total a pagar: "+calcularHonorarios());
    
}
}