import java.util.Random;

public class Practica03Corregido {

    public static void main(String args[]) {
        int cartaj1;
        int cartaj2;
        int paloj1;
        int paloj2;
        int puntajej1;
        int puntajej2;
        puntajej1 = 0;
        puntajej2 = 0;
        Random rand = new Random();

        System.out.println("RONDA 1:");
        cartaj1 = rand.nextInt(12) + 1;
        paloj1 = rand.nextInt(4) + 1;
        System.out.println("Carta Jugador 1: " + cartaj1 + " de " + paloj1);
        cartaj2 = rand.nextInt(12) + 1;
        paloj2 = rand.nextInt(4) + 1;
        System.out.println("Carta Jugador 2: " + cartaj2 + " de " + paloj2);
        if (cartaj1 > cartaj2) {
            puntajej1 = (cartaj1 + cartaj2);
        } else {
            if (cartaj1 < cartaj2) {
                puntajej2 = (cartaj1 + cartaj2);
            } else {
                // Son cartas de igual valor, gana el que tenga oro
                if (paloj1 == 4) {
                    puntajej1 = (cartaj1 + cartaj2);
                } else {
                    if (paloj2 == 4) {
                        puntajej2 = (cartaj1 + cartaj2);
                    } else {
                        puntajej1 = cartaj1;
                        puntajej2 = cartaj2;
                    }
                }
            }
        }
        cartaj1 = rand.nextInt(12) + 1;
        paloj1 = rand.nextInt(4) + 1;
        System.out.println("Carta Jugador 1: " + cartaj1 + " de " + paloj1);
        cartaj2 = rand.nextInt(12) + 1;
        paloj2 = rand.nextInt(4) + 1;
        System.out.println("Carta Jugador 2: " + cartaj2 + " de " + paloj2);
        // NOTA: para la segunda ronda "acumulamos" los puntajes con los de la primer ronda
        if (cartaj1 > cartaj2) {
            puntajej1 = puntajej1 + (cartaj1 + cartaj2);
        } else {
            if (cartaj1 < cartaj2) {
                puntajej2 = puntajej2 + (cartaj1 + cartaj2);
            } else {
                if (paloj1 == 4) {
                    puntajej1 = puntajej1 + (cartaj1 + cartaj2);
                } else {
                    if (paloj2 == 4) {
                        puntajej2 = puntajej2 + (cartaj1 + cartaj2);
                    } else {
                        puntajej1 = puntajej1 + cartaj1;
                        puntajej2 = puntajej2 + cartaj2;
                    }
                }
            }
        }
        if (puntajej1 > puntajej2) {
            System.out.println("Gana Jugador 1 con: " + puntajej1 + " puntos.");
        } else {
            if (puntajej1 < puntajej2) {
                System.out.println("Gana Jugador 2 con: " + puntajej2 + " puntos.");
            } else {
                System.out.println("Empate!!! con: " + puntajej1 + " puntos.");
            }
        }
    }

}
