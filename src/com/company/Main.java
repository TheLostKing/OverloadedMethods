package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner scan = new Scanner(System.in);
        int result;
        String name, bName, phone;

        System.out.println("Which customer type are you:\n1. Residential\n2. Business");
        result = scan.nextInt();

        switch (result){
            case 1:
                System.out.print("What is your name?");
                name = scan.next();
                System.out.print("What is your phone number");
                phone = scan.next();
                customer(name, phone);
                break;
            case 2:
                System.out.print("What is your business's name? ");
                bName = scan.next();
                System.out.print("What is your name? ");
                name = scan.next();
                System.out.print("What is your phone number? ");
                phone = scan.next();
                customer(bName, name, phone);

        }
    }

    public static void customer(String name, String phone){
        System.out.print("Your name is " + name + "and your phone is " + phone);
    }

    public static void customer(String bName, String cName, String phone){

        System.out.print("Your business's name is" + bName + ", Your name is " + cName + ", and your phone is " + phone);
    }
}
