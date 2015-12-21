import java.util.Random;
/**
 * Created by Felix on 11/26/2015.
 */
public class Frekvenstabell {
    public static void main(String[] args) {

        int[] rolls = new int[6];
        Random slump = new Random();
        System.out.println("Frequencies when rolling a dice 6000 times.");

        int i = 0;
        int dice;
        while (i < 6000){                       //gives us the amount a value appears when throwing 6000 dices.
           i++;
           dice = 1 + slump.nextInt(6);

           if (dice == 1){
               rolls[0] = rolls[0] + 1;
           }
           else if (dice == 2){
               rolls[1] = rolls[1] + 1;
           }
           else if (dice == 3){
               rolls[2] = rolls [2] + 1;
           }
           else if (dice == 4){
               rolls[3] = rolls[3] + 1;
           }
           else if (dice == 5){
               rolls[4] = rolls[4] + 1;
           }
           else{
               rolls[5] = rolls[5] + 1;
           }
        }

        System.out.print("1: "+rolls[0]+"\n2: "+rolls[1]+"\n3: "+rolls[2]+"\n4: "+rolls[3]+"\n5: "+rolls[4]+"\n6: "+rolls[5]);

    }
}
