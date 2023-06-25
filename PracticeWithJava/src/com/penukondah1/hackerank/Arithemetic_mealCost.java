package com.penukondah1.hackerank;
import java.util.*;

public class Arithemetic_mealCost {
	
	    static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        double meal_cost = scanner.nextDouble();
	        int tip_percent = scanner.nextInt();
	        int tax_percent = scanner.nextInt();
	        scanner.close();

	        double tip = meal_cost * tip_percent / 100;
	        double tax = meal_cost * tax_percent / 100;

	        int total_cost = (int)Math.round(meal_cost+tip+tax);
	        System.out.println(total_cost);
	    }
	}



