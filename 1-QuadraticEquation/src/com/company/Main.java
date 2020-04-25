package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c : ");

        String[] input = sc.nextLine().split(" ");
        double a = Double.parseDouble(input[0]);
        double b = Double.parseDouble(input[1]);
        double c = Double.parseDouble(input[2]);

        QuadraticEquation q = new QuadraticEquation(a,b,c);

        if (q.getDiscriminant() > 0){
            System.out.println("The equation has two roots : " + q.getRoot1() + " & " + q.getRoot2());
        }else if(q.getDiscriminant() == 0){
            System.out.println("The equation has one roots : " + q.getRoot1());
        }else{
            System.out.println("The equation has no real roots ");
        }

    }
}
