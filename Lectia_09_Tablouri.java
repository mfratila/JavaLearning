
// TABLOURI uni- și multi-dimensionale (ARRAYS)
// biblioteca din Java se numește Arrays
import java.util.Arrays;

public class Lectia_09_Tablouri {
    public static void main(String[] args) {
        // Un tablou reprezintă o variabilă ce poate stoca mai multe valori
        // Tabloul poate fi privit ca o cutie plină cu alte cutii
        // Fiecare cutie conține un număr pe post de index,
        // prin care se accesează conținutul (valoarea) cutiei
        /*
         * Reguli:
         * Orice Tablou nu poate conține decât valori de același tip de date
         * Dimensiunea unui Tablou rămâne aceeași cu cea setată la definirea
         * lui
         * Orice Tablou este un obiect, are proprietăți și funcții (metode)
         */
        // TABLOURI UNIDIMENSIONALE
        /**
         * Formula de declarare:
         * tipDate[] numeTablou;
         */
        int[] unTablou; // în C++ int unTablou[10];
        // Forumula de definire (creare efectivă):
        /**
         * tipDate[] numeTablou = new tipDate[dimensiuneTablou];
         */
        int[] tablouCuNumere = new int[10];
        // Se pot adăuga valori în tablou prin multe metode
        // Individual, câte o valoare
        // Mai întâi se definește tabloul, specificându-i dimensiunea
        unTablou = new int[20];
        unTablou[1] = 2;
        // Sau se poate defini tabloul cu tot cu valori inițiale
        String[] tablouCuStringuri = { "Doar", "Cuvinte", "Aleatoare" };
        char[] tablouCaractere = { 'M', 'N', 'P' };
        /**
         * sau:
         * int[] nrint = {2, 7, 10, 5, 9};
         */
        System.out.println("Tablou cu string-uri:");
        int z = 0;
        do {
            System.out.print(tablouCuStringuri[z] + " ");
            z++;
        } while (z < tablouCuStringuri.length);
        System.out.println("\n");
        // Sau se pot adăuga valori utilizând o buclă
        // proprietatea "length" din expresia "numeTablou.length"
        // returnează numărul de elemente, dimensiunea tabloului
        for (int i = 0; i < tablouCuNumere.length; i++) {
            tablouCuNumere[i] = (int) Math.pow(2, i);
        }
        // Exemplu:
        // Desenăm 41 liniuțe, - , pe ecran
        System.out.println("Un tablou unidimensional:");
        int k = 1;
        while (k <= 41) {
            System.out.print('-');
            k++;
        }
        System.out.println();
        // Afișarea valorilor unui tablou cu instr. FOR
        for (int j = 0; j < tablouCuNumere.length; j++) {
            System.out.print("| " + tablouCuNumere[j] + " ");
        }
        System.out.println("|");
        // Desenăm, din nou, 41 liniuțe pe ecran
        k = 1;
        while (k <= 41) {
            System.out.print('-');
            k++;
        }
        System.out.println("\n");
        // TABLOURI MULTIDIMENSIONALE
        // Pentru a pune un Array în alt Array,
        // se mai adaugă un set de [] la declarare
        String[][] Matrice = new String[10][10];
        // Adăugarea de valori într-un tablou multidimensional
        for (int i = 0; i < Matrice.length; i++) {
            // Pentru a accesa dimensiunea unui Array în Array,
            // trebuie specificat indexul primului Array, ex. [i]
            for (int j = 0; j < Matrice[i].length; j++) {
                Matrice[i][j] = i + "," + j;
            }
        }
        // Desenăm 61 liniuțe pe ecran
        System.out.println("un tablou bidimensional:");
        k = 1;
        while (k <= 61) {
            System.out.print('-');
            k++;
        }
        System.out.println();
        // Afișăm valorile Matricii,
        // în acest caz, indecșii i și j, separați de o virgulă
        for (int i = 0; i < Matrice.length; i++) {
            for (int j = 0; j < Matrice[i].length; j++) {
                System.out.print("| " + Matrice[i][j] + " ");
            }
            System.out.println("|");
        }
        // Desenăm alte 61 liniuțe pe ecran,
        k = 1;
        while (k <= 61) {
            System.out.print('-');
            k++;
        }
        System.out.println();
        // Instriucțiunea FOR AVANSATĂ (îmbunătățită)
        // Forma standard de utilizare este:
        /**
         * for(tipDateElement varTemporar : numeTablou)
         */
        // Ex: afișarea elementelor (valorilor) din tabloul tablouCuNumere
        System.out.println("tablouCuNumere:");
        for (int val : tablouCuNumere) {
            System.out.print(val + " ");
        }
        System.out.println("\n");
        // Pentru tablourile multidimensionale se urmează formula:
        /**
         * for(dataType[] varForRow : arrayName)
         */
        // Ex: afișarea elementelor din tabloul Matrice
        System.out.println("Matrice afișată cu instr. FOR avansată:");
        for (String[] valoriPeRanduri : Matrice) {
            // for(tipDateElement varPentruColoane : varPentruRânduri)
            for (String valoriPeColoane : valoriPeRanduri) {
                System.out.print("| " + valoriPeColoane + " ");
            }
            System.out.println("|");
        }
        System.out.println();
        // FUNCȚII predefinite pentru obiectele de tip Array
        // se găsesc în biblioteca java.util.Arrays
        // COPIERE. Un tablou se poate copia în mai multe feluri
        // Cu funcția copyOf() :
        /**
         * Arrays.copyOf(tabloulSursă, numărElementeDeCopiat);
         */
        // Exemplu:
        // tablouNou preia primele 5 elemente din tablouCuNumere
        int[] tablouNou = Arrays.copyOf(tablouCuNumere, 5);
        System.out.println("tablouNou, cu elemente copiate din tablouCuNumere:");
        for (int val : tablouNou) {
            System.out.print(val + " ");
        }
        System.out.println("\n");
        // De asemenea, se poate copia un nr. de elemente între două indexuri,
        // cu funcția copyOfRange() :
        /**
         * Exemplu:
         * int[] tablouNou = Arrays.copyOfRange(tablouCuNumere, 2, 5);
         */
        // Funcția toString() se poate utiliza la afișarea unui întreg tablou,
        // ea convertește valorile tabloului din orice tip la String
        System.out.println("Afișare tablouNou cu toString():");
        System.out.println(Arrays.toString(tablouNou));
        System.out.println();
        // Pentru definirea inițială a unui tablou (inițializare),
        // se folosește funcția fill() din aceeași bibliotecă
        /**
         * Arrays.fill(numeTablou, valoareInițială);
         * 
         * valoareInițială trebuie să fie de același tip de date cu tabloul
         */
        // Exemplu: umplerea unui tablou cu o aceeași val. întreagă
        int[] altTablou = new int[30];
        Arrays.fill(altTablou, 2);
        // afișarea:
        System.out.println("altTablou:");
        for (int val : altTablou)
            System.out.print(val + ", ");
        System.out.println("\n");
        // Umplerea inițială a unui tablou multidimensional
        char[][] gameBoard = new char[10][10]; // creare
        for (char[] row : gameBoard) {
            Arrays.fill(row, '*'); // umplere
        }
        System.out.println("Un tablou umplut cu steluțe (gameBoard):");
        for (char[] row : gameBoard) {
            for (char elem : row)
                System.out.print(elem + " ");
            System.out.println();
        }
        System.out.println();
        // Funcția sort() ordonează (sortează) un tablou
        int[] tablouDeSortat = new int[10];
        // Tabloul inițializat cu numere generate aleator
        for (int i = 0; i < 10; i++) {
            tablouDeSortat[i] = (int) (Math.random() * 60);
        }
        System.out.println("Tablou generat aleator:");
        System.out.println(Arrays.toString(tablouDeSortat));
        System.out.println();
        // Sortăm tabloul în ordine crescătoare (ascendentă, alfabetică etc.)
        Arrays.sort(tablouDeSortat);
        // afișarea tabloului sortat
        System.out.println("Tablou generat aleator, dar SORTAT:");
        System.out.println(Arrays.toString(tablouDeSortat));
        System.out.println();
        // Funcția binarySearch() returnează indexul unui element,
        // iar dacă nu-l găsește, va returna un număr negativ
        int cautaElement = Arrays.binarySearch(tablouDeSortat, 50);
        System.out.println(50 + " are indexul " + cautaElement);
    } // finalizare main()
    /**
     * Temă de lucru:
     * Să se genereze o matrice n*n cu numere întregi aleatoare
     * între 0 și 20 și să se efectueze următoarele operațiuni:
     * a) să se afișeze matricea frumos
     * b) să se calculeze elementul min și max din matrice
     * c) să se ordoneze crescător fiece linie (rând) din matrice
     * d) să se calculeze suma elementelor de sub, respectiv deasupra diagonalei
     * principale
     * e) să se umple zona de sub diagonala secundară cu valori nule (zerouri)
     * Observație: utilizați numaidecât și instrucțiunea FOR avansată
     */
} // finalizare clas
