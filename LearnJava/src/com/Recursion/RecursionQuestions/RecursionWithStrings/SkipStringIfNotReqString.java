package com.utkarsh.RecursionQuestions.RecursionWithStrings;

public class SkipStringIfNotReqString {
    public static void main(String[] args) {
        String name="bccappresapplegdappgh";
        String remove="app";
        String exception="apple";
        System.out.println(skipString(name,remove,exception));
    }
    private static String skipString(String name, String remove,String exception) {
        if(name.isEmpty())
        {
            return "";
        }
        if(name.startsWith(remove) && !name.startsWith(exception))
            return skipString(name.substring(remove.length()),remove,exception);
        else
            return name.charAt(0)+skipString(name.substring(1),remove,exception);

    }


}
