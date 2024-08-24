package hw4.lesson4.task2;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        FactoryProvider factoryProvider = new FactoryProvider();
        DealerProvider dealerProvider = new DealerProvider(factoryProvider);

//        ComponentInfo componentInfo = dealerProvider.getComponen(900003);
//        if (componentInfo != null)
//            System.out.println(componentInfo);

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Укажите номер детали: #");
            int no = Integer.parseInt(scanner.nextLine());
            if (no < 0) {
                System.out.println("Укажите корректный номер детали, который должен быть больше 0");
                continue;
            }
            try {
                ComponentInfo componentInfo = dealerProvider.getComponen(no);
                System.out.println(componentInfo);
                break;
            }
            catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
