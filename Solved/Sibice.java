
public class Sibice {
  static Kattio io = new Kattio(System.in, System.out);

  public static void main(String[] args) {
    int n = io.getInt();
    int w = io.getInt();
    int h = io.getInt();

    int x = 0;
    for(int i = 0; i < n; i++){
        x = io.getInt();
        if((x*x) <= ((w*w) + (h*h))){
            io.println("DA");
            continue;
        }
        io.println("NE");
    }
    io.close();
  }
}
