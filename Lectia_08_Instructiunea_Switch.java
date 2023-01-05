
// Studiu de caz:
// Calculul sumelor pare și impare dintr-o serie de numere
import java.util.Scanner;

public class Lectia_08_Instructiunea_Switch {
    public static Scanner userInput = new Scanner(System.in);

    // definire intrare date de la tastatură
    public static void main(String[] args) {
        short n;
        System.out.print("Dati un număr: ");
        n = userInput.nextShort();// se așteaptă introducerea unui
        // număr întreg scurt (short int)
        short spar = 0, simpar = 0;
        for (int i = 0; i <= n; i++) {
            switch (i % 2) { // variabila de selecție din SWITCH
                case 0: // primul caz de execuție
                    spar += i;
                    break;
                case 1: // al doilea caz de execuție
                    simpar += i;
                    break;
                default: // cazul implicit de execuție
                    System.out.println("Error!");
            }
        }
        System.out.println("Suma pare=" + spar);
        System.out.println("Suma impare=" + simpar);
    }
}