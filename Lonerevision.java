
import java.util.*;
/**
 * Created by Felix on 11/27/2015.
 */
public class Lonerevision {
    public static void main(String[] args) {

        System.out.println("Mata in löner (och avsluta med 'x')");
        ArrayList<Integer> lön = new ArrayList<>();
        Scanner input = new Scanner(System.in);


        String temp;
        int antal = 0;
        int number;
        char x = 'o';

        do{
            antal++;
            System.out.print(String.format("lön %d: ",antal));      //controls user input and adds input to our list.
            temp = input.nextLine();

            if (temp.charAt(0) == 'X'){
                x = 'X';
            }
            else{
                number = Integer.parseInt(temp);
                lön.add(number);
            }

        } while(x != 'X' );

        System.out.println("Inmatade löner: " + lön.toString());
        Collections.sort(lön);

        int lönespridning = lön.get(lön.size() - 1) - lön.get(0);   //getting difference between biggest and lowest value.

        float median;
        if (lön.size()%2 == 0 ){                                    //taking out median value , using "float" to be precise.
            float första = lön.get((lön.size()/2) - 1);
            float andra =  lön.get(lön.size()/2);
            median = (första+andra)/2;

        }
        else{
            median = lön.get(lön.size()  / 2);
        }

        int medelvärde = 0;                                         // take out the average value
        for (int i = 0; i<lön.size(); i++){
            medelvärde = medelvärde + lön.get(i);
        }
        medelvärde = medelvärde/(lön.size());

        System.out.println("Medianlön: " + median + "\nMedellön: " + medelvärde + "\nLönespridning: " + lönespridning );
    }
}
