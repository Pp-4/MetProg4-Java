public class Dom
{
    int mieszkancy;
    Pojazd samochod;
    Dom budynek_obok;
    public Dom(int a){
        mieszkancy = a;
        liczba_domow++;
    }
    void nowa_osoba(){
        mieszkancy++;

    }
    void nowy_pojazd(String kolor){
        samochod = new Pojazd(kolor);
    }
    static void osoby_w_budynku(Dom budynek){

        System.out.println("Liczba osób : "+budynek.mieszkancy);
    }
    static int liczba_domow=0;
}
