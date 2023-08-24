public class T1ProjectOne {
    public static void main(String[] args) {
        /*
        Create a program that uses an array to store a list of temperatures for
a week, and then uses a loop to find the highest and lowest
temperature for the week.


shift 0= toggle between overwrite
         */

        int[] temperature = {16,21, 29, 25,30, 40, 12};

        int largest = temperature[0];
        int smallest = temperature[0];

        for (int i = 0; i < temperature.length; i++) {
            if (temperature[i] > largest) {
                largest = temperature[i];

            }if (temperature[i]<smallest){
           smallest=temperature[i];
            }


        }        System.out.println(largest);
        System.out.println(smallest);


    }
}