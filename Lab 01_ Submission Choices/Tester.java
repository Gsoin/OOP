import java.util.Scanner;

public class Tester {

    public static void main(String args[]) {

        /*
         * the main method should instantiate a Scanner,
         * get the string from the user instantiate a new SubmissionChoices object,
         * call the parseInput method and
         * get the choices string- printing it to standard out
         * 
         * hint: use the nextLine() method from the Scanner class
         */
        Scanner f = new Scanner(System.in);
        

        // your code here
        SubmissionChoices sc = new SubmissionChoices();
        String parse = f.nextLine();
        sc.parseInput(parse);
        System.out.println(sc.getChoices());
    }

}