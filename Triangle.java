import java.util.Scanner;
import java.lang.StringBuilder;
/**
 * Created by Felix on 11/23/2015.
 */
public class Triangle {
    public static void main(String[] args) {

        int odd;
        Scanner input = new Scanner(System.in);
        System.out.print("Skriv in ett udda tal som kommer utgöra basen för två trianglar: ");
        odd = input.nextInt();
        input.close();

        if (odd %2 == 0 ){                      // if the number is even exit
            System.out.println(String.format("Du angav talet %d. Det är ett jämt tal och programmet kommer avslutas!",odd));
            System.exit(0);
        }
        else {
            System.out.println(String.format("Du angav talet %d, här kommer dina trianglar!",odd));
        }

            System.out.println("Rätvinklig triangel:\n");
        StringBuilder tri = new StringBuilder();

        for(int i = 0; i<odd ; i++ ){                           // getting first triangle and printing it out.

            tri.append("*");
            System.out.println(tri);
        }

        StringBuilder space = new StringBuilder();
        System.out.println("\nLikbent triangel:\n");

        System.out.println(tri);
        for(int j = 0; j<(odd-1)/2; j++){                   // wierd looking loop to run correct amount of times.
                                                            // getting second triangle
            tri.setLength(tri.length()-2);                  //removing two "*" and adding a space before every print.
            space.append(" ");

            System.out.print(space);
            System.out.print(tri + "\n");


        }



    }
}
