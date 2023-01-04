import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;

public class SubmissionChoices {
    /* private member variables. Do not change these */
    private double A1;
    private double A2;
    private double A3;
    private String choices;

    // you can use these methods or write your own

    private void setGrades(double a1, double a2, double a3) {
        A1 = a1;
        A2 = a2;
        A3 = a3;

    }

    private void setChoices() {
        // this private method could be used to set up the choices string based
        // on the values of the three assignment variables.
        // could be called in parse input
        final double NUM = 100.0;
        if (A1 <= NUM && A2 > NUM && A3 > NUM) {
            choices = "A1R A2";
        } else if (A1 <= NUM && A2 <= NUM && A3 > NUM) {
            choices = "A2R A3";
        } else if (A1 <= NUM && A2 <= NUM && A3 <= NUM) {
            choices = "A3R";
        }

    }

    public String getChoices() {

        // return the string representing the student's choices for submission for the
        // next grading period
        return choices;

    }

    public void parseInput(String inputLine) {
        String singles[] = inputLine.split(",");
        if (singles.length > 3) {
            System.out.println("invalid input");
            System.exit(0);
        }
        // this method likely needs to call the setGrades and setChoices methods
        setGrades(Double.parseDouble(singles[0]), Double.parseDouble(singles[1]), Double.parseDouble(singles[2]));
        setChoices();

    }

}