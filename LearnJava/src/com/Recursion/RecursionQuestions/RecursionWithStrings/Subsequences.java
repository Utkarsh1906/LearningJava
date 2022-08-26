package com.utkarsh.RecursionQuestions.RecursionWithStrings;

import java.util.ArrayList;
import java.util.Collections;

public class Subsequences {
    public static void main(String[] args) {
        String name="abc";
        char[] arr=name.toCharArray();

        ArrayList<String> answer=subsequence("",name);
        System.out.println(answer);
    }
    static ArrayList<String> subsequence(String p,String up)
    {
        ArrayList<String> ans=new ArrayList<>();
        if(up.isEmpty())
        {
            ans.add(p);
            return ans;
        }
        ans.addAll(subsequence(p+up.charAt(0),up.substring(1)));
        ans.addAll(subsequence(p,up.substring(1)));
        return ans;

    }


    private static void subsequence(String p,String up, ArrayList<String> ans) {
        if(up.isEmpty())
        {
            ans.add(p);
            return;
        }
        subsequence(p+up.charAt(0),up.substring(1),ans);
        subsequence(p,up.substring(1),ans);
    }
}
