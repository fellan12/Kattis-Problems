
public class ReversedBinaryNumbers {
  static Kattio io = new Kattio(System.in, System.out);

	public static void main(String[] args) {

		String binaryString = Integer.toBinaryString(io.getInt());

		String reverseBinaryString = "";

		for (int i = 0; i < binaryString.length(); i++) {
			reverseBinaryString += binaryString.charAt(binaryString.length() - i - 1);
		}

		int newNum = Integer.parseInt(reverseBinaryString, 2);

		io.println(Integer.toString(newNum));
    io.close();
	}
}
