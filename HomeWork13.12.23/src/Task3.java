import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter third number:");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(" Max number is " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(" Max number is " +num2);
        } else {
            System.out.println(" Max number is " +num3);
        }
    }
}
//    Реализуйте программу, которая попросит пользователя ввести три целых числа
//        (используйте сканер) и напечатает мксимум из трех чисел.