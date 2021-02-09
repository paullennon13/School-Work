package bag;

public class ItemWithCount <T> {
	private String item;
	private int count = 0;
	
	public ItemWithCount(T anEntry) {
		String x = anEntry.toString();
		String[] splitX = x.split("\\|");
		item = splitX[0].replaceAll("\\s", "");
		count = Integer.parseInt(splitX[1].replaceAll("\\s", ""));
	}
	
	public void incrementCount() {
		count++;
	}
	
	public void decrementCount() {
		count--;
	}
	
	public String getItem() {
		return item;
	}
	
	public int getCount() {
		return count;
	}
	
	public String toString() {
		return item + " | " + count;
	}
}
