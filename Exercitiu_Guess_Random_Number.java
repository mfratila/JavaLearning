import java.util.Scanner;

public class Exercitiu_Guess_Random_Number {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        int nrGenerat = (int) (Math.random() * 10); // generare nr aleator intre 0 si 10
        System.out.println(nrGenerat); // for debugging
        int TriesLeft = 3; // initializare nr de incercari ramase
        int guess; // declarare variabila ce va contine datele introduse de la tastatura

        String maimic = "Numarul introdus e mai mic!";
        String maimare = "Numarul introdus e mai mare!";
        String text = "";

        System.out.println("S-a generat un numar aleator intre 0 si 10!");

        do {
            System.out.print("Incercari ramase: " + TriesLeft + ". Introduceti de la tastatura numarul dorit: ");
            guess = userInput.nextInt();
            if (guess != nrGenerat) {
                TriesLeft--;
                text = (nrGenerat > guess) ? maimare : maimic;
                System.out.println(text); 
            }
            else {
                System.out.println("Felicitari! Ai ghicit numarul generat " + nrGenerat +"!");
                break;
            }

        } while(TriesLeft >= 0);
    }
}
 