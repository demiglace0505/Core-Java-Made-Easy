package java13and14;

public class SwitchExpressionDemo {
	public static void main(String[] args) {
		int key = 1;
		String result = switch (key) {
		case 2: {
			yield "Choice 1";
		}
		default:
			yield "Invalid Choice";
		};
		System.out.println(result);
		
		int choice = 1;
		String response = switch (key) {
		case 1 -> {
			yield "You have 0 balance";
		}
		case 2 -> {
			yield "You can get a loan";
		}
		case 3 -> {
			yield "Deposit money";
		}
		default ->
			throw new IllegalArgumentException("Unexpected value: " + key);
		};
		System.out.println(response);
	}
}
