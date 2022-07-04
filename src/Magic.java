import java.util.Arrays;
import java.util.Scanner;

public class Magic {

    private static final int[] arr1 = {1, 3, 5, 7, 9, 11, 13, 15, 19, 21, 23, 25, 27, 29, 31};
    private static final int[] arr2 = {2, 3, 6, 7, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30, 31};
    private static final int[] arr3 = {4, 5, 6, 7, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29, 30, 31};
    private static final int[] arr4 = {8, 9, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30, 31};
    private static final int[] arr5 = {16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        intro();
        printArray(arr1);
        printArray(arr2);
        printArray(arr3);
        printArray(arr4);
        printArray(arr5);
        String result = inWhichSeriesYourNumberAppears();
        numberReveal(result);
    }

    public static void intro(){
        System.out.println("Welcome, please choose a number between 1 and 31");
    }
    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static String inWhichSeriesYourNumberAppears() {
        System.out.println("In which series your numebr appears?");
        System.out.println("for example: 1,2,4");
        String res = scanner.next();
        System.out.println("You tole me : " + res);
        return res;

    }

    public static void numberReveal(String input) {
        String[] inputs = input.split(",");
        int magicNumber = 0;
        for (String s : inputs) {
            magicNumber += val(Integer.parseInt(s));
        }
        System.out.println("Your number is " + magicNumber);
    }
    public static int val(int number) {
        switch (number) {
            case 1:
                return arr1[0];
            case 2:
                return arr2[0];
            case 3:
                return arr3[0];
            case 4:
                return arr4[0];
            case 5:
                return arr5[0];
            default:
                return 0;
        }
    }


}
