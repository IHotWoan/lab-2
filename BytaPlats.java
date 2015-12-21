import java.util.Arrays;

/**
 * Created by Felix on 11/24/2015.
 */
public class BytaPlats {
    public static void main(String[] args) {

        char[] text = { 't', 't', 'ä', 'l', ' ', 'r', 'a', 'v', ' ', 'a',   //the array we are gonna change.
                't', 't', 'e', 'D' };

        System.out.println(Arrays.toString(text));

        char a;
        char b;
        char temp;

        if (text.length%2 != 0){                                // if the array change and cant be split in two.
            System.err.println("arrayen är inte delbar med");
            System.exit(0);
        }

        for (int i = 0; i<text.length/2; i++){                  // switches first and last , then second and second last etc.

            a = text[i];
            b = text[text.length - 1 -i];
            temp = a;

            text[i] = b;
            text[text.length - 1 -i] = temp;
        }

        System.out.println(Arrays.toString(text));

    }
}
