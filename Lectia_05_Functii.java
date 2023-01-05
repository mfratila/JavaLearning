
// FUNCȚII (METODE) în Java
import java.util.Scanner; // Scanner este o clasă ce conține mai multe funcții

public class Lectia_05_Functii {
    // Dacă se declară o variabilă într-o funcție, ea este accesibilă
    // doar în interiorul acelei funcții,
    // astfel de variabile se numesc VARIABILE LOCALE
    static double myPI = 3.14159265;
    // Aceasta este o variabilă a clasei, disponibilă oricărei funcții din clasă
    static int randomNumber; // variabilă globală clasei
    // Orice modificare a variabilei randomNumber în interiorul oricărei funcții
    // va afecta valoarea ei globală
    // Creăm un obiect Scanner care va monitoriza introducerea de date de la
    // tastatură
    static Scanner userInput = new Scanner(System.in);
    static int contor = 1;

    // Funcția main() este o metodă ce conține tot codul executat la rularea unui
    // program
    public static void main(String[] args) {
        /*
         * Declararea unei funcții (metode):
         * 
         * modificatorAcces static tipDeDateReturnat numeleFuncției (parametri)
         * { Instrucțiuni }
         * 
         * Modificatorul de Acces: Determină cine poate executa (apela) o
         * funcție;
         * static: Atunci când se dorește execuția unei funcții ce nu face
         * parte din definiția unei clase;
         * Tipul de Date Returnat: Tipul de date al valorii returnate la
         * finalul execuției unei funcții,
         * folosiți VOID dacă nu se returnează nimic;
         * Numele Funcției: Trebuie să înceapă cu o literă și poate conține
         * litere, numere, $ sau _
         * Parametri / Argumente: Valori ce sunt transmise unei funcții
         */
        System.out.println(addThem(1, 2));
        // Funcția addThem(1,2) va fi înlocuită cu valoarea returnată după execuție
        // Demonstrație transmitere parametri prin valoare
        int d = 5;
        // Modificările asupra variabilei d în funcția tryToChange()
        // nu vor avea efect asupra valorii ei globale,
        // deoarece se transmite valoarea lui d și nu variabila însăși
        tryToChange(d);
        System.out.println("Variabila statică (locală) d = " + d);
        System.out.println("\n");
        // Exemplu 1: Ghicirea unui număr generat aleatoriu
        System.out.println(getRandomNum());
        // Generăm și afișăm valoarea variabilei randomNumber
        int guessResult = 1;
        int randomGuess = 0;
        while (guessResult != -1) {
            System.out.print("Ghiciți un număr între 0 și 20: ");
            randomGuess = userInput.nextInt();
            // Acceptă introducerea unui număr întreg
            guessResult = checkGuess(randomGuess);
        }
        System.out.println("Da, numărul generat aleator este: " + randomGuess);
        System.out.println("Ati ghicit din " + contor + " incercari!");
        System.out.println(randomNumber);
        // Valoarea aleatoare a fost modificată global de funcția getRandomNum()
    } // finalizare funcție main()
      // Exemplu 2: Adunarea a două numere transmise și returnarea rezultatului
      // public este modificator de acces, care arată că oricine poate apela (executa)
      // această funcție
      // Funcțiile Java pot returna orice tip de date primitiv,
      // sau o referință la un obiect (vom vedea în lecțiile ulterioare)

    public static int addThem(int a, int b) {
        double smallPI = 3.14159265; // Variabilă locală funcției addThem()
        // metoda compare() returnează
        // 0 în caz de egalitate,
        // -1 dacă smallPI este mai mic decât myPI,
        // 1 dacă smallPI este mai mare decât myPI.
        System.out.println(Double.compare(smallPI, myPI));
        int c = a + b;
        // return returnează o valoare ce va înlocui apelul acestei funcții
        // aici, variabila returnată trebuie să fie de tipul INT,
        // deoarece în declararea funcției addThem() am specificat că returnează valori
        // de tipul INT.
        return c;
    }

    // La definirea parametrilor/argumentelor unei funcții trebuie neapărat
    // specificate tipurile lor
    public static void tryToChange(int d) {
        d = d + 1;
        System.out.println("tryToChange d = " + d);
    }

    public static int getRandomNum() {
        // Generăm un număr aleator între 0 și 20.
        // Deoarece randomNumber este deja declarată ca variabilă globală clasei,
        // nu mai trebuie să o redeclarăm aici.
        // Dacă, totuși, am fi declarat 'int randomNumber' aici, aceasta nu ar afecta
        // variabila globală cu același nume
        randomNumber = (int) (Math.random() * 21);
        return randomNumber;
    }

    public static int checkGuess(int guess) {
        if (guess == randomNumber) {
            return -1;
        } else {
            contor++;
            return guess; // Trebuie returnată o valoare de tip INT
        }
    }
}