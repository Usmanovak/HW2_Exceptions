package homework_2;

import java.util.Scanner;

/*
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class ex1 {

    public static float Ex1(){
        
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите дробное число: ");
            float num = Float.parseFloat(scanner.nextLine());
            return num;
        } catch (NumberFormatException e){
            System.out.println("Ошибка! Повторите ввод дробного числа: ");
        }
        return 0;
    }

    public static void main(String[] args) {
        Ex1();
    }
}
    

