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

import java.util.Arrays;
import java.util.Scanner;

public class Tema_Curs_09_Matrice {

    static Scanner uInput = new Scanner(System.in);

    private int dimensiune;
    private int Matrice[][];

    Tema_Curs_09_Matrice() {
        System.out.print("Introduceti nr de linii si coloane al matricei: ");
        dimensiune = uInput.nextInt();

        Matrice = new int[dimensiune][dimensiune];
        for (int i = 0; i < Matrice.length; i++) {
            for (int j = 0; j < Matrice[i].length; j++)
            {
                Matrice[i][j] = (int) (Math.random() * 21); // Exercitiul 1
            }
        }
    }

    public void printMatrice() {
        System.out.println("Afisare matrice:");

        for( int valoriPeRanduri[] : Matrice) {
            for ( int valoriPeColoane : valoriPeRanduri) {
                System.out.print(valoriPeColoane + " ");
            }
            System.out.println(); // Exercitiul 2
        }
    }

    public void MinMaxMatrice() {
        int min = Matrice[0][0];
        int max = Matrice[0][0];
        for (int rand[] : Matrice) {
            for (int elemColoana : rand) {
                max = (elemColoana > max) ? elemColoana : max;
                min = (elemColoana < min) ? elemColoana : min;
            }
        }
        System.out.println("Minim si maxim matrice: \n Minim: " + min + "\n Maxim: " + max); // Exercitiul 3
    }

    public void SortRanduriMatrice() {
        for (int rand[] : Matrice) {
            Arrays.sort(rand);
        }

        System.out.println("Matricea cu numere aleatoare sortata pe randuri: ");
        printMatrice(); // Exercitiul 4
    }

    public int SumaDiagonaleSecundareMatrice() {
        int sum = 0;
        for (int i = 0; i < Matrice.length; i++) {
            for (int j = 0; j < Matrice[i].length; j++) {
                if (i == j) {
                    if (j == 0) {
                        sum += Matrice[i][j + 1];
                    }
                    else if (j < Matrice[i].length - 1) {
                        sum += Matrice[i][j - 1] + Matrice[i][j + 1];
                    }
                    else {
                        sum += Matrice[i][j - 1];
                    }
                }
            }
        }

        System.out.println("Suma elementelor de sub respectiv deasupra diagonalei principale este: " + sum); // Exercitiul 5
        return sum;
    }

    public void ValNuleSubDiagonalaSecundaraMatrice() {
        for (int i = 0; i < Matrice.length; i++) {
            for (int j = 0; j < Matrice[i].length; j++) {
                if (i - j >= 2) { 
                    Matrice[i][j] = 0;
                }
            }
        }  
        System.out.println("Matricea cu elemente nule sub diagonala secundara:");
        printMatrice(); // Exercitiul 6
    }



    static public void main(String[] args) {

        Tema_Curs_09_Matrice m = new Tema_Curs_09_Matrice();
        m.printMatrice();
        m.MinMaxMatrice();
        m.SortRanduriMatrice();
        m.SumaDiagonaleSecundareMatrice();
        m.ValNuleSubDiagonalaSecundaraMatrice();



    }
}
