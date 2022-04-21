import java.util.ArrayList;
public class Dom
{
    ArrayList<Osoba> mieszkancy;
    Pojazd samochod;
    Dom budynek_obok;
    public Dom(int a){
        liczba_domow++;
    }
    void nowa_osoba(Osoba osoba){
        mieszkancy.add(osoba);
    }
    void nowy_pojazd(String kolor){
        samochod = new Pojazd(kolor);
    }
    static void osoby_w_budynku(Dom budynek){
        System.out.println("Liczba osób : "+budynek.mieszkancy.size());
    }
    static int liczba_domow=0;
}
