import java.util.Scanner;
/**
 * Created by Felix on 11/22/2015.
 */
public class RaknaA {
    public static void main(String[] args) {

        String textLine;

        Scanner input = new Scanner(System.in);
        System.out.print("skriv in en textrad: ");
        textLine = input.nextLine();

        input.close();

        int a = 0;
        int A = 0;
        for (int i=0; i<textLine.length(); i++){    // counts characters a and A

            if (textLine.charAt(i) == 'a')          //controlling if the character in the index is a "a"
                a++;

            else if (textLine.charAt(i) == 'A')     //controlling if the character in the index is a "A"
                A++;

        }

        System.out.print("Antalet a: " + a + "\nAntalet A: " + A);

    }
}
