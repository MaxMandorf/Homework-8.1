public class Main {
    public static void main(String[] args) {
        printIsLeap(2020);
        printCalculateDeliveryDays(100);
    }

    private static void printIsLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Високосныый год");
        } else {
            System.out.println("Не високосный год");
        }

    }

    private static void printInstallationMessage(int os, int productionYear) {
        String versionMessage = productionYear < 2015 ? "облегченную" : "";
        String osMessage = os == 0 ? "IOS" : "android";
        System.out.printf("Установите %s версию приложения для %s по ссылке", versionMessage, osMessage);

        if (os == 0) {
            if (productionYear < 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        } else {
            if (productionYear < 2015) {
                System.out.println("Установите облегченную версию приложения для android по ссылке");
            } else {
                System.out.println("Установите версию приложения для android по ссылке");
            }
        }
    }

    private static void printCalculateDeliveryDays(int distance) {
        int start = 20;
        int step = 40;
        int result;
        if (distance < start) {
            result = 1;
        } else {
            result = (Math.abs((distance - start) / step) + 2);
        }
        System.out.println("Потребуется дней для доставки " + result);
    }
}