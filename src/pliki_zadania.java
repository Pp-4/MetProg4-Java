import java.io.*;
public class pliki_zadania {
    public static int[] liczZnakiSlowa(String plik){
        int length = 0,space = 0,words = 0;
        try {
            String output = "";
            FileReader ciąg = new FileReader(plik);
            int input = ciąg.read();
            while(input!=-1){
                output += (char)(input);
                if(Character.isWhitespace(input)) space++;
                input = ciąg.read();
            }
            ciąg.close();
            length = output.length();
            words = output.split(" ").length;
        } catch (IOException e) {
            System.out.println("Wystąpił błąd.");
            e.printStackTrace();
        }
        return new int[]{length,space,words};
    }
    public static void szukaj(String nazwaPlikWe, String nazwaPlikWy, String slowo){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(nazwaPlikWe));
            String line = reader.readLine();
            int numerLini = 0;
            while (line != null) {
                System.out.println(line);
                String[] linia = line.split(" ");
                String temp = "";
                for(int i = 0;i<linia.length;i++){
                    if(nazwaPlikWy == linia[i]){
                        temp =  Integer.toString(numerLini)+": "+String.join(" ",linia);
                        FileHandling.New(nazwaPlikWy);
                        FileWriter myWriter = new FileWriter(nazwaPlikWy);
                        myWriter.append(temp);
                        myWriter.close();
                        break;
                    }
                }
                line = reader.readLine();
                numerLini++;
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Wystąpił błąd.");
            e.printStackTrace();
        }
    }
}
