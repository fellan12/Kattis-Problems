import java.util.*;

public class SpeedLimit {
  static Kattio io = new Kattio(System.in, System.out);
  public static void main(String[] args) {
    int logs = io.getInt();
    while (logs != -1) {
      ArrayList<Integer> speed = new ArrayList<Integer>();
      ArrayList<Integer> time = new ArrayList<Integer>();
      int res = 0;
      for (int i = 0; i < logs; i++) {
        speed.add(io.getInt());
        time.add(io.getInt());
      }

      res = speed.get(0) * time.get(0);

      for (int i = 1; i < speed.size(); i ++ ) {
        res += speed.get(i) * (time.get(i) - time.get(i-1));
      }
      io.println(res + " miles");
      logs = io.getInt();
    }
    io.close();
  }
}
