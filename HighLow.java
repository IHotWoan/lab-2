import java.util.Random;
import java.util.Scanner;
/**
 * Created by Felix on 11/22/2015.
 */
public class HighLow {
    public static void main(String[] args) {

        System.out.print("Ett tal har slumpats mellan 1 och 100. Ditt jobb är att gissa dig till talet på 10 gissninsar!");

        int slumptal;
        int försök = 0;
        int gissning;

        Random slump = new Random ();               // gets a random number.
        slumptal = 1 + slump.nextInt(100);

        Scanner input = new Scanner(System.in);

        while(försök<=10){                      // lets the user guess the number, exits after 10 guesses.

            försök++;
            System.out.print(String.format("\nGissning %d: ",försök));
            gissning = input.nextInt();


            if (gissning == slumptal ){
                System.out.println(String.format("\nrätt svar efter %d gissningar!",försök));
                break;
            }

            else if(gissning > slumptal){
                System.out.println("Fel svar. Testa gissa lägre!");
            }

            else if(gissning < slumptal){
                System.out.println("Fel svar. Testa gissa högre!");
            }

        }                                       // gives a comment depending on how good u did.
                 if (försök <= 3) {
                System.out.println(String.format("\nDu gissade rätt på %d gissningar. Grymt bra gjort!!!", försök));
                 }

                else if (försök <= 6){
                System.out.println(String.format("\nDu gissade rätt på %d gissningar. Bra gjort!", försök));
                 }

                else if (försök <= 10){
                System.out.println(String.format("\nDu gissade rätt på %d gissningar. Du klarade dig!", försök));
                 }

                else {
                     System.out.println("Du har inte lyckats hitta talet. Starta om programet för att testa igen");
                 }



    }
}
