package PiedraPapeloTijera;

import java.util.Random;
import java.util.Scanner;

public class piedraPapelTijera implements Juegos { 
    //ATRIBUTOS
    private int Tiros;
    private int TiroAleatorio;
    private String Jugador;

    //Instancia para capturar los datos
    Scanner leer = new Scanner(System.in);

    //Solicitar los datos
    public void iniciar(){
    System.out.println(" \nDigite su nombre: ");
    Jugador=leer.next();
    }
    public void jugar(){
    System.out.println(Jugador + " Escoja una opción: (1:piedra 2:papel 3:tijera)");
    Tiros=leer.nextInt();
    Random aleatorio=new Random();
    TiroAleatorio=aleatorio.nextInt(3)+1;
    System.out.println(" Esta cargando la opcion escogida.");
    }
    public void finalizar(){
        if(TiroAleatorio==1 && Tiros==1){
            System.out.println(Jugador + " Su opción es: " + Tiros + "¡EMPATASTE! y el tiro de la maquina es: " +TiroAleatorio);
        }
        
        else if(TiroAleatorio==2 && Tiros==2){
            System.out.println(Jugador + " Su opción es: " + Tiros + "¡EMPATASTE! y el tiro de la maquina es: " +TiroAleatorio);
        }
        
        else if(TiroAleatorio==3 && Tiros==3){
            System.out.println(Jugador + " Su opción es: " + Tiros + "¡EMPATASTE! y el tiro de la maquina es " +TiroAleatorio);
        }
        
        else if(TiroAleatorio==2 && Tiros==1){
            System.out.println(Jugador + " Su opción es: " + Tiros + "¡HAS PERDIDO,SIGUE INTENTENDO!, el tiro de la maquina es: " +TiroAleatorio);
        }
        
        else if(TiroAleatorio==3 && Tiros==2){
            System.out.println(Jugador + " Su opción fue: " + Tiros + "¡HAS PERDIDO,SIGUE INTENTENDO!, el tiro de la maquina es: " +TiroAleatorio);
        }
        
        else if(TiroAleatorio==1 && Tiros==3){
            System.out.println(Jugador + " Su opción fue: " + Tiros + "¡HAS PERDIDO,SIGUE INTENTENDO!, el tiro de la maquina es: " +TiroAleatorio);
        }
        
        else if(TiroAleatorio==3 && Tiros==1){
            System.out.println(Jugador + " Su opción fue: " + Tiros + "¡EXCELENTE, HAS GANADO y el tiro de la maquina es: " +TiroAleatorio);
        }
        
        else if(TiroAleatorio==1 && Tiros==2){
            System.out.println(Jugador + " Su opción fue: " + Tiros + "¡EXCELENTE, HAS GANADO y el tiro de la maquina es: " +TiroAleatorio);
        }
        
        else if(TiroAleatorio==2 && Tiros==3){
            System.out.println(Jugador + " Su opción fue: " + Tiros + "¡EXCELENTE, HAS GANADO y el tiro de la maquina es: " +TiroAleatorio);
        }
}
}
