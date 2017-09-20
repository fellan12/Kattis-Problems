
public class Trik {

  static Kattio io = new Kattio(System.in, System.out);
  public static void main(String[] args) {

    int ball = 0;
    String moves = io.getWord();

    for (int i = 0; i < moves.length(); i++){
      if (moves.charAt(i) == 'A' && ball != 2){
        ball = 1 - ball;
      } else if (moves.charAt(i) == 'B' && ball != 0){
        ball = -ball + 3;
      } else if (moves.charAt(i) == 'C' && ball != 1){
        ball = -ball + 2;
      }
    }

    io.println(ball + 1);
    io.close();
  }
}
