// DEFINIREA de bază a unei CLASE
// PUBLIC arată că această clasă poate fi utilizată și de alte clase
// Numele claselor trebuie să înceapă cu literă mare
// Un fișier (program) nu poate să conțină două sau mai multe clase publice.
// Poate conține alte clase, dar care să nu fie declarate PUBLIC
// Dacă se plasează fișierele cu clase în același folder,
// compilatorul JAVA le va putea găsi și executa.
public class Lectia_07_Clase_Constructori {
    // Variabile (sau câmpuri) ale clasei
    // Constantele se declară prin cuvântul cheie FINAL
    public final String TOMBSTONE = "Aici zace un pet!";
    // câmpurile (variabile) declarate PRIVATE nu se văd în afara clasei lor
    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    private int xPosition = 0;
    private int yPosition = 0;
    private boolean alive = true;
    // câmpurile (variabile) declarate PUBLIC se văd în afara clasei lor
    // De regulă, trebuie declarate, pe cât posibil, cât mai puține câmpuri publice
    public String name = "Big Pet";

    // Definirea metodelor (funcțiilor) unei clase
    // Metodele de acces sunt utilizate pentru a obține
    // sau seta valorile câmpurilor declarate PRIVATE
    public int getAttack() {
        return attack;
    }

    public int getMovement() {
        return movement;
    }

    public int getHealth() {
        return health;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public boolean getIsAlive() {
        return alive;
    }

    // Se pot defini versiuni multiple ale aceleași funcții sub același nume
    // Exemplu, funcția setHealth() e definită de două ori, dar cu parametri
    // diferiți
    // Regulă: definiți funcții sub același nume prin diferențierea parametrilor
    public void setHealth(int decreaseHealth) {
        health = health - decreaseHealth;
        if (health < 0) {
            alive = false;
        }
    }

    public void setHealth(double decreaseHealth) {
        int intDecreaseHealth = (int) decreaseHealth;
        health = health - intDecreaseHealth;
        if (health < 0) {
            alive = false;
        }
    }

    /*
     * CONSTRUCTORUL
     * este funcția (metoda) care se execută când se crează obiecte de tipul
     * clasei respective
     * Numele constructorului este același cu cel al clasei
     * Constructorul se execută doar o dată pentru orice obiect
     * Constructorul nu poate returna nicio valoare
     * 
     */
    public Lectia_07_Clase_Constructori(int health, int attack, int movement) {
        this.health = health;
        this.attack = attack;
        this.movement = movement;
        /*
         * Dacă argumentele au aceleași denumiri ca și câmpurile clasei,
         * pentru referirea la câmpurile unui obiect se folosește THIS
         * Exemplu:
         * this.health = health;
         * this.attack = attack;
         * objectFieldName = attributeFieldName;
         */
    }

    // Constructorii pot fi supraîncărcați (redefiniți)
    // Constructorul implicit, utilizat în cazul lipsei altora
    public Lectia_07_Clase_Constructori() {
    }
    /*
     * Se poate utiliza cuvântul cheie THIS pentru a apela alți constructori:
     * Exemplu:
     * public Lectia_07_Clase_Constructori(int newHealth)
     * {
     * health = newHealth;
     * }
     * 
     * public Lectia_07_Clase_Constructori(int newHealth, int newAttack)
     * {
     * this(newHealth);
     * // orice apeluri către alt constructor trebuie să apară pe prima linie
     * attack = newAttack;
     * }
     */

     public static void main(String[] args) {
        Lectia_07_Clase_Constructori npc = new Lectia_07_Clase_Constructori(100, 10, 5);
        System.out.println(npc.getHealth());
        System.out.println(npc.getAttack());
        System.out.println(npc.getMovement());
        npc.setHealth(25);
        System.out.println(npc.getHealth());
     }
}