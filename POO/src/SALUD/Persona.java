package SALUD;

import java.util.Scanner;


public class Persona {

     
    private String TipoDoc;
    private int Documento;
    private String Nombre;
    private String Apellido; 
    private double Peso;
    private double Estatura;
    private int Edad;
    private String Sexo;
    private double PesoActual;

    //METODO CONSTRUCTOR
    public Persona(String TipoDoc2, int Documento2, String Nombre2, String Apellido2, int Peso2, int Estatura2,
            int Edad2, String Sexo2, double PesoActual2) {

    //METODO ACCESOR
    }

    public Persona() {}
    
    public String getTipoDoc() {
        return TipoDoc;
    }
    public void setTipoDoc(String TipoDoc) {
        this.TipoDoc = TipoDoc;
    }
    public int getDocumento() {
        return Documento;
    }
    public void setDocumento(int Documento) {
        this.Documento = Documento;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    public double getPeso() {
        return Peso;
    }
    public void setPeso(int Peso) {
        this.Peso = Peso;
    }
    public double getEstatura() {
        return Estatura;
    }
    public void setEstatura(int Estatura) {
        this.Estatura = Estatura;
    }
    public int getEdad() {
        return Edad;
    }
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    public String getSexo() {
        return Sexo;
    }
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    public double getPesoActual() {
        return PesoActual;
    }
    public void setPesoActual(int PesoActual) {
        this.PesoActual = PesoActual;
    }


//creamos el metodo pedir datos 
    public void PedirDatos(){
        
        Scanner leer= new Scanner(System.in);

        System.out.println("Digite el tipo de Documento");
        TipoDoc=leer.next();

        System.out.println("Digite el número Documento");
        Documento=leer.nextInt();

        System.out.println("Digite su Nombre");
        Nombre=leer.next();

        System.out.println("Digite su Apellido");
        Apellido=leer.next();


        System.out.println("Digite la Edad");
        Edad=leer.nextInt();

        System.out.println("Digite el tipo de Sexo");
        Sexo=leer.next();
    }

   
    public void mostrarPersona(){

        System.out.println("tipo documento: "+TipoDoc);
        
        System.out.println("documento: "+Documento);

        System.out.println("nombre: "+Nombre);

        System.out.println("apellido: "+Apellido);
       
        System.out.println("peso: "+Peso);
    
        System.out.println("estatura: "+Estatura);
    
        System.out.println("edad: "+Edad);

        System.out.println("sexo: "+Sexo);
    }

   
    public double calcularImc(double Peso, double Estatura){
        PesoActual=(Estatura)/(Peso)*2;
        return PesoActual;
    }
    
    public void calcularImc(){
        
    }

  
    private void mayorEdad() {
        if (Edad>17){
            System.out.println("ERES MAYOR DE EDAD");
        }else if(Edad<=17){
            System.out.println("ERES MENOR DE EDAD");
        }
        
    }
    
}


