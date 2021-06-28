package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "Erlan";
        int age = 19;
        boolean isSunny = true;
        int temp = 27;
        if (isSunny && temp < 30 & age > 20 & age < 45 & temp > -20  ){
            System.out.println(name + " может сегодня гулять");
        }
        else if (isSunny && temp > 0 & temp < 28 & age < 20  ){
            System.out.println(name +" может сегодня гулять");
        }
        else if (isSunny && temp > -10 & age > 45 & temp < 25){
            System.out.println(name + " может сегодня гулять");
        }
        else {
            System.out.println("гулять сегодня нельзя"); }
    }


}
