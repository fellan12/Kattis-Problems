
public class Oddities {
  static Kattio io = new Kattio(System.in, System.out);

	public static void main(String[] args) {
    int n = io.getInt();

    int value = 0;
    for (int i = 0; i < n; i++) {
      value = io.getInt();
      if(value % 2 == 0){
        io.println(value + " is even");
      } else {
        io.println(value + " is odd");
      }
    }
    io.close();
	}
}
