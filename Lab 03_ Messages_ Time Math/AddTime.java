import java.util.ArrayList;
import java.util.Scanner;

public class AddTime {
    private ArrayList<Time> time;
    private Scanner scnr;

    public AddTime() {
        time = new ArrayList<>();
        scnr = new Scanner(System.in);
    }

    public String promptInput() {
        String userInput = scnr.next();
        return userInput;
    }

    // Reminder: input format: (hh:mm:ss)
    public void addTimeUnit(String input) {

        String[] s = input.split(":");

        int hrs = Integer.parseInt(s[0]);
        int min = Integer.parseInt(s[1]);
        int sec = Integer.parseInt(s[2]);

        Time t1 = new Time(hrs, min, sec);

        time.add(t1);
    }

    public Time calculateTotalTime() {
        int hrs = 0;
        int min = 0;
        int sec = 0;

        for (Time t1 : time) {
            hrs += t1.getHours();
            min += t1.getMinutes();
            sec += t1.getSeconds();
        }

        min += sec / 60;

        sec = sec % 60;

        hrs += min / 60;

        min = min % 60;


        Time totalTime = new Time(hrs, min, sec);
        return totalTime;
    }

}
