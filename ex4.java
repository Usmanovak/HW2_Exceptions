package homework_2;

import java.util.Scanner;

/*
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */
public class ex4 {
    public static void Ex4(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = scanner.nextLine();
        if(string.isEmpty()){
            throw new RuntimeException("Пустые строки вводить нельзя!");
        }
        System.out.println(string);
    }
    @Override
    public String toString() {
        return "exs []";
    }


    public static void main(String[] args) {
        Ex4();
    }
}
