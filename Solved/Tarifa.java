public class Tarifa {
  static Kattio io = new Kattio(System.in, System.out);
  public static void main(String[] args) {
    int x = io.getInt();
    int n = io.getInt();

    int res = x;
    for (int i = 0; i < n; i++) {
      res += x;
      res -= io.getInt();
    }

    io.println(res);
    io.close();
  }
}
