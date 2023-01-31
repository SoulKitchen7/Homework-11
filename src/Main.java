import java.time.LocalDate;

public class Main {
    // task-1
    public static void main(String[] args) {
        System.out.println("Задача - 1");
        System.out.println("");
        isYearLeap(2020);
        isYearLeap(2000);
        isYearLeap(2004);
        isYearLeap(2023);
        System.out.println("");
        System.out.println("Задача - 2");
        System.out.println("");
        determineOSVersion(0, 2005);
        determineOSVersion(1, 2023);
        System.out.println("");
        System.out.println("Задача - 3");
        System.out.println("");
        int time = deliveryDistance(110);
        System.out.println("Потребуется дней:" + time);
    }

    public static void isYearLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - не високосный год");
        }

    }

    // task - 2
    public static void determineOSVersion(int osType, int yearDevice) {

        int currentYear = LocalDate.now().getYear();
        if (osType == 0) {
            if (yearDevice == currentYear) {
                System.out.println("Установить обычную версию iOS");
            } else {
                System.out.println("Установить облегченную версию iOS");
            }
        } else {
            if (yearDevice == currentYear) {
                System.out.println("Установить обычную версию Android");
            } else {
                System.out.println("Установить облегченную версию Android");
            }
        }
    }

    public static int deliveryDistance (int distance) {
        int time = 1;
        if (distance >= 20 && distance <= 60) {
            ++time;
        }
        if (distance > 60 && distance <= 100) {
            time=time+2;
        }
        if (distance > 100) {
            System.out.println("Доставка не осуществляется");
            return -1;
        }
        return time;
    }
}
