import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int moznost;
        boolean pok = true;

        while (pok) {
            System.out.println("1: Spojeni slov");
            System.out.println("2: Delka prvniho slova");
            System.out.println("3: Vyber velka/mala");
            System.out.println("4: Random cislo");
            System.out.println("5: Druha mocnina");
            System.out.println("6: Ukonceni");

            System.out.print("vyber moznost");
            moznost = scaner.nextInt();
            scaner.nextLine();

            switch (moznost) {
                case 1:
                    System.out.println("napis prvni slovo:");
                    String slovo1 = scaner.nextLine();
                    System.out.println("napis druhe slovo:");
                    String slovo2 = scaner.nextLine();
                    System.out.println("spojeni slov: "+ slovo1 + slovo2);
                    break;
                case 2:
                    System.out.println("napis slovo:");
                    String slovo = scaner.nextLine();
                    System.out.println("delka slova je" + slovo.length() + " pismen");
                    break;
                case 3:
                    System.out.println("napis slovo:");
                    String slovoCase = scaner.nextLine();
                    System.out.println("napis 1 pro velka pismena nebo 2 pro mala:");
                    int rozhodnuti = scaner.nextInt();
                    scaner.nextLine(); 
                    if (rozhodnuti == 1) {
                        System.out.println("velka pismena: " + slovoCase.toUpperCase());
                    } 
                    if (rozhodnuti == 2) {
                        System.out.println("mala pismena: " + slovoCase.toLowerCase());
                    }
                    break;
                case 4:
                    System.out.println("zadej prvni hranici:");
                    int hranice1 = scaner.nextInt();
                    System.out.println("zadej druhou hranici:");
                    int hranice2 = scaner.nextInt();
                    Random random = new Random();
                    int randomCislo = random.nextInt((hranice2+hranice1);
                    System.out.println("nahodne cislo: " + randomCislo);
                    break;
                case 5:
                    System.out.println("zadej cislo a vratim jeho druhou mocninu:");
                    int cislo = scaner.nextInt();
                    System.out.println("druha mocnina: " + cislo * cislo);
                    break;
                case 6:
                    pok = false;
                    System.out.println("konec programu.");
                    break;
                default:
                    System.out.println("zadej jiny cislo 1-6");
                    break;
            }
        }

        scaner.close();
    }
}
