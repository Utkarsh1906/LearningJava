package com.utkarsh.RecursionQuestions.RecursionWithStrings;

public class SkipString {
    public static void main(String[] args) {
        String name="utkarshkaragrawalkarra";
        String remove="kar";
        String ans="";
        System.out.println(skipString(name,remove,ans));
        System.out.println(skipString(name,remove));
    }
    private static String skipString(String name, String remove) {
        if(name.isEmpty())
            return "";
        //String temp=name.substring(0,remove.length());
        if(!name.startsWith(remove))
        {
            return name.charAt(0) + skipString(name.substring(1),remove);
        }
        else
            return skipString(name.substring(remove.length()),remove);

    }

    private static String skipString(String name, String remove,String ans) {
        if(name.length()<remove.length())
        {
            ans=ans+name;
            return ans;
        }
        String temp=name.substring(0,remove.length());
        if(temp.equals(remove))
           return skipString(name.substring(remove.length()),remove,ans);
        else
           return name.charAt(0)+skipString(name.substring(1),remove,ans);

    }
}
