import java.util.Scanner;
import java.lang.*;
/**
 * Created by Felix on 11/24/2015.
 */
public class Palindrom {
    public static void main(String[] args) {

        String text;                                                            // user input.
        Scanner input = new Scanner(System.in);
        System.out.print("Skriv in en textrad som ska testas som Palindrom: ");
        text = input.nextLine();
        input.close();

        StringBuilder letters = new StringBuilder();                          // take out all letters from input and
        for (int i = 0; i<= text.length() - 1; i++){                          // save them.

            if(Character.isLetter(text.charAt(i))){
                letters.append(text.charAt(i));
            }
        }

        for (int j = 0; j<= letters.length() - 1; j++){                     //makes our letters "small" S = s etc
            char c = letters.charAt(j);
            letters.setCharAt(j, Character.toLowerCase(c));
        }
        StringBuilder reverse = new StringBuilder();                        //making a reversed copy of our string
        for (int k=letters.length() - 1; k>=0; k-- ){
            reverse.append(letters.charAt(k));
        }


        if (letters.toString().equals(reverse.toString())){                 // compares the original to the reversed copy.
            System.out.println("Den angivna texten  är ett palindrom!");
        }

        else{
            System.out.println("Den angivna texten är inte ett palindrom.");
        }

    }
}
