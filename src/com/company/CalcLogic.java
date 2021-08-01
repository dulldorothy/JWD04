package com.company;

import java.util.Scanner;

public class CalcLogic {
    Scanner sc = new Scanner(System.in);

    public void div() {
        System.out.print("a:");
        String a = sc.nextLine();
        System.out.print("b:");
        String b = sc.nextLine();
        System.out.print("Result: ");
        System.out.println(Double.parseDouble(a) / Double.parseDouble(b));

    }

    public void mult() {
        System.out.print("a:");
        String a = sc.nextLine();
        System.out.print("b:");
        String b = sc.nextLine();
        System.out.print("Result: ");
        if (a.contains(".") || b.contains("."))
        {
            System.out.println(Double.parseDouble(a) * Double.parseDouble(b));
        }else
        {
            System.out.println(Integer.parseInt(a) * Integer.parseInt(b));
        }
    }

    public void sub() {
        System.out.print("a:");
        String a = sc.nextLine();
        System.out.print("b:");
        String b = sc.nextLine();
        System.out.print("Result: ");
        if (a.contains(".") || b.contains("."))
        {
            System.out.println(Double.parseDouble(a) - Double.parseDouble(b));
        }else
        {
            System.out.println(Integer.parseInt(a) - Integer.parseInt(b));
        }
    }

    public void add() {
        System.out.print("a:");
        String a = sc.nextLine();
        System.out.print("b:");
        String b = sc.nextLine();
        System.out.print("Result: ");
        if (a.contains(".") || b.contains("."))
        {
            System.out.println(Double.parseDouble(a) + Double.parseDouble(b));
        }else
        {
            System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
        }
    }
    public void sqrt(){
        System.out.print("a:");
        String a = sc.nextLine();
        System.out.println(Math.sqrt(Double.parseDouble(a)));
    }

    public void exp()
    {
        System.out.print("a:");
        String a = sc.nextLine();
        System.out.print("b:");
        String b = sc.nextLine();
        System.out.print("Result: ");
        System.out.println(Math.pow(Double.parseDouble(a),Double.parseDouble(b)));
    }


}
