
public class Adv{

    public void metoda1(){
        metoda2();

    }
    public void metoda2(){
        metoda3();
    }
    public void metoda3()
    {
        metodast1();
    }
    public static void metodast1()
    {
        metodast2();
    }
    public static void metodast2(){

        metodast1();
    }
}