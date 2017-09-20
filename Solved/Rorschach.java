public class Rorschach {
  static Kattio io = new Kattio(System.in, System.out);
  public static void main(String[] args) {
    int n = io.getInt();
    int length = io.getInt();
    boolean yes = true;
    for (int i = 0; i < n; i++) {
      StringBuilder str = new StringBuilder();
      StringBuilder str1 = new StringBuilder();
      StringBuilder str2 = new StringBuilder();
      int interval1 = 0;
      int interval2 = 0;
      if(length % 2 == 0){
        interval1 = length/2;
        interval2 = length/2;
      }else{
        interval1 = length/2;
        interval2 = length/2 + 1;
      }

      str.append(io.getWord());

      str1.append(str.substring(0,interval1));
      str2.append(str.substring(interval2, str.length()));

      // System.out.println(str1.toString());
      // System.out.println(str2.toString());
      if(!str1.toString().equals(str2.reverse().toString())){
        yes = false;
        break;
      }
    }

    if(yes){
      io.println("Ja");
    }else{
      io.println("Nej");
    }

    io.close();
  }
}
