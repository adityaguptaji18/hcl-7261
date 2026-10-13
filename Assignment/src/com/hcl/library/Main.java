package library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Online Library----------");
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("1.Add Items");
            System.out.println("2. Register Member");
            System.out.println("3. Borrow");
            System.out.println("4.Return");
            System.out.println("5.WaitList");
            System.out.println("6.ListItem");
            System.out.println("7.Search");
            System.out.println("8.Export Report");
            System.out.println("9.Exit");

            int choice=sc.nextInt();
            if(choice>9 || choice<1){
                System.out.println("Invalid Choice");
            }
            switch (choice){
                case 1:

            }

        }
    }
}
