
// Ca să importăm o clasă externă utilizăm 'import'
// Se pot importa biblioteci întregi de clase, ca spre exemplu:
// import java.util.*;
import java.util.Scanner;

public class Lectia_02_Operatori_Math {
    static Scanner userInput = new Scanner(System.in);

    /*
     * static - doar o clasă poate apela o funcție declarată static
     * Creăm un nou obiect de tip scanner, denumit userInput,
     * cu operatorul NEW și apelul constructorului Scanner
     * fluxul de intrare așteptat în cazul nostru este tastatura:
     * (System.in = keyboard input)
     */
    public static void main(String[] args) {
        System.out.print("Introduceți un număr: ");
        // La fel ca și la println, dar fără linie nouă
        /*
         * Instrucțiunea IF va executa blocul de instrucțiuni dintre {}
         * doar dacă valoarea expresiei dintre () este adevărată
         * expresia userInput.hasNextDouble() returnează adevărat
         * dacă următoarea valoare introdusă de la tastatură este de tip Double
         * Există funcții similare și pentru celelalte tipuri de date
         * hasNextInt() : introducere valori Integer
         * hasNextFloat() : introducere valori Float
         * plus altele pentru Boolean, Byte, Long, and Short
         */
        if (userInput.hasNextInt()) {
            int numberEntered = userInput.nextInt();
            /*
             * userInput.nextInt() primește ce introduce utilizatorul și salvează
             * în variabila numberEntered
             * În funcție de ce valori dorim să introducem (int, float, double
             * etc.) folosim diferite funcții:
             * nextInt() : pentru valori Integer
             * nextDouble() : pentru valori Double
             * nextFloat() : pentru valori Float
             * nextLine() : pentru valori de tip String
             * plus altele pentru Boolean, Byte, Long, și Short
             * Dacă utilizatorul introduce o valoare greșită, programul va da crash
             */
            System.out.println("Ați introdus " + numberEntered);
            // CALCULE MATEMATICE DE BAZĂ (OPERATORI matematici)
            // ADUNARE
            int numEnteredTimes2 = numberEntered + numberEntered;
            System.out.println(numberEntered + " + " + numberEntered + " = " +
                    numEnteredTimes2);
            // SCĂDERE
            int numEnteredMinus2 = numberEntered - 2;
            System.out.println(numberEntered + " - 2 " + " = " + numEnteredMinus2);
            // ÎNMULȚIRE
            int numEnteredTimesSelf = numberEntered * numberEntered;
            System.out.println(numberEntered + " * " + numberEntered + " = " +
                    numEnteredTimesSelf);
            // ÎMPĂRȚIRE
            // Fără nu folosim conversia (cast), expresia nu va fi considerată o
            // fracție, un nr. rațional
            double numEnteredDivide2 = (double) numberEntered / 2;
            System.out.println(numberEntered + " / 2 " + " = " +
                    numEnteredDivide2);
            // MODULO, % returnează restul împărțirii
            int numEnteredRemainder = numberEntered % 2;
            System.out.println(numberEntered + " % 2 " + " = " +
                    numEnteredRemainder);
            // Prescurtări cu operatori
            numberEntered += 2; // numberEntered = numberEntered + 2;
            numberEntered -= 2; // numberEntered = numberEntered - 2;
            // la fel și pentru *= /= %=
            // INCREMENTARE
            numberEntered++; // numberEntered += 1;
            // DECREMENTARE
            numberEntered--; // numberEntered -= 1;
            // Funcții MATEMATICE
            int numEnteredABS = Math.abs(numberEntered);
            // Returnează valoarea absolută (modulul)
            // MAXIMUL dintre două valori (trebuie să fie de același tip)
            int whichIsBigger = Math.max(5, 7);
            // MINIMUL dintre două valori (trebuie să fie de același tip)
            int whichIsSmaller = Math.min(5, 7);
            // RADICALUL unui număr
            double numSqrt = Math.sqrt(5.23);
            // ROTINJIRE în sus
            int numCeiling = (int) Math.ceil(5.23);
            System.out.println("ROTINJIRE în sus (Ceiling): " + numCeiling);
            // ROTINJIRE în jos
            int numFloor = (int) Math.floor(5.23);
            System.out.println("ROTINJIRE în jos (Floor): " + numFloor);
            // ROTINJIRE în funcție de fracție (de numărul rațional)
            int numRound = (int) Math.round(5.23);
            System.out.println("ROTINJIRE clasică (Rounded): " + numRound);
            // GENERARE numere aleatoare între 0 și 9
            int randomNumber = (int) (Math.random() * 10);
            System.out.println("A random number " + randomNumber);
            // dacă condiția de mai sus returnează false, se va executa codul după ELSE
        } else {
            System.out.println("Sorry, trebuie să introduci un Integer!");
        }
    }
}