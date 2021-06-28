package com.company;

public class Main {

    public static void main(String[] args) {
	String name = "Erlan";
	int age = 19;
	int temp = 27;
	if (age <=45 & age > 20 & temp < 30 & temp > -20){
        System.out.println(name + " может сегодня гулять");
    }
	else if(age < 20 & temp > 0 & temp < 28){
        System.out.println(name + " может сегодня гулять");
    }
	else if (age > 45 & temp > -10 & temp < 25){
        System.out.println(name + "может сегодня гулять");
    }
	else {
        System.out.println("сегодня гулять нельзя");
    }
    }
}
