package Home;

import java.util.Scanner;

public class FrontTerm {
    public static void main(String[] args) {
        System.out.print("Меню пицц:\nПепперони\nБарбекю\nДары моря\nГавайская\nУкажите один из типов пиццы для заказа(в точноси повторите название, без лишних символов): ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Введите количество пицц(натуральное число): ");
        int kolv;
        try {
            kolv = sc.nextInt();
        } catch (java.util.InputMismatchException e){
            kolv = -1;
        }
        BackTerm bc = new BackTerm(name,kolv);
        sc.close();
    }
}

