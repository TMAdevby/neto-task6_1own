import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] products = new String[] {"Молоко","Хлеб","Гречневая крупа"};

        int[] prices = new int[] {50,14,80};


        int maney = 0;

        System.out.println("Ваша корзина : ");
        while(true) {
        String s = sc.nextLine();
        if(s.equals("end")){
            break;
        }
        String[] parts = s.split(" ");
        int productNumber = Integer.parseInt(parts[0]) - 1;
        int quantity = Integer.parseInt(parts[1]);
        System.out.printf("%s %d шт. %d руб/шт %d руб в сумме",
                products[productNumber], quantity, prices[productNumber],(prices[productNumber] * quantity) );
        maney += prices[productNumber] * quantity;
        }



        System.out.println("Итого : " + maney + " руб.");


    }
}