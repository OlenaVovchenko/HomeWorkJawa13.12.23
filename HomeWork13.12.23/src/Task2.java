import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.println("Год високосный ");
        } else if (year % 100 == 0) {
            System.out.println("Год не високосный");
        } else if (year % 4 != 0){
            System.out.println("Год не високосный");
        } else {
            System.out.println("Год високосный ");
        }


        }

   }

   // Реализуйте программу, которая попросит пользователя ввести год и напечатать этот
// год isLeap (високосный) или нет.