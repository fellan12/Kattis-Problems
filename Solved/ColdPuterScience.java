public class ColdPuterScience {
    static Kattio io = new Kattio(System.in,System.out);

    public static void main(String[] args) {
        int n = io.getInt();
        int belowZero = 0;
        for (int i = 0; i < n; i++) {
            if (io.getInt() < 0)
                belowZero++;
        }
        io.println(belowZero);
        io.close();
    }
}
