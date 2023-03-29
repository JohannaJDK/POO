package PiedraPapeloTijera;

import PiedraPapeloTijera.piedraPapelTijera;

public class Ejecucion {
    public static void main(String[] args) {
        piedraPapelTijera juego= new piedraPapelTijera();
        juego.iniciar();
        juego.jugar();
        juego.finalizar();
    }
}
