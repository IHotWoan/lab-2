import java.util.Scanner;
/**
 * Created by Felix on 11/23/2015.
 */
public class NastStorsta {
    public static void main(String[] args) {

        int antalTal=9;
        int första=0;
        int andra=0;
        int n;
        int temp;

        Scanner input = new Scanner(System.in);
        System.out.println("Du kommer få skriva in tio olika tal och programmet kommer sedan ta fram den näst högsta.");

        for(int i = 0; i<=antalTal; i++){

            System.out.print(String.format("Skriv in tal %d: ",i + 1));
            n = input.nextInt();

            if ( andra < n ){                       //replacing values and saving the two biggest
                andra = n;

                if (första < andra){
                    temp = första;
                    första = andra;
                    andra = temp;
                }
            }

        }                               // printing out the second biggest
        input.close();
        System.out.println(String.format("Det näst största talet är: %d",andra));

    }

}

