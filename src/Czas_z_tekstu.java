import java.util.Arrays;
import java.util.Scanner;

public class Czas_z_tekstu {
    public static void zad6() {
        //funkcja wykonuje wszystkie permutacje tablicy,odrzuca nieprawidłowe godziny,sortuje pozostałe i zwraca największą godzinę
        int n = 4;
        System.out.println("Podaj ciąg czterech cyfr");
        Scanner scan = new Scanner(System.in);
        StringBuilder chain = new StringBuilder(scan.nextLine());
        scan.close();
        if (chain.length() != n) System.out.println("Nieprawidłowa długość ciągu!");
        else {
            int[] tab = { (int)chain.charAt(0) - 48, (int)chain.charAt(1) - 48, (int)chain.charAt(2) - 48, (int)chain.charAt(3) - 48 };
            String[] wynik = new String[24];// 4!=24
            int count = 0;
            int[] temp = new int[n];
            for (int i = 0; i < n; i++) temp[i] = 0;
            wynik[count] = tts(tab);
            count++;
            int i = 0;
            while (i < n) {
                if (temp[i] < i) {
                    swap(tab, i % 2 == 0 ? 0 : temp[i], i);
                    wynik[count] = tts(tab);
                    count++;
                    temp[i]++;
                    i = 0;
                }
                else temp[i++] = 0;
            }
            Arrays.sort(wynik);
            System.out.print(wynik[wynik.length - 1]);
        }
    }

    public static void swap(int[] arr, int a, int b) {// zamiana cyfr w tablicy
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static String tts(int[] tab) {// sprawdza czy godzina jest poprawna(pomocnicza do zad 6)
        return (tab[0] * 10 + tab[1] > 23 || tab[2] * 10 + tab[3] > 59) ? "-1":
                Integer.toString(tab[0]) + Integer.toString(tab[1]) + ":" + Integer.toString(tab[2]) + Integer.toString(tab[3]);
    }
}
