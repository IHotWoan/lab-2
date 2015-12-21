import java.util.Scanner;
import java.lang.StringBuilder;
/**
 * Created by Felix on 11/24/2015.
 */
public class RaknaSiffror {
    public static void main(String[] args) {

        System.out.println("Du kommer nu ska skriva in ett heltal, programmet kommer sedan räkna ut antalet" +
                "nollor och udda/jämna tal i heltalet.");

        int heltal;
        int noll = 0;
        int jämt = 0;
        int udda = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Skriv in heltalet: ");
        heltal = input.nextInt();

        StringBuilder längd = new StringBuilder();
        längd.append(heltal);                                           //getting length of user input.

        for(int i = 0; i <= längd.length() - 1; i++){                   //loops as many times as length of number.
                                                                        // taking out even / odd numbers as well as zeros
            if (längd.charAt(i) == '0'){
                noll++;
            }

            else if(längd.charAt(i) %2 == 0){
                jämt++;
            }
            else{
                udda++;
            }
        }

        System.out.println("nollor: " + noll + "\nUdda: " + udda + "\nJämna: " + jämt);

    }
}
