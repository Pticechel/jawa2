import java.util.Scanner;

public class Starter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Бухгалтерия моиУслуги = Бухгалтерия.Инициализация();
        System.out.println("Бухгалтериия готова к работе!");
        System.out.println("Идентификация клиента!");
        System.out.println("ФИО > ");
        String фиоКлиента = sc.nextLine();
        System.out.println("Айди клианта > ");
        String чекУслуги = sc.next();
        Клиент клиент = new Клиент();
        int операция = 0;
        do {
            System.out.print("Уважаемый" + клиент.Name + клиент.SurName + ", Выберите действие:\n1 - Вывод каталога\n"
            + "2 - Запрос Услуги\n3 -Сдача услуги\n" +
                    "0 - выход\n Ваш выбор>");
            операция = sc.nextInt();
            switch (операция){
                case 1: моиУслуги.Каталог(); break;
                case 2:
                    System.out.print("Код услуги?> ");
                    String кодУслуги = sc.next();
                    моиУслуги.ОказаниеУслуг(кодУслуги,клиент);
                    break;
            }
        }while (операция !=0);
        sc.close();
        System.out.println("Бухгалтерия. Работа завершена!");

    }
}
