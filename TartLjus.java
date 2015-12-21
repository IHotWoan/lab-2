/**
 * Created by Felix on 11/24/2015.
 */
public class TartLjus {
    public static void main(String[] args) {

        int födelsedag = 0;
        int ljuspackTotal = 0;
        int ljus = 0;
        int ljuspack = 0;

        System.out.println("Detta är en simulator som beräknar antalet ljus man måste skaffa innan varje födelsedag.\n");

        while (födelsedag<100){             //runs the program every birthday
               födelsedag++;

            while(ljus<födelsedag){         //adds enough candels to be more then the birthday
                ljus += 24;
                ljuspackTotal++;
                ljuspack++;
            }

            ljus = ljus - födelsedag;       // using our candels on the cake.

            if (ljuspack > 0)               // controls the out print
            System.out.println(String.format("Before birthday %1d, buy %2d box(es)",födelsedag ,ljuspack));
            ljuspack = 0;
        }

        System.out.println("\nTotal number of boxes: " + ljuspackTotal + ", Remaining candels: " + ljus);



    }
}
