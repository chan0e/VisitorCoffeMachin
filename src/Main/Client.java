package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import Acceptor.Ingredient;
import Berages.Berage;
import ExtractMethod.Hot;
import ExtractMethod.Ice;
import Payimplement.Cardimplement;
import Payimplement.Cashimplement;
import Payimplement.Onlinepayimplement;
import Paymethods.Card;
import Paymethods.Cash;
import Paymethods.Onlinepay;

public class Client {
    public static void main(String[] args) throws IOException {
        // BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        System.out.println("어서오세요 음료를 선택해주세요");
        System.out.println("1. 아메리카노 2. 카페라떼  3. 모카치노");
        System.out.println("4. 초코 5. 복숭아 티");
        //
        // int number = sc.read();
        System.out.print("Client >> ");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("1. Hot    2. Ice");
                System.out.print("Client >> ");
                number = sc.nextInt();
                if(number == 1){
                    //결제 UI.
                    Berage berage = new Berage("americano", 2500);
                    new PayUI();
                    berage.accept(new Hot());
                }else if(number == 2){

                    Berage berage = new Berage("americano", 3000);
                    new PayUI();
                    berage.accept(new Ice());
                }
                break;

            case 2 : 
                System.out.println("1. Hot    2. Ice");
                number = sc.nextInt();
                System.out.print("Client >> ");
                if(number == 1){
                    //결제 UI.
                    Berage berage = new Berage("caffelatte", 3500);
                    new PayUI();
                    berage.accept(new Hot());
                }else if(number == 2){   //결제 UI.
                    Berage berage = new Berage("caffelatte", 4000);
                    new PayUI();
                    berage.accept(new Ice());
                }
                break;


            case 3 : 
            System.out.println("1. Hot    2. Ice");
            System.out.print("Client >> ");
            number = sc.nextInt();
            if(number == 1){
                //결제 UI.
                Berage berage = new Berage("mocachino", 5500);
                new PayUI();
                berage.accept(new Hot());
            }else if(number == 2){
                Berage berage = new Berage("mocachino", 6000);
                new PayUI();
                berage.accept(new Ice());

            }
            break;

            case 4 : 
            System.out.println("1. Hot    2. Ice");
            System.out.print("Client >> ");
            number = sc.nextInt();
            if(number == 1){
                //결제 UI.
                Berage berage = new Berage("choco", 5500);
                new PayUI();
                berage.accept(new Hot());
            }else if(number == 2){

                Berage berage = new Berage("mocachino", 6000);
                new PayUI();
                berage.accept(new Ice());
            }
            break;


            case 5 : 
            System.out.println("1. Hot    2. Ice");
            System.out.print("Client >> ");
            number = sc.nextInt();
            if(number == 1){
                //결제 UI.
                Berage berage = new Berage("PeachTea", 1500);
                new PayUI();
                berage.accept(new Hot());
            }else if(number == 2){

                Berage berage = new Berage("PeachTea", 2000);
                new PayUI();
                berage.accept(new Ice());
            }
            break;
                
            default:
                System.out.println("no case");
            
        }

        sc.close();
    }

}
