public class Pot {
  static Kattio io = new Kattio(System.in, System.out);
  public static void main(String[] args) {
    int numOfTests = io.getInt();
    long sum = 0;
    for (int i = 0; i < numOfTests; i++)
    {
      int num = io.getInt();
      sum += Math.pow(num / 10, num % 10);
    }

    io.println(sum);
    io.close();
  }

}
