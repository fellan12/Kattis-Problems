public class Sjecista {
  public static void main(String[] args) {
    Kattio io = new Kattio(System.in, System.out);
    int n = io.getInt();
    io.println(n * (n - 1) * (n - 2) * (n - 3) / (1 * 2 * 3 * 4));
    io.close();
  }
}
