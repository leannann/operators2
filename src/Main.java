public class Main {
    public static void main(String[] args)
    {   // Exercise 1
        int clientOS = 1;
        if(clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Exercise 2
        clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        else if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        // Exercise 3
        int year = 2025;
        if (year >= 1584 && year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ) {
            System.out.println("Год является високосным");
        }
        else {
            System.out.println("Год не является високосным");
        }
        // Exercise 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }
        else {
            System.out.println("Доставки нет");
        }
        // Exercise 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Месяц принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("Месяц принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("Месяц принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("Месяц принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("Месяц принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("Месяц принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("Месяц принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("Месяц принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("Месяц принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("Месяц принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("Месяц принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("Месяц принадлежит к сезону зима");
                break;
            default:
                break;
        }
    }
}