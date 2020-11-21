package lesson11;

public class Question11_5 {
	String playername;

	public Question11_5(String name) {
		playername = name;
	}

	@Override
	public String toString() {
		return "[player: "  + playername + "]";
	}

	public static void main(String[] args) {
		Question11_5[] player = new Question11_5[3];
		player[0] = new Question11_5("Mad Hantter");
		player[1] = new Question11_5("March Hare");
		player[2] = new Question11_5("Alice");
		for(int i = 0; i < player.length; i++) {
			System.out.println(player[i]);
		}
	}
}
