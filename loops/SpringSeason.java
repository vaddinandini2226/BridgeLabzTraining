package basicsPgms;

public class SpringSeason {
    public static void main(String[] args) {

        // Check if two command-line arguments are provided
        if (args.length != 2) {
            System.out.println("Usage: java SpringSeason <month> <day>");
            return;
        }

        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        boolean isSpring =
                (m == 3 && d >= 20) ||
                (m == 4) ||
                (m == 5) ||
                (m == 6 && d <= 20);

        System.out.println(isSpring);
    }
}
