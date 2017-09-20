public class Autori {
  static Kattio io = new Kattio(System.in,System.out);

  public static void main(String[] args) {
    String[] name = io.getWord().split("-");

    for (String part : name) {
      io.print(part.charAt(0));
    }
    io.close();
  }
}
