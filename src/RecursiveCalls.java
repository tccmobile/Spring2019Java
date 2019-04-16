public class RecursiveCalls {
    public static void backwardsAlphabet(char currLetter) {
        if (currLetter == 'a') {
            System.out.println(currLetter);
        }
        else {
            System.out.print(currLetter + " ");
            backwardsAlphabet((char)(currLetter - 1));
            System.out.print(currLetter + " ");
        }
    }

    public static void main (String [] args) {
        char startingLetter;

        startingLetter = 'z';

        /* Your solution goes here  */

        backwardsAlphabet(startingLetter);

    }
}