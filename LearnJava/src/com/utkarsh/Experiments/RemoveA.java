package com.utkarsh.Experiments;

public class RemoveA {
    public static void main(String[] args) {
        String name="utkarshagrawal";
        StringBuilder builder=new StringBuilder();
        removeA(name,builder,0);
        System.out.println(builder);
//        for(int i=0;i<name.length();i++)
//        {
//            char letter=name.charAt(i);
//            if(name.charAt(i)!='a')
//                builder.append(name.charAt(i));
//        }
//        System.out.println(builder);

    }

    private static void removeA(String name, StringBuilder builder,int i) {
        if(i==name.length())
            return;

        if(name.charAt(i)!='a')
            builder.append(name.charAt(i));
        removeA(name,builder,i+1);
    }
}
