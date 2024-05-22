package com.example.myfistproject;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Scanner;
public class HelloApplication {
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        System.out.println("Please introduce a new number: ");
        int numberA=read.nextInt();
        Scanner readOther=new Scanner(System.in);
        System.out.println("Please introduce a new number: ");
        int numberB=readOther.nextInt();
        int sum= numberB + numberA;
        System.out.println("Result of sum is: " + sum);
        double division;
        division= (double) numberA / numberB;
        System.out.println("Result: " + division);
    }
}