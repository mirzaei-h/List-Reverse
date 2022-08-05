import java.util.*;

public class ListReverse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        ////list1
        System.out.println("PLZ enter your first List's length:");
        int listLenght1 = s.nextInt();
        list1 = createReverseList(list1, listLenght1);
        System.out.println("Reverse List 1: "+ list1);
        ////list2
        System.out.println("PLZ enter your Second List's length:");
        int listLenght = s.nextInt();
        list2 = createReverseList(list2, listLenght);
        System.out.println("Reverse List 2: "+ list2);
        ////sum
        Integer num1 = convertInt(list1);
        Integer num2 = convertInt(list2);
        Integer result = num1 + num2;

        /// Result
        String result1 = String.valueOf(result);
        String reversed = reverseString(result1);
        char[] finalList = reversed.toCharArray();
        System.out.println("Result: " + Arrays.toString(finalList));


    }
    public static List<Integer> createReverseList(List<Integer> list, int listLenght ) {
        Scanner s1 = new Scanner(System.in);
        for (int i = 0; i < listLenght; i++) {
            System.out.println("PLZ enter a number between 0 - 9:");
            int numberAddToList = s1.nextInt();
            list.add(numberAddToList);
        }
        System.out.println("list: "+ list);
        Collections.reverse(list);
        return list;
    }
    public static int convertInt(List<Integer> list){
        int sum = 0;
        for (int i : list) {sum = sum * 10 + i;}
        return sum;
    }
    public static String reverseString(String s) {
        return reverseString(s.substring(1)) + s.charAt(0);
    }

}
