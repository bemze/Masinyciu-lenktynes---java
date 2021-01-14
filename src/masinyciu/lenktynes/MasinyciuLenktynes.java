package masinyciu.lenktynes;

import java.util.Scanner;

public class MasinyciuLenktynes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========Starto linija======");
        System.out.println("Duokite starta (bet koks sk + enter)");
        int[] masinos = new int[8];        
        int start = sc.nextInt();

        System.out.println("       Vyksta lenktynes      ");
        System.out.println();
        System.out.println();

        
        int tarpinis = 100;
        boolean go = true;
        while (go) {

            for (int j = 0; j < masinos.length; j++) {
                masinos[j] += Math.random() * 10 + 1;
            }
            boolean tarpinisRez = false;
            int pirmaujaMasina = 0;
            int nuvaziavoKm = 0;
            for (int i = 0; i < masinos.length; i++) {
                if (masinos[i] > nuvaziavoKm) {
                    pirmaujaMasina = i + 1;
                    nuvaziavoKm = masinos[i];
                }
                if (masinos[i] >= tarpinis) {
                    tarpinisRez = true;
                    tarpinis += 100;
                }
            }
            if (tarpinisRez) {
                for (int i = 0; i < masinos.length; i++) {
                    System.out.print(masinos[i] + "\t ");
                }

                System.out.println();
                System.out.println("Pirmauja masina nr: " + pirmaujaMasina + " nuvaziavusi: " + nuvaziavoKm + " km");
                System.out.println();
                System.out.println();
            }
            for (int i = 0; i < masinos.length; i++) {
                int finisas = 1000;

                if (masinos[i] >= finisas) {
                    System.out.println();
                    System.out.println("Laimejo " + (i + 1) + " masina, nuvaziavusi " + masinos[i] + " km");
                    System.out.println();
                    go = false;
                    break;
                }
            }
        }
        for (int i = 0; i < masinos.length - 1; i++) {
            for (int j = i + 1; j < masinos.length; j++) {
                if (masinos[i] < masinos[j]) {
                    int laikina = masinos[j];
                    masinos[j] = masinos[i];
                    masinos[i] = laikina;

                }
            }
        }
        System.out.println("========Finisas======");
                for (int i = 0; i < masinos.length; i++) {
            System.out.println(masinos[i]);

        }
    }
}
