public class Spavanac {
  static Kattio io = new Kattio(System.in, System.out);

  public static void main(String[] args) {
    int hr = io.getInt();
    int min = io.getInt();

    int diff = min - 45;

    //Calc min
    if(diff < 0){
      min = 60 + diff;

      // Calc hr
      int diffH = hr - 1;
      if(diffH < 0){
        hr = 23;
      }
      else{
        hr--;
      }
    }
    else{
      min = diff;
    }

    io.println(hr + " " + min);
    io.close();
  }


}
