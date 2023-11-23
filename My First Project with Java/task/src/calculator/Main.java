package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Earned amount:\n Bubblegum: $202 \n Toffee: $118 \n Ice cream: $2250 \n Milk chocolate: $1680 \n Doughnut: $1075 \n Pancake: $80");
        int income = 202+118+2250+1680+1075+80;
        System.out.println("Income: $"+ income);

        Scanner input = new Scanner(System.in);
        System.out.println("Staff expenses:");
        int staff = input.nextInt();
        System.out.println("Other Expenses:");
        int other = input.nextInt();
        int total = (staff + other) - income;
        System.out.printf("Net income: $%d\n", total);

    }
}