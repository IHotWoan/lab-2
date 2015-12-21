import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by Felix on 11/26/2015.
 */
public class OmvandOrdning {
    public static void main(String[] args) {

        System.out.println("Mata in positiva heltal, när du är klar avsluta med ett negativt.");

        ArrayList<Integer> tal = new ArrayList<>();
        int temp;
        int count = -1;
        int number = 1;
        Scanner input = new Scanner(System.in);

        do{
           System.out.print(String.format("Tal %d: ",number));          //add users numbers to our list.
           temp = input.nextInt();
           tal.add(temp);
           count++;
           number++;
        } while (temp > 0);

        tal.remove(tal.size() - 1);                                     // removing last input
        System.out.println(String.format("Antalet positiva tal: %d",count));
        System.out.print("Baklänges: ");

        for(int i = tal.size() - 1; i>= 0; i--){                        // printing out our list in reverse
          System.out.print(tal.get(i) + ", ");

        }

    }

}
