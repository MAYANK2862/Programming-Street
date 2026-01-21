public class Fibonacci {
    public static void main(String[] args) {

        int limit = 10;

        int a = 0;  
        int b = 1;   

        System.out.print(a + " " + b + " ");

        int next;

        while (true) {
            next = a + b;

            if (next > limit) {
                break;
            }

            System.out.print(next + " ");

            a = b;
            b = next;
        }
    }
}
