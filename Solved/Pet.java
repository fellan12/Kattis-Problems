
public class Pet {
  static Kattio io = new Kattio(System.in, System.out);

	public static void main(String[] args) {
    int res = -1;
    int current = 0;
    int currentBest = 0;
    for (int i = 1; i <= 5 ; i++) {
      currentBest = io.getInt() + io.getInt() + io.getInt() + io.getInt();
      if(currentBest > res){
        res = currentBest;
        current = i;
      }
    }
    io.println(current + " " + res);
    io.close();
	}
}
