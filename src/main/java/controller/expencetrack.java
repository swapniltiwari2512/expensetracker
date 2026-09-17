package controller;

import java.security.cert.TrustAnchor;
import java.util.Scanner;
import service.inputhandler;

public class expencetrack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please press enter to access the application");

        sc.nextLine();
        callingInput();


    }

    public static void callingInput(){


        System.out.println("Please enter number as input to access the interface of the project");
        System.out.println("1. Want to add new expence");
        System.out.println("2. Want to preview your expence");
        System.out.println("3. Want to preview your expence Category wise");
        System.out.println("4. Exit");

        System.out.print("Provide your input : ");
        Scanner sc =  new Scanner(System.in);
        int numinput = sc.nextInt();

        try {
            inputhandler.getInputValue(numinput);
        } catch (Exception e) {
            throw new RuntimeException(e);

        }


    }

}
