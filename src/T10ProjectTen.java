public class T10ProjectTen {
    public static void main(String[] args) {
        /*
        Write a program to print out duplicate elements from an Array of
Strings?
         */

String [] items= {"apple", "orange","kiwi","watermelon","strawberry","melon","mango","guava","pomegranate","apple","kiwi","strawberry"};

        for (int i = 0; i <items.length ; i++) {
            for (int j = i+1; j < items.length; j++) {
                if (items[i].equals(items[j])){
                    System.out.println("Duplicate items are : "+items[i]);
                    break;
                }

            }

        }

    }
}
