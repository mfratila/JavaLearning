public class Lectia_03_Operatori_Relationali_Logici {
    public static void main(String[] args) {
        // Generare numar între 0 și 50
        int randomNumber = (int) (Math.random() * 50);
        /*
         * Operatori Relaționali:
         * Java conține 6 operatori relaționali
         * > : Mai mare (Greater Than)
         * < : Mai mic (Less Than)
         * == : Egal (Equal To)
         * != : Diferit (Not Equal To)
         * >= : Mai mare sau egal (Greater Than Or Equal To)
         * <= : Mai mic sau egal (Less Than Or Equal To)
         */
        // Instrucțiunea IF cu operatori relaționali
        if (randomNumber < 25) {
            System.out.println("The random number is less than 25");
        } else if (randomNumber > 25) {
            System.out.println("The random number is greater than 25");
        } else if (randomNumber == 25) {
            System.out.println("The random number is equal to 25");
        } else if (randomNumber != 15) {
            System.out.println("The random number is not equal to 15");
        } else if (randomNumber <= 25) {
            System.out.println("The random number is less than or equal to 25");
        } else if (randomNumber >= 25) {
            System.out.println("The random number is greater than or equal to 25");
        }
        // Dacă nici una din condițiile de mai sus nu sunt adevărate,
        // atunci se execută acest din urmă ELSE, adică afișarea numărului generat
        else {
            System.out.println("Numărul generat este " + randomNumber);
        }
        // Afișarea numărului generat în afara IF-urilor
        System.out.println("Numărul generat este " + randomNumber);
        /*
         * Operatori Logici:
         * Java conține 6 operatori logici
         * ! (NOT): Convertește valoarea booleană de la dreapta lui în forma opusă,
         * adică TRUE în FALSE (sau vice-versa)
         * & (AND): Returnează TRUE doar dacă ambele valori sunt TRUE (întotdeauna le
         * analizează pe ambele)
         * && (AND): La fel, returnează TRUE doar dacă ambele valori sunt TRUE
         * (oprește evaluarea dacă primul e FALSE)
         * | (OR): Returnează TRUE dacă oricare din valori este TRUE (întotdeauna le
         * analizează pe ambele)
         * || (OR): La fel, returnează TRUE dacă oricare din valori este TRUE
         * (oprește evaluarea dacă primul e TRUE)
         * ^ (XOR): Returnează TRUE dacă există 1 TRUE și 1 FALSE în dreapta sau
         * stânga operatorului
         */
        if (!(false)) {
            System.out.println("Conversie din FALSE în TRUE");
        }
        if ((true) && (true)) {
            System.out.println("\nAmbele sunt TRUE");
        }
        if ((false) || (true)) {
            System.out.println("\nCel puțin una e TRUE");
        }
        if ((true) ^ (false)) {
            System.out.println("\nUna e TRUE, iar cealaltă FALSE");
        }
        int valueOne = 1;
        int valueTwo = 2;
        // Operatorul TERNAR (CONDIȚIONAL)
        // atribuie o valoare sau alta în funcție de evaluarea unei condiții
        // Exemplu, maximul dintre 2 numere
        int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
        System.out.println(biggestValue + " e cel mai mare\n");
        /*
         * Instrucțiunea SWITCH
         * se folosește pentru un număr limitat de valori posibile
         * se evaluează valorile, pe cazuri, pentru variabila (expresia) Nota și
         * la îndeplinirea unui caz se execută blocul de instrucțiuni dintre {}
         * Dacă nici un caz nu e îndeplinit, se execută codul DEFAULT
         * Nu e obligatoriu să se folosească BREAK sau DEFAULT
         * Expresia din SWITCH(expresie) trebuie să fie INT, SHORT, BYTE sau CHAR
         */
        char Nota = 'B';
        switch (Nota) {
            case 'A':
                System.out.println("Foarte bine!");
                break; // întrerupe execuția instrucțiunii SWITCH
            case 'b': // se pot folosi mai multe cazuri deodată
            case 'B':
                System.out.println("Bun, data viitoare să iei un A!");
                break;
            case 'C':
                System.out.println("OK, dar poți și mai mult!");
                break;
            case 'D':
                System.out.println("Trebuie să muncești mai mult!");
                break;
            default:
                System.out.println("Ai picat!");
                break;
        }
    }
}