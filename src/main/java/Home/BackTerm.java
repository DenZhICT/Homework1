package Home;

import java.util.Scanner;
public class BackTerm {
    String name;
    int kolv;
    public BackTerm(String name, int kolv) {
        this.name = this.checkName(name);
        this.kolv = this.checkKolv(kolv);
        switch (this.name) {
            case "Пепперони":
                Peperoni pizp = new Peperoni();
                System.out.println("Стоимость вашего заказа составляет: " + (pizp.cost()*this.kolv) +" рублей.\nЗаказ № "+ ((int)(Math.random()*100 + 1))+" будет готов через "+pizp.allt()+" минут"+this.end(pizp.allt())+".\nСпасибо за покупку!");
                break;
            case "Барбекю":
                BBQ pizb = new BBQ();
                System.out.println("Стоимость вашего заказа составляет: " + (pizb.cost()*this.kolv) +" рублей.\nЗаказ № "+ ((int)(Math.random()*100 + 1))+" будет готов через "+pizb.allt()+" минут"+this.end(pizb.allt())+".\nСпасибо за покупку!");
                break;
            case "Дары моря":
                Seagifts pizs = new Seagifts();
                System.out.println("Стоимость вашего заказа составляет: " + (pizs.cost()*this.kolv) +" рублей.\nЗаказ № "+ ((int)(Math.random()*100 + 1))+" будет готов через "+pizs.allt()+" минут"+this.end(pizs.allt())+".\nСпасибо за покупку!");
                break;
            case "Гавайская":
                ONELOVE pizo = new ONELOVE();
                System.out.println("Стоимость вашего заказа составляет: " + (pizo.cost()*this.kolv) +" рублей.\nЗаказ № "+ ((int)(Math.random()*100 + 1))+" будет готов через "+pizo.allt()+" минут"+this.end(pizo.allt())+".\nСпасибо за покупку!");
                break;
        }
    }
    public String checkName(String name){
        String newName = name;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        do {
            switch (newName){
                case "Пепперони":
                case "Барбекю":
                case "Дары моря":
                case "Гавайская":
                    flag = false;
                    break;
                default:
                    System.out.print("Введённая вами пицца отсутствует, пожалуйства, введите существующую: ");
                    newName = sc.nextLine();
            }
        } while (flag);
        return newName;
    }
    public int checkKolv(int kolv) {
        int newKolv = kolv;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        do {
            if (newKolv>0){
                flag = false;
            }else{
                System.out.print("Данное значение недоступно, введите натуральное число: ");
                try {
                    newKolv = sc.nextInt();
                } catch (java.util.InputMismatchException e) {
                    newKolv = -1;sc.nextLine();
                }
            }
        } while (flag);
        return newKolv;
    }
    public String end(int time){
        String rez;
        if (time % 10 == 1 && time % 100 != 11){
            rez = "у";
        } else if ((time % 10 == 2 ||time % 10 ==3 ||time % 10 ==4)&&!(time % 100 == 12 || time % 100 ==13 || time % 100 ==14)) {
            rez = "ы";
        } else{
            rez = "";
        }
    return rez;
    }
}

