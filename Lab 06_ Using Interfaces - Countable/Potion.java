public class Potion implements Countable {

    private String potName, info;
    private static int count = 0;

    public Potion() {

        info = "Gain 2-8 pts health";

        potName = "Health";

        count += 1;
    }
    public Potion(String pName, String inf) {

        this.info = inf;

        this.potName = pName;

        count += 1;
    }
    @Override
    public String toString() {
        
        return this.potName + ": " + this.info;
    }
    @Override
    public int getTotal() {
        return count;
    }
}