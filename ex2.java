package homework_2;
/*
 * Исправить код 
 */
public class ex2 {

    public static void Ex2(){

    int[] intArray = {36,1,2,9,258,7,7,5,8};
        try {
            int d = 0;
            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    public static void main(String[] args) {
        Ex2();
    }
}

