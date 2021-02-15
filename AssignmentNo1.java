public class AssignmentNo1 {

    public static void main(String[] args) {
        System.out.println("Method FOR");
        arrayForLoop();
        System.out.println("Method FOR EACH");
        arrayForEachLoop();
        System.out.println("Method WHILE");
        arrayWhileLoop();
        System.out.println("Method DO WHILE");
        arrayDoWhileLoop();
        System.out.println("The best method for this Assignment is FOR EACH.");
    }

    static int[] myArray = {5, 3, 7, 6, 2, 8};

    public static void arrayForLoop() {
        for (int i = 0; i < myArray.length; i++)
            System.out.println(myArray[i]);
    }

    public static void arrayForEachLoop() {
        for (int temArray : myArray) {
            System.out.println(temArray);
        }
    }

    public static void arrayWhileLoop() {
        int i = 0;
        while (i < myArray.length) {
            System.out.println(myArray[i]);
            i++;
        }
    }

    public static void arrayDoWhileLoop() {
        int i = 0;
        do {
            System.out.println(myArray[i]);
            i++;
        }
        while (i < myArray.length);
    }

}
