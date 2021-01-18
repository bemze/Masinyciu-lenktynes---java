package masinyciu.lenktynes;

import java.util.Scanner;

public class MasinyciuLenktynes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========Starto linija======");
        System.out.println("Duokite starta (bet koks sk + enter)");
        int[] masinos = new int[8];    
        Masina[] race = {
                new Masina("Zaporozietis", 140),
                new Masina("Moskvich", 160),
                new Masina("Zigulys", 200),
                new Masina("Volvo", 220),
                new SportineMasina("Ferrari", 300),
                new SportineMasina("Bugatti", 320)
    };
//        int start = sc.nextInt();

        System.out.println("       Vyksta lenktynes      ");
        System.out.println();
        System.out.println();

        //kas kiek komentuoti, kuri pirmauja masina
        int tarpinis = 100;
        boolean go = true;
        while (go) {

            for (int j = 0; j < race.length; j++) {
                //reikia prideti spoileri
                if (race[j] instanceof SportineMasina){
                    if(Math.random() < 0.5) {
                        //ziureti i masyva ir kaip i sportine masina
                        ((SportineMasina) race[j]).pakeltiSpoileri();
                    }
                }
                double random = Math.random();
                if (random < 0.3) {
                    race[j].stabdyk((int) Math.random() * 5 + 1);
                } else if (random < 0.8) {
                    race[j].gazuok((int) Math.random() * 10 + 1);
                }
               race[j].vaziuok();
            }
            boolean tarpinisRez = false;
            int pirmaujaMasina = 0;//cia masina
            int nuvaziavoKm = 0;
            for (int i = 0; i < race.length; i++) {
                //saugom pacia masina masyve
                if (race[i].getKelias() > nuvaziavoKm) {
                    pirmaujaMasina = i;
                    nuvaziavoKm = race[i].getKelias();
                }
                if (race[i].getKelias() >= tarpinis) {
                    tarpinisRez = true;
                    tarpinis += 100;
                }
            }
            if (tarpinisRez) {
                for (int i = 0; i < race.length; i++) {
                    System.out.print(race[i].getKelias() + "\t ");
                }

                System.out.println();
                System.out.println("Pirmauja " + " " + race[pirmaujaMasina]);
                System.out.println();
                System.out.println();
            }
            //ar pasieke masinos finisa
            for (int i = 0; i < race.length; i++) {
                int finisas = 1000;

                if (race[i].getKelias() >= finisas) {
                    System.out.println();
                    System.out.println("Laimejo " + race[pirmaujaMasina]);
                    System.out.println();
                    go = false;
                    break;
                }
            }
        }
        //masinu rusiavimas
        for (int i = 0; i < race.length - 1; i++) {
            for (int j = i + 1; j < race.length; j++) {
                if (race[i].getKelias() < race[j].getKelias()) {
                    Masina laikina =race[j];
                    race[j] = race[i];
                    race[i] = laikina;

                }
            }
        }
        //ispausinam visas masina
        System.out.println("========Finisas======");
                for (int i = 0; i < race.length; i++) {
            System.out.println( race[i]);
            

        }
    }
}
