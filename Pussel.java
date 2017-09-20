
public class Pussel {

  public static void main(String[] args) {
    Kattio io = new Kattio(System.in, System.out);

    int x = io.getInt();
    int y = io.getInt();

    int n = (x-2)*(y-2);
    int k = (x*y)-n;

    double totalSeconds1 = 0;
    double totalSeconds2 = 0;
    for (int i = 1; i <= k; i++) {
      totalSeconds1 += Math.pow(1.001, i);
    }
    for (int i = 1; i <= n; i++) {
      totalSeconds2 += Math.pow(1.01, i);
    }

    long totalSeconds = (long)(totalSeconds1 +totalSeconds2);  //Total totalSeconds in seconds

    long num_of_years = totalSeconds/(365*24*3600);

    totalSeconds -= num_of_years*365*24*3600;         //Remove years from total

    long num_of_days = totalSeconds/(24*3600);

    totalSeconds -= num_of_days*(24*3600);            //Remove days from total

    long num_of_hours = totalSeconds/3600;

    totalSeconds -= num_of_hours*3600;                //Remove hours from total

    long num_of_minutes = totalSeconds/60;

    totalSeconds -= num_of_minutes*60;                //Remove minus from total

    long num_of_seconds = totalSeconds;

    System.out.print(num_of_years + " " + num_of_days + " " + num_of_hours + " " + num_of_minutes + " " + num_of_seconds);

  }
}
