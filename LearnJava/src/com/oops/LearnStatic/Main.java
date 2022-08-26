package com.oops.LearnStatic;

public class Main {
    public static void main(String[] args) {
        System.out.println(Human.population);
        Human kunal=new Human(22,"kunal",10000,false);
        Human rahul=new Human(34,"rahul",15000,true);
        System.out.println(kunal.population);
        System.out.println(rahul.population);
        System.out.println(Human.population);
    }
}
