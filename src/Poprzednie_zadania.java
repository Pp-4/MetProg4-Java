import java.util.Scanner;

public class Poprzednie_zadania{
    public static void zad1() {
    System.out.println("Podaj ciąg znaków");
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    StringBuilder chain = new StringBuilder(input);
    scan.close();
    char a = chain.charAt(chain.length() - 1);
    int count = 0;
    for (int i = 0; i < chain.length(); i++) {
        if (chain.charAt(i) == a) count++;
    }
    System.out.println("Liczba wystąpień : " + count);
}
    public static void zad2() {
        System.out.println("Podaj ciąg znaków");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        StringBuilder chain = new StringBuilder(input);
        scan.close();
        chain.reverse();
        System.out.println("Odwrócony tekst : " + chain);
    }
    public static void zad3() {
        System.out.println("Podaj ciąg znaków");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        StringBuilder chain = new StringBuilder(input);
        scan.close();
        chain.reverse();
        boolean test = input.contentEquals(chain);
        if (test) System.out.println("Podany ciąg jest palindromem.");
        else System.out.println("Podany ciąg nie jest palindromem.");
    }
    public static void zad4() {
        System.out.println("Podaj ciąg znaków");
        Scanner scan = new Scanner(System.in);
        StringBuilder chain = new StringBuilder(scan.nextLine());
        scan.close();
        int suma = 0;
        for (int i = 0; i < chain.length(); i++) {
            char temp = chain.charAt(i);
            if (Character.isDigit(temp)) suma += temp - 48;
        }
        System.out.println("Suma cyfr znalezionych w ciągu : " + suma);
    }
    public static void zad5() {
        System.out.println("Podaj ciąg znaków");
        Scanner scan = new Scanner(System.in);
        StringBuilder chain = new StringBuilder(scan.nextLine());
        scan.close();
        int LeftBracket = 0, RightBracket = 0;
        for (int i = 0; i < chain.length(); i++) {
            char temp = chain.charAt(i);
            if (temp == '(') LeftBracket++;
            if (temp == ')') RightBracket++;
        }
        String msg = (LeftBracket == RightBracket) ? "OK" : "Nie OK";
        System.out.println(msg);
    }
}