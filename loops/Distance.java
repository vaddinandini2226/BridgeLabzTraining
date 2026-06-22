package basicsPgms;

public class Distance {
    public static void main(String[] args) {

        // Check if two command-line arguments are provided
        if (args.length != 2) {
            System.out.println("Usage: java Distance <x> <y>");
            return;
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println("Distance from origin = " + distance);
    }
}
