public class R2 {
  static Kattio io = new Kattio(System.in, System.out);
  public static void main(String[] args) {
    int r1 = io.getInt();
    int s = io.getInt();
    int res = ((2*s) - r1);
    io.println(res);
    io.close();
  }

}
