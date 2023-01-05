import java.util.Scanner;

public class Exercitiu_Meniu_Operatii {
    static Scanner userInput = new Scanner(System.in);

    static int Adunare (int x, int y) {
        int rez = x + y;
        return rez;
    }

    static int Scadere (int x, int y) {
        int rez = x - y;
        return rez;
    }

    static int Inmultire (int x, int y) {
        int rez = x * y;
        return rez;
    }

    static int Impartire (int x, int y) {
        int rez = (int) (x / y);
        return rez;
    }

    static int Modulo (int x, int y) { 
        int rez = x % y;
        return rez;
    }

    static int promptChoice() {
        int ch;
            ch = userInput.nextInt();
            if (ch > 0 && ch < 9)
            return ch;

        else {
            System.out.print("Introduceti o valoare intre 1 si 8: ");
            return promptChoice();
        }
    }

    public static void main(String[] args) {
        int choice;
        int val1, val2;

        do {
            System.out.println(" 1.Adunare \n 2.Scadere \n 3.Inmultire \n 4.Impartire \n" +
                               " 5.Modulo \n 6.Min \n 7.Max \n 8.Iesire din program");
            System.out.print("Introduceti de la tastatura numarul operatiei dorite a fii efectuate: ");
            choice = promptChoice();
       // meniu cu operatii aritmetice
            switch(choice) {

                case 1: 
                        // adunare
                    System.out.println("Intoduceti prima valoare pentru adunare: ");
                    val1 = userInput.nextInt();
                    System.out.println("Intoduceti a doua valoare pentru adunare: ");
                    val2 = userInput.nextInt();
                    System.out.println("Rezultatul adunarii este: " + Adunare(val1, val2) + "\n");
                    break; 
                case 2:
                        // scadere  
                    System.out.println("Intoduceti prima valoare pentru scadere: ");
                    val1 = userInput.nextInt();
                    System.out.println("Intoduceti a doua valoare pentru scadere: ");
                    val2 = userInput.nextInt();
                    System.out.println("Rezultatul scaderii este: " + Scadere(val1, val2) + "\n");
                    break;
                case 3:
                        // inmultire
                    System.out.println("Intoduceti prima valoare pentru inmultire: ");
                    val1 = userInput.nextInt();
                    System.out.println("Intoduceti a doua valoare pentru inmultire: ");
                    val2 = userInput.nextInt();
                    System.out.println("Rezultatul inmultirii este: " + Inmultire(val1, val2) + "\n");
                    break;
                case 4:
                        // impartire
                    System.out.println("Intoduceti prima valoare pentru impartire: ");
                    val1 = userInput.nextInt();
                    System.out.println("Intoduceti a doua valoare pentru impartire: ");
                     val2 = userInput.nextInt();
                     System.out.println("Rezultatul impartirii este: " + Impartire(val1, val2) + "\n");
                     break;
                case 5:
                        // modulo
                     System.out.println("Intoduceti prima valoare pentru modulo: ");
                     val1 = userInput.nextInt();
                     System.out.println("Intoduceti a doua valoare pentru modulo: ");
                     val2 = userInput.nextInt();
                     System.out.println("Rezultatul modulo este: " + Modulo(val1, val2) + "\n");
                     break;
                case 6:
                        //min
                        System.out.println("Intoduceti prima valoare pentru min: ");
                        val1 = userInput.nextInt();
                        System.out.println("Intoduceti a doua valoare pentru min: ");
                        val2 = userInput.nextInt();
                        System.out.println("Rezultatul min este: " + Math.min(val1, val2) + "\n");
                        break;
                case 7:
                        //max
                        System.out.println("Intoduceti prima valoare pentru max: ");
                        val1 = userInput.nextInt();
                        System.out.println("Intoduceti a doua valoare pentru max: ");
                        val2 = userInput.nextInt();
                        System.out.println("Rezultatul max este: " + Math.max(val1, val2) + "\n");
                        break;
            }
        } while (choice < 8);
    }
}
