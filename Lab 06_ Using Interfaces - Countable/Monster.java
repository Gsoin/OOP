public class Monster implements Countable {
    
	private String monsterName, info;
	private static int count = 0;
	

	public Monster() {

		monsterName = "Kobold";

		info = "1-4 pts of damage";

		count += 1;
	}
	
	public Monster(String mName, String inf) {

		this.monsterName = mName;

		this.info = inf;

		count += 1;
	}


    @Override
	public String toString() {
        
		return this.monsterName + ": " + this.info;
	}
	
    @Override
	public int getTotal() {
		return count;
	}
}