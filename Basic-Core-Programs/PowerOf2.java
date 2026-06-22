package basicsPgms;

public class PowerOf2 {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide the value of N.");
            return;
        }

        int n = Integer.parseInt(args[0]);

        if (n < 0 || n >= 31) {
            System.out.println("Please enter a value between 0 and 30.");
            return;
        }

        int power = 1;

        for (int i = 0; i <= n; i++) {
            System.out.println("2^" + i + " = " + power);
            power = power * 2;
        }
    }
}
