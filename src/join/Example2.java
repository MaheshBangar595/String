package join;

public class Example2 {
	public static void main(String[] args) {
		String date = String.join("/", "31", "07", "2022");
		System.out.print(date);
		String time = String.join(":", "12", "10", "10");
		System.out.println(" " + time);
	}
}
