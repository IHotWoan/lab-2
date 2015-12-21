import java.lang.StringBuilder;
import java.util.Scanner;
/**
 * Created by Felix on 11/22/2015.
 */
public class Baklanges {
    public static void main(String[] args) {

        String textLine;
        Scanner input = new Scanner(System.in);
        System.out.print("Skriv in en textrad: ");
        textLine = input.nextLine();

        input.close();

        StringBuilder reverse = new StringBuilder();


        for (int i=textLine.length() - 1; i>=0; i-- ){       //making the for-loop go backwards

            reverse.append(textLine.charAt(i));             //adding the text text from input in reverse

        }
            System.out.print(reverse);


    }
}
