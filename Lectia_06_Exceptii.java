
// EXCEPȚII în JAVA
/* Un obiect de tip EXCEPTION este creat atunci când apare o eroare
* și ne spune ce fel de eroare a apărut
* 
* Câteva din multele excepții din Java:
* java.lang.RuntimeException : excepții ce pot fi aruncate
* în timpul funcționării normale a mașinii virtuale Java;
* acestea sunt în responsabilitatea programatorului.
*
* Alte excepții:
* ArithmeticException, ArrayStoreException, BufferOverflowException, 
* BufferUnderflowException, CannotRedoException, CannotUndoException, 
* ClassCastException, CMMException, ConcurrentModificationException, 
* DOMException, EmptyStackException, IllegalArgumentException, 
* IllegalMonitorStateException, IllegalPathStateException, 
* IllegalStateException, ImagingOpException, IndexOutOfBoundsException, 
* MissingResourceException, NegativeArraySizeException, 
NoSuchElementException, 
* NullPointerException, ProfileDataException, ProviderException, 
* RasterFormatException, SecurityException, SystemException, 
* UndeclaredThrowableException, UnmodifiableSetException, 
* UnsupportedOperationException
* 
* java.lang.Exception : excepții ce sunt verificate de compilatorul Java
* 
* AclNotFoundException, ActivationException, AlreadyBoundException, 
* ApplicationException, AWTException, BackingStoreException, 
* BadAttributeValueExpException, BadBinaryOpValueExpException, 
* BadLocationException, BadStringOperationException, 
* BrokenBarrierException, CertificateException, ClassNotFoundException, 
* CloneNotSupportedException, DataFormatException, 
* DatatypeConfigurationException, DestroyFailedException, 
* ExecutionException, ExpandVetoException, FontFormatException, 
* GeneralSecurityException, GSSException, IllegalAccessException, 
* IllegalClassFormatException, InstantiationException, 
* InterruptedException, IntrospectionException, 
* InvalidApplicationException, InvalidMidiDataException, 
* InvalidPreferencesFormatException, InvalidTargetObjectTypeException, 
* InvocationTargetException, IOException, JAXBException, JMException, 
* KeySelectorException, LastOwnerException, LineUnavailableException, 
* MarshalException, MidiUnavailableException, MimeTypeParseException, 
* MimeTypeParseException, NamingException, NoninvertibleTransformException, 
* NoSuchFieldException, NoSuchMethodException, NotBoundException, 
* NotOwnerException, ParseException, ParserConfigurationException, 
* PrinterException, PrintException, PrivilegedActionException, 
* PropertyVetoException, RefreshFailedException, RemarshalException, 
* RuntimeException, SAXException, ScriptException, ServerNotActiveException, 
* SOAPException, SQLException, TimeoutException, TooManyListenersException, 
* TransformerException, TransformException, UnmodifiableClassException, 
* UnsupportedAudioFileException, UnsupportedCallbackException, 
* UnsupportedFlavorException, UnsupportedLookAndFeelException, 
* URIReferenceException, URISyntaxException, UserException, XAException, 
* XMLParseException, XMLSignatureException, XMLStreamException, 
XPathException
*/
/* Excepții uzuale:
* ArithmeticException: Are loc o operație matematică fără rezultat 
* (Division by Zero)
* 
* ClassNotFoundException: O clasă este apelată fără a fi declarată
* 
* IllegalArgumentException: O funcție pasează argumente declarate incorect
*
* IndexOutOfBoundsException: Apare când se apelează indexul unui vector sau 
string,
* iar acesta nu există. Index în afara limitelor.
* 
* InputMismatchException: (Parte a NoSuchElementException) Utilizatorul 
introduce 
* (utilizând Scanner) date de tipuri incorecte
* 
* IOException: O operație de I/O a eșuat
* 
*/
import java.util.Scanner; // Bibliotecă ce ne permite captarea datelor de intrare de la utilizator
import java.util.*; // Permite verificarea excepțiilor de tipul InputMismatchException
import java.io.*; // Permite fluxuri I/O ale systemului, serializare și sistemul de fișiere

