public class T8ProjectEight {
    public static void main(String[] args) {
        /*
Maximum and minimum number in the array?
         */


        int[] number= {16,21, 29, 25,30, 40, 12};

        int maximum = number[0];
        int minimum= number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i] > maximum) {
                maximum = number[i];

            }if (number[i]<minimum){
                minimum=number[i];
            }


        }        System.out.println("The maximum number in the array is "+maximum);
                 System.out.println("The minimum number in the array is "+minimum);


    }
}
