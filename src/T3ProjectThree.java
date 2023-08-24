public class T3ProjectThree {
    public static void main(String[] args) {
        /*
       Create a 2D array or integer type where you will store odd and even
numbers. Develop a program which will identify/print the even
numbers only.
         */

        int[][] numbers = {{7, 18, 16, 5, 7},
                           {10, 13, 17, 18},
                           {19, 21, 18, 12}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.println(numbers[i][j] + " ");
                }
            }


        }

    }
}
