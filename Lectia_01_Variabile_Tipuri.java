// CLASS - Definim o nouă clasă (Blueprint) cu numele HelloWorld
// totul în limbajul Java se definește prin clase de obiecte
// PUBLIC – obiectele declarate PUBLIC sunt accesibile tuturor
// clasele sunt paternuri utilizate pentru a modela/proiecta obiecte,
// care conțin atribute (variabile) și metode (funcții)
// COMENTARII
// comentariu pe o singură linie
/*
* comentariu pe mai multe linii
* altă linie de comentarii etc.
*/
// HelloWorld este numele programului, prin care noi îl accesăm mai târziu
// { orice clasă, după numele ei, conține paranteză acoladă deschisă
    public class Lectia_01_Variabile_Tipuri {
        // PUBLIC - permite și altor clase să utilizeze această variabilă/funcție
        // STATIC - în cazul funcțiilor, doar o clasă poate apela și executa o
        // funcție declarată STATIC
        // VOID - funcțiile definite cu VOID nu vor returna nimic la finele
        // execuției lor
        // doar variabilele declarate STATIC pot fi accesate de orice alte funcții
        // din cadrul acelei clase
        static String randomString = "String to print";
        // constantele se definesc prin cuvântul cheie FINAL
        static final double PINUM = 3.1415929;
        public static void main(String[] args) {
        // MAIN - funcția main() este obligatorie în orice program Java și
        // întotdeauna este executată prima
        // orice funcție main() trebuie să accepte un vector de obiecte de tipul
        // STRING
        // System.out - este un obiect care furnizează la ieșire informații
        // println() - afișează pe ecran orice primește ca argument
        // "Hello World" - este un șir de caractere; orice șir de caractere este
        // delimitat de ghilimele
        // și fiecare instrucțiune se termină cu punct și virgulă ;
        System.out.println("Hello World");
        // VARIABILE:
        // numele variabilelor sunt „case-sensitive”. Exemplu, 'Telefon' e
        // diferit de 'telefon'
        // Variabilele trebuie să înceapă cu o literă și pot să conțină numere,
        // _ sau $
        // Variabilele trebuie mai întâi declarate cu un tip de date, pentru a
        // putea fi utilizate
        /*
        * EXCEPȚII de nume de variabile:
        * public, static, void, final, abstract,
        * private, protected, this, char, byte, boolean, short, int, long,
* float, double, enum, const, for, continue, new, break, while, do,
* switch, case, assert, default, goto, if, else, implements, throw,
* throws, try, catch, return, transient, package, synchronized, import,
* class, finally, extends, super, instanceof, interface, strictfp,
* volatile, native
*/
// Exemplu de instrucțiune de declarare variabilă
// integerOne - variabilă locală în funcția main(),
// adică poate fi accesată doar în interiorul funcției main()
int integerOne = 22;
int integerTwo = integerOne + 1; // Instrucțiune tip expresie
// în Java, spațiile libere sunt ignorate
integerTwo = integerOne + 3;
System.out.println(integerTwo);
// afișarea pe ecran a conținutului variabilei integerTwo
// TIPURI FUNDAMENTALE DE DATE în JAVA
byte bigByte = 127; // de la -128 până la 127
short bigShort = 32767; // de la -32768 până la 32767
int bigInt = 2147483647; // de la -2147483648 până la 2147483647
long bigLong = 9223372036854775807L; // de la -9223372036854775808L
float bigFloat = 3.14F; // Orice FLOAT trebuie să aibă un F la final
double bigDouble = 3.1234567890D; // D-ul nu e obligatoriu pentru numere
// declarate DOUBLE
System.out.println(Float.MAX_VALUE); // FLOAT are precizie pentru 6
// zecimale
System.out.println(Double.MAX_VALUE); // DOUBLE conține o precizie cu 15
// zecimale
boolean trueOrFalse = true; // variabilele BOOLEAN sunt True sau False,
// nu 1 sau 0
// o variabilă declarată CHAR acceptă fie un număr (cod ASCII), fie un
// caracter delimitat de apostroafe
char randomChar = 65; // Codul ASCII a caracterului A este 65
// Valori acceptate: de la 0 până la 65535
char anotherChar = 'A';
System.out.println(randomChar);
// Variabilele CHAR pot conține și secvențe escape
char backSpace = '\b';
char formFeed = '\f';
char lineFeed = '\n'; // sau New Line
char carriageReturn = '\r'; // revenire la capăt de rând
char horizontalTab = '\t'; // spațiere la distanța de un TAB
char doubleQuote = '\"'; // afișarea caracterului ghilimele "
char singleQuote = '\''; // afișarea caracterului apostrof '
char backSlash = '\\'; // afișarea caracterului backspace \
// O variabilă declarată STRING conține un șir de caractere
String randomString = "Un șir oarecare de caractere";
String anotherString = "alt șir";
// String-urile se concatenează cu semnul +
String combinedString = randomString + ' ' + anotherString;
System.out.println(combinedString); // afișarea șirului combinat
// (concatenat)
// Conversia la STRING a oricărui alt tip de date se face cu funcția
// toString()
String byteString = Byte.toString(bigByte);
String shortString = Short.toString(bigShort);
String intString = Integer.toString(bigInt);
String longString = Long.toString(bigLong);
String floatString = Float.toString(bigFloat);
String doubleString = Double.toString(bigDouble);
String booleanString = Boolean.toString(trueOrFalse);
String charString = Character.toString(randomChar); // acest caz nu-i
// neapărat
// obligatoriu
System.out.println(byteString);
System.out.println(shortString);
System.out.println(longString);
System.out.println(floatString);
System.out.println(doubleString);
System.out.println(booleanString);
System.out.println(charString); // afișarea conținutului variabilei
// charString
// Instrucțiunea de mai jos este incorectă, deoarece variabila
// randomChar este de tip CHAR
// și CHAR nu este obiect, ci tip de date primitiv (fundamental)
// System.out.println(randomChar.getClass());
// Instrucțiunea de mai jos este corectă, deoarece charString este
// declarată prin String,
// care este un obiect care conține funcții, printre care și getClass()
System.out.println(charString.getClass());
// operatorul CAST (type cast):
// pentru conversie forțată de la un tip de date primitiv la altul
// dacă se convertește de la un număr prea mare,
// se va utiliza valoarea cea mai mare posibilă în noul tip de date
double aDoubleValue = 3.1456789;
int doubleToInt = (int) aDoubleValue;
System.out.println(doubleToInt);
/*
* Pentru a converti la alte tipuri de date a se utiliza: (byte),
* (short), (long), (double), Conversiile (float) & (boolean) & (char)
* nu sunt corecte. (char) conversia aceasta vede un număr și nu un
* caracter
*/
// Funcția parseInt() - conversia unui String la un întreg
int stringToInt = Integer.parseInt(intString);
System.out.println(stringToInt);
/*
* Alte funcții de parsare: parseShort, parseLong, parseByte,
* parseFloat, parseDouble, parseBoolean. Nu există nici un motiv să
* parsezi un caracter
*/

}
// Parenteza acoladă închisă încheie funcția, iar la final, clasa
}

