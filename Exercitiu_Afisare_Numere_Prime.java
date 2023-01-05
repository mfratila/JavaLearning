import java.util.Scanner;

public class Exercitiu_Afisare_Numere_Prime {
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        int testPrim = 1;
        System.out.print("Primele cate numere prime sa fie gasite?: ");
        int n = userInput.nextInt();

        do {
            int divizori = 0;
            int d = 1;
            while (d <= testPrim) {
                if (testPrim % d == 0) {
                    divizori++;
                }
                d++;
            }
            if (divizori == 2) {
                System.out.println(testPrim + " Este nr prim!");
                n--;
            }
            testPrim++;

        } while (n != 0);
    }
    
}
