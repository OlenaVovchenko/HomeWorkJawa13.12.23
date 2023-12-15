import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое число для получения суммы всех чисел:");
        int number = sc.nextInt();

        int sum = 0;
        for (; number > 0; number /= 10){
            sum += number%10;
        }
        System.out.println("Сумма равна: " + sum);
    }
}
//    Для введённого пользователем с клавиатуры натурального числа посчитайте
//    сумму всех его цифр (заранее не известно сколько цифр будет в числе).
//
//
//        Например:
//        Ввод = 12345
//        Вывод = 1+2+3+4+5 = 15
