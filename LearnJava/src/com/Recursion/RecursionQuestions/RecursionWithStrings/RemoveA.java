package com.utkarsh.RecursionQuestions.RecursionWithStrings;

public class RemoveA {
    public static void main(String[] args) {
        String name="utkarshagrawala";

        StringBuilder builder=new StringBuilder();
        removeA(name,builder,0);
        System.out.println(builder);

        String ans="";
        System.out.println(removeAString(name,ans,0));
        System.out.println(ans);

        System.out.println(removeAString(name,0));
        System.out.println(ans);
    }
    static String removeAString(String name,int i)
    {
        String ans="";
        if(i==name.length())
            return ans;

        if(name.charAt(i)!='a')
            ans=ans+name.charAt(i);

        return ans+removeAString(name,i+1);
    }
    static String removeAString(String name,String ans,int i)
    {
        if(i==name.length())
            return ans;

        if(name.charAt(i)!='a')
            ans=ans+name.charAt(i);
        return removeAString(name,ans,i+1);
    }

    private static void removeA(String name, StringBuilder builder,int i) {
        if(i==name.length())
            return;

        if(name.charAt(i)!='a')
            builder.append(name.charAt(i));
        removeA(name,builder,i+1);
    }
}
