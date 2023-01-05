
// Java looping - Instrucțiuni repetitive
import java.util.Scanner;

// biblioteca Scanner pentru captarea intrărilor de date de la utilizator
public class Lectia_04_Instructiuni_Repetitive {
    // Creare un obiect Scanner pentru monitorizarea datelor de intrare
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * Bucla WHILE : Se va executa blocul de instrucțiuni din {}
         * până când condiția din () nu mai este adevărată
         */
        // buclele WHILE trebuie să conțină un contor inițializat înaintea buclei
        int i = 1;
        while (i < 20) {
            // Instrucțiunile CONTINUE și BREAK în cadrul buclelor
            // Ex., folosim „continue” ca să sărim peste afișarea cifrei 3
            if (i == 3) {
                i += 2; // contorul trebuie modificat când folosim „continue”
                continue; // sărim doar peste o anumită iterație
            }
            System.out.println(i);
            i++;
            // Afișarea doar a numerelor impare
            if ((i % 2) == 0) {
                i++;
            }
            // Instrucțiunea BREAK
            // Ex., dacă i > 10 ieșim din buclă
            if (i > 10) {
                break; // Forțează programul să părăsească bucla prematur
            }
        } // end WHILE (i<20)
        /*
         * Cod care calculează valoarea lui PI
         */
        double myPi = 4.0; // Valoare de start pentru PI
        // Valoarea de start pentru contorul buclei
        double j = 3.0;
        // Bucla WHILE de calcul a valorii PI
        while (j < 11) {
            // Calculăm valoarea lui PI cu formula:
            // PI = 4 - 4/3 + 4/5 - 4/7...
            myPi = myPi - (4 / j) + (4 / (j + 2));
            j += 4;
            System.out.println(myPi);
        }
        System.out.println("Valoarea lui PI: " + Math.PI);
        /*
         * Execuție buclă WHILE până când utilizatorul iese
         */
        String contYorN = "Y";
        int h = 1;
        // funcția „equalsIgnoreCase” verifică dacă variabila String contYorN are
        // valoarea 'y' sau 'Y'
        while (contYorN.equalsIgnoreCase("y")) {
            System.out.println(h);
            System.out.print("Continuați y or n?");
            contYorN = userInput.nextLine(); // Așteaptă un string de la utilizator
            h++;
        }
        /*
         * Bucla DO-WHILE
         * Se folosește când se dorește execuția cel puțin odată a codului din {}
         * Se execută codul, iar apoi, prin clauza WHILE,
         * Java verifică dacă-l mai executăm mai departe
         */
        // contorul necesar buclei DO-WHILE
        // trebuie inițializat înaintea evaluării expresiei prin WHILE
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 10); // Numărăm de la 1 la 10
        /*
         * Bucla FOR
         * sintaxa:
         * for( inițializare contor; condiție; modificare contor)
         */
        for (int r = 10; r >= 1; r--) {
            System.out.println(r);
        }
        // Variabila 'r' nu este accesibilă în afara FOR-ului de mai sus
        int m, n; // Nu e obligatoriu să declarăm variabilele în interiorul buclelor FOR
        // De asemenea, se pot utiliza multiple variabile în bucla FOR
        for (m = 1, n = 2; m <= 9; m += 2, n += 2) {
            System.out.println(m + "\n" + n);
        }
        // Buclele WHILE, DO-WHILE și FOR se pot combina între ele
        // La lecția despre vectori (ARRAYs) vom discuta mai multe
    }
}