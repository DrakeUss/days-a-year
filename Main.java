import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int point = 0;
        boolean x = true;

        while (x) {
            System.out.println("Введите год: ");
            int year = sc.nextInt();
            System.out.println("Введите количество дней: ");
            int days = sc.nextInt();
            if (year % 400 == 0 || year % 4 == 0) {
                if (days % 2 == 0) {
                    point++;
                }else {
                    System.out.println("Неправильно! В этом году 366 дней!");
                    System.out.println("Набранно очков " + point);
                    break;
                }
            } else if (year % 4 != 0) {
                if (days % 2 == 1) {
                    point++;
                }
                else {
                    System.out.println("Неправильно! В этом году 365 дней!");
                    System.out.println("Набранно очков " + point);
                    break;
                }
            }
        }
    }
}


