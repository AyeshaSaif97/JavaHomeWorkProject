public class  T5ProjectFive {
    public static void main(String[] args) {
        /*
        Write a program to swap 2 numbers without a temporary variable?
         */

int a=10;
int b=20;

        System.out.println(" num 1 = " +a);
        System.out.println(" num 2 = " +b);

a=a-b;
b=a+b;
a=b-a;

        System.out.println(" num 1 = " +a);
        System.out.println(" num 2 = " +b);

    }
}
