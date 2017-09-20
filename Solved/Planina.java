
public class Planina {
  static Kattio io = new Kattio(System.in, System.out);

	public static void main(String[] args) {
    io.println((int) Math.pow((Math.pow(2, io.getInt()) + 1), 2));
    io.close();
	}
}
