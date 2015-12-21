import java.util.Scanner;
import java.lang.StringBuilder;
/**
 * Created by Felix on 11/22/2015.
 */
public class StorstaK {
    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Skriv in ett positivt heltal: ");
        number = input.nextInt();
        input.close();

        StringBuilder output = new StringBuilder();
        StringBuilder remove = new StringBuilder();

        int a=0;
        int b=0;
        int total=0;

        while (total<number){                                           // gets k value

        a = b;
        b = b+2;
        total += b;                                                     // saves total value
        output.append(b);
        output.append("+");
        }

        remove.append(b);                                               //removing characters to show correct values.
        remove.append(a);
        remove.append("+");
        output.setLength(output.length() - remove.length()-1);


        System.out.print(output);
        System.out.print("K < " + total + " => K=" + a);

    }
}
