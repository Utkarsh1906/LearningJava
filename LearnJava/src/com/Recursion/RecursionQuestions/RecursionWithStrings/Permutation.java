package com.Recursion.RecursionQuestions.RecursionWithStrings;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String name="abc";
        ArrayList<String> list;
        //permutation("",name,list);
        list=(permutation("",name));
        System.out.println(list);

    }
    static ArrayList<String> permutation(String p,String up){
        ArrayList<String> list=new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        for(int i=0;i<=p.length();i++){
            if(i==0){
                list.addAll(permutation(""+up.charAt(0)+p,up.substring(1)));
            }
            else {
                list.addAll(permutation(p.substring(0, i) + up.charAt(0) + p.substring(i), up.substring(1)));
            }
        }
        return list;
    }
    static void permutation(String p,String up,ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        for(int i=0;i<=p.length();i++){
            if(i==0){
                permutation(""+up.charAt(0)+p,up.substring(1),list);
            }
            else
               permutation(p.substring(0,i)+up.charAt(0)+p.substring(i),up.substring(1),list);
        }

    }
}
