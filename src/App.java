import java.util.Scanner;
import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
            //zad1();
            //zad2();
            //zad3();
            //zad4();
            //zad5();
            zad_układanie_godziny();
        }
        public static void zad1(){
            System.out.println("Podaj ciąg znaków");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            StringBuilder chain = new StringBuilder(input);
            char a = chain.charAt(chain.length()-1);
            int count = 0;
            for(int i=0;i<chain.length();i++){
                if(chain.charAt(i)==a)count++;
            }
            System.out.println("Liczba wystąpień : " + count);
        }
        public static void zad2(){
            System.out.println("Podaj ciąg znaków");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            StringBuilder chain = new StringBuilder(input);
            chain.reverse();
            System.out.println("Odwrócony tekst : " + chain);
        }
        public static void zad3(){
            System.out.println("Podaj ciąg znaków");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            StringBuilder chain = new StringBuilder(input);
            chain.reverse();
            boolean test = input.contentEquals(chain);
            if(test)System.out.println("Podany ciąg jest palindromem.");
            else System.out.println("Podany ciąg nie jest palindromem.");
        }
        public static void zad4(){
            System.out.println("Podaj ciąg znaków");
            Scanner scan = new Scanner(System.in);
            StringBuilder chain = new StringBuilder(scan.nextLine());
            int suma = 0;
            for(int i = 0; i < chain.length(); i++){
                char temp = chain.charAt(i);
                if(Character.isDigit(temp))suma += temp - 48;
            }
            System.out.println("Suma cyfr znalezionych w ciągu : " + suma);
        }
        public static void zad5(){
            System.out.println("Podaj ciąg znaków");
            Scanner scan = new Scanner(System.in);
            StringBuilder chain = new StringBuilder(scan.nextLine());
            int LeftBracket = 0, RightBracket = 0;
            for(int i = 0; i < chain.length(); i++){
                char temp = chain.charAt(i);
                if(temp == '(')LeftBracket++;
                if(temp == ')')RightBracket++;
            }
            String msg = (LeftBracket == RightBracket)?"OK":"Nie OK";
            System.out.println(msg);
        }
        public static void zad_układanie_godziny(){
            System.out.println("Podaj ciąg czterech cyfr");
            Scanner scan = new Scanner(System.in);
            StringBuilder chain = new StringBuilder(scan.nextLine());
            if(chain.length()!=4) System.out.println("Nieprawidłowa długość ciągu!");
            else{
                int length = chain.length()*chain.length();
                int[][] tablicaGodzin = new int[length][4];
                for(int i = 0;i<chain.length();i++) {
                    for(int j = 0;j<chain.length();j++){
                        int temp = (chain.charAt(i)-48)*10+(chain.charAt(j)-48);
                        tablicaGodzin[i*j][0] = temp > 23 ? 0 : chain.charAt(i)-48;
                        tablicaGodzin[i*j][1] = temp > 23 ? 0 : chain.charAt(j)-48;
                        String h = "1234";
                        h.replace(Integer.toString(i-48),"");
                        h.replace(Integer.toString(j-48),"");
                        tablicaGodzin[i*j][2] = temp > 23 ? 0 : chain.charAt(h.charAt(0));
                        tablicaGodzin[i*j][3] = temp > 23 ? 0 : chain.charAt(h.charAt(1));
                    }
                }
                int[] wyniki = new int[length];
                for(int i = 0;i < length; i++){
                    int temp = tablicaGodzin[i][2]>=tablicaGodzin[i][3]?(tablicaGodzin[i][2]-48)*10+(tablicaGodzin[i][3]-48):(tablicaGodzin[i][3]-48)*10+(tablicaGodzin[i][2]-48);
                    temp = temp>60?0:temp;
                    wyniki[i] = (tablicaGodzin[i][0]-48)*10+tablicaGodzin[i][1]-48+temp;
                }
                Arrays.sort(wyniki);
                System.out.println(wyniki[wyniki.length-1]);
        }

    }
}