package com.utkarsh.Experiments;

import java.util.ArrayList;

class ReverseSubsequence {
    public static void main(String[] args) {
        String[] words1={"amazon","apple","facebook","google","leetcode"};
        String[] words2={"e","o"};
        System.out.println(wordSubsets(words1,words2));
    }
    public static ArrayList<String> wordSubsets(String[] words1, String[] words2) {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<words1.length;i++)
        {

            ArrayList<String> subsequence=subseq("",words1[i]);
            int count=0;
            for(int j=0;j<words2.length;j++)
            {
                if(subsequence.contains(words2[j]))
                    count++;
            }
            if(count==words2.length)
                list.add(words1[i]);
        }
        return list;

    }
    static ArrayList<String> subseq(String p,String up)
    {
        ArrayList<String> ans=new ArrayList<>();
        if(up.isEmpty())
        {
            ans.add(p);
            return ans;
        }

        ans.addAll(subseq(p+up.charAt(0),up.substring(1)));
        ans.addAll(subseq(p,up.substring(1)));
        return ans;
    }
}