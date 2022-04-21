import java.io.File; //to
import java.io.*; //lub to
public class FileHandling {
    public static void New(String plik){
        try {
            File myObj = new File(plik);
            if (myObj.createNewFile()) {
                System.out.println("Plik utworzony: " + myObj.getName());
            } else {
                System.out.println("Ten plik już istnieje");
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd.");
            e.printStackTrace();
        }
    }
    public static void Write(String plik,String tekst) {
        try {
            FileWriter myWriter = new FileWriter(plik);
            myWriter.write(tekst);
            myWriter.close();
            System.out.println("Udany zapis do pliku");
        } catch (IOException e) {
            System.out.println("Wystąpił błąd.");
            e.printStackTrace();
        }
    }
    public static void Read(String plik) {
        try {
            FileReader myReader = new FileReader(plik);
            String output = "";
            int input = myReader.read();
            while(input!=-1){
                output = output+(char)(input);
                input = myReader.read();
            }
            System.out.println(output);
            myReader.close();
            System.out.println("Udany odczyt pliku");
        } catch (IOException e) {
            System.out.println("Wystąpił błąd.");
            e.printStackTrace();
        }
    }
}
