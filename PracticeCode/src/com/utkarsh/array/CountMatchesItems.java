package com.utkarsh.array;

import java.util.ArrayList;
import java.util.Scanner;

public class CountMatchesItems {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<ArrayList<String>> items=new ArrayList<>();
        for (int i=0;i<3;i++)
        {
            items.add(new ArrayList<>());
        }

        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                items.get(i).add(in.next());
            }
        }
        String ruleKey=in.next();
        String ruleValue=in.next();
        System.out.println(countMatches(items, ruleKey, ruleValue));

    }
    static int countMatches(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(ArrayList<String> item :items)
        {
            if(ruleKey=="type")
            {
                if(item.get(0)==ruleValue)
                    count++;
            }
            if(ruleKey=="color")
            {
                System.out.println("executed1");
                if(item.get(1)==ruleValue)
                    count++;
                System.out.println("executed2");
            }
            if(ruleKey=="name")
            {
                if(item.get(2)==ruleValue)
                    count++;
            }
        }
        return count;
    }
}
