public class AssignmentNo2 {

    public static void main(String[] args) {
        printNegativeNumbers();
        printOddNumbers();
        countOddNumbers();
        System.out.println("\nIs there multiple numbers with the same value: " + verifySameValues());
        eachSecondNumber();
        computeAverage();
    }

    static int[] newArray = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5};

    public static void printNegativeNumbers() {
        System.out.println("Negative numbers:");
        for (int i : newArray) {
            if (i < 0)
                System.out.println(i);
        }
    }

    public static void printOddNumbers() {
        System.out.println("Odd numbers:");
        for (int i : newArray) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }

    public static void countOddNumbers() {
        int counter = 0;
        for (int i : newArray) {
            if (i % 2 != 0) {
                counter++;
            }
        }
        System.out.println("In this array " + counter + " numbers are odd.");
    }

    public static boolean verifySameValues() {
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                if (newArray[i] == newArray[j] && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void eachSecondNumber() {
        System.out.println("\nPrint out each second number:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i + 1]);
            i++;
        }
    }

    public static void computeAverage() {
        double sum = 0;
        for (int a : newArray)
            sum += a;
        double average = sum / newArray.length;
        System.out.println("\nAverage value of the array is: " + average);
        int belowAverage = 0;
        for (int b : newArray) {
            if (b < average) {
                belowAverage++;
            }
        }
        System.out.println("\n" + belowAverage + " numbers are smaller than average value.");
    }
}
