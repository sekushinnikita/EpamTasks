package Delivery.Ui.Reading;
import java.io.InputStream;
import java.util.Scanner;
public class Reader {
    public String readString(InputStream input){
        Scanner scanner = new Scanner(input);
        return scanner.nextLine();
    }
    public Integer readInteger(InputStream input){
        Scanner scanner = new Scanner(input);
        return scanner.nextInt();
    }
}
