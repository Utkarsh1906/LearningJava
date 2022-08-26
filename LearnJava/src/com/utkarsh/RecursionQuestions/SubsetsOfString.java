package com.utkarsh.RecursionQuestions;

import java.util.ArrayList;

public class SubsetsOfString {
    public static void main(String[] args) {
        String name="abc";
        String up="";
        ArrayList<String> ans=new ArrayList<>();
        subset("",name,ans);
        System.out.println(ans);
    }

    private static void subset(String p,String up, ArrayList<String> ans) {
        if(up.isEmpty())
        {
            ans.add(p);
            return;
        }
        subset(p+up.charAt(0),up.substring(1),ans);
        subset(p,up.substring(1),ans);
    }
}
