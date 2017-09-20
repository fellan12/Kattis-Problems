public class Bijele {
  static Kattio io = new Kattio(System.in,System.out);

  public static void main(String[] args) {
    int[] def = {1 , 1 , 2 , 2 , 2 , 8};

    for (int i = 0; i < 6; i++){
      io.print((def[i] - io.getInt()) + " ");
    }

    io.close();
  }
}
