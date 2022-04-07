public class App {
    public static void main(String[] args) {
        //Poprzednie_zadania.zad1();
        //Poprzednie_zadania.zad2();
        //Poprzednie_zadania.zad3();
        //Poprzednie_zadania.zad4();
        //Poprzednie_zadania.zad5();
        Dom dom = new Dom(5);
        Dom.osoby_w_budynku(dom);
        dom.nowa_osoba();
        Dom.osoby_w_budynku(dom);
        dom.nowy_pojazd("czerwony");
        System.out.println("Kolor samochodu: "+dom.samochod.kolor);
        Dom dom2 = new Dom(25);
        Dom.osoby_w_budynku(dom2);
        System.out.println("Liczba budynków : "+Dom.liczba_domow);
        dom.budynek_obok = dom2;
        dom2.budynek_obok = dom;
        System.out.println(dom.budynek_obok.budynek_obok.budynek_obok.budynek_obok.budynek_obok.budynek_obok.budynek_obok.budynek_obok.budynek_obok.budynek_obok.budynek_obok.budynek_obok);
        //Czas_z_tekstu.zad6();
    }
}