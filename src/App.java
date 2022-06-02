public class App {
    public static void main() {

    }
}
class bazowa{
    String s;
    bazowa(){
        System.out.println("Konstruktor klasy Nad");
        s = "nad";
    }
    void  metoda(){
        System.out.println(s);
    }
}
class pochodna extends bazowa {
    
}