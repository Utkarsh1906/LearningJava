package com.utkarsh.RecursionQuestions.RecursionWithStrings;

import java.util.ArrayList;

public class SubsequenceWithAscii {
    public static void main(String[] args) {
        String name="ab";
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
        ans.addAll(subsequence(p+(up.charAt(0)+0),up.substring(1)));
        return ans;

    }
}