public class Lectia_06_Exceptii {
    // Creăm un obiect Scanner care va monitoriza introducerea de date de la
    // tastatură
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        divideByZero(2);
        System.out.print("Care este vârsta dvs.? ");
        int age = checkValidAge();
        if (age != 0) {
            System.out.println("Aveți " + age + " ani!");
        }
        getAFile("./somestuff.txt");
    }

    public static void divideByZero(int a) {
        try {
            // Aici va fi aruncată o excepție, deoarece nu puteți divide prin zero
            // Excepție în thread-ul "main", java.lang.ArithmeticException
            System.out.println(a / 0);
        }
        // Dacă este aruncată excepția ArithmeticException, atunci executăm ceva:
        catch (ArithmeticException e) {
            // Un mesaj definit de programator
            System.out.println("Nu poți divide prin zero!");
            // Mesajul de eroare al Java, furnizat de această excepție
            System.out.println(e.getMessage());
            // Afișarea numelui excepției și a mesajului de eroare generat
            System.out.println(e.toString());
            // Afișarea cozii stivei de erori standard
            e.printStackTrace();
        }
    }

    public static int checkValidAge() {
        try {
            return userInput.nextInt(); // nextInt() primește date de intrare
        } catch (InputMismatchException e) {
            userInput.next(); // Sare peste ultima intrare și așteaptă următoarea
            System.out.println("Acesta nu este un nr. întreg!");
            return 0;
        }
    }

    /*
     * Pentru a arunca o excepție către o funcție apelantă se folosește THROWS
     * Exemplu:
     * public static void getAFile(String fileName) throws IOException,
     * FileNotFoundException
     * {
     * FileInputStream file = new FileInputStream(fileName);
     * }
     * 
     * Dacă funcția main() apelează funcția de mai sus (getAFile),
     * atunci main() trebuie să trateze excepția
     * 
     * Adică, exemplu:
     * public static void main(String[] args) {
     * try {
     * getAFile("./somestuff.txt");
     * }
     * catch(IOException e) {
     * System.out.println("A apărut o eroare necunoscută de I/O !");
     * }
     */
    public static void getAFile(String fileName) {
        try {
            /*
             * Dacă încerc să definesc funcția getAFile() fără invocare de excepție,
             * voi obține eroarea Unhandled Exception Type FileNotFoundException
             * 
             * O excepție validă este una pe care compilatorul ne forțează să ne protejăm
             * împotriva ei
             * 
             */
            FileInputStream file = new FileInputStream(fileName);
        }   catch (FileNotFoundException e) {
            System.out.println("Scuze, nu am putut găsi fișierul!");
            System.out.println(e.toString());
        }
        // Se pot trata (prinde) numeroase excepții
        catch (IOException e) // Tratează orice excepție de I/O
        {
            System.out.println("A apărut o eroare necunoscută de I/O !");
        }
        /*
         * Pentru a ignora o excepție, aceasta se poate trata astfel:
         * catch (ClassNotFoundException e)
         * {}
         */
        /*
         * Java 7 permite tratarea deodată a mai multor excepții
         * catch (FileNotFoundException | IOException e)
         * {}
         */
        // Forma de mai jos tratează orice fel de excepție
        // Aceasta trebuie întotdeauna să fie ultima
        catch (Exception e) {
            System.out.println("Tratez orice excepție aruncată!");
        }
        // Dacă se utilizează blocul FINALLY, acesta se execută mereu,
        // indiferent dacă există sau nu vreo excepție
        // Se utilizează pe post de 'job de curățare',
        // precum închiderea de fișiere și conexiuni baze de date
        finally {
            System.out.println("");
        }
    }
}