public class old {
    public static void old() {
    //Poprzednie_zadania.zad1();
    //Poprzednie_zadania.zad2();
    //Poprzednie_zadania.zad3();
    //Poprzednie_zadania.zad4();
    //Poprzednie_zadania.zad5();
        /*Dom dom = new Dom(5);
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
        */
    //Czas_z_tekstu.zad6();
        FileHandling.New("test.txt");
        FileHandling.Write("test.txt","Zdanie ,które ma zostać zapisane w pliku tekstowym\n nowa linia");
        FileHandling.Read("test.txt");
    int[] wynik = pliki_zadania.liczZnakiSlowa("test.txt");
        System.out.println("Znaki :"+wynik[0]+" Białe znaki :"+wynik[1]+" Słowa :"+wynik[2]);
    //-----------------------------------------------------
        FileHandling.New("test2.txt");
        FileHandling.Write("test2.txt","" +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
                "Quisque sed sem ac velit mattis interdum ac vitae erat.\n" +
                "Mauris dignissim, nunc et pellentesque porta, nisi dolor iaculis ex, et fringilla ex turpis ac massa.\n" +
                "Nunc euismod purus felis, nec pretium augue consequat in. Duis in viverra justo, vel volutpat dui.\n" +
                "Nunc sollicitudin dolor sit amet augue ullamcorper, a lacinia augue consectetur.\n" +
                "Curabitur velit dui, facilisis vel erat ac, pulvinar tempus mauris.\n" +
                "Donec tempor, risus vitae commodo laoreet, sapien nibh cursus diam, ut tristique dui lacus at sem.\n" +
                "Aenean quis finibus lectus. Nulla id leo pretium, placerat est ut, sagittis tellus.\n" +
                "Nullam viverra, purus ut iaculis ullamcorper, neque enim sodales odio, et viverra mi lacus at nulla.\n" +
                "Phasellus at nunc sit amet libero fermentum laoreet.\n" +
                "Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae;\n" +
                "Phasellus eget sem quis nulla gravida egestas.\n" +
                "Nam tempor pretium ligula, id ullamcorper arcu sollicitudin quis.\n" +
                "In vel nibh in tortor dignissim commodo. Nulla facilisi.\n" +
                "Nulla nec augue eu odio pretium blandit. Donec euismod ante leo.\n");
        pliki_zadania.szukaj("test2.txt", "test3.txt", "Lorem");
    }
}
