package Recurssion;

import java.util.ArrayList;
import java.util.List;

public class BetterString {
    public static void main(String[] args) {
        String s="gfg";
        System.out.println(s.toCharArray()[1]+"");

    }

    public static String betterString(String s1, String s2) {
        List<String> set= new ArrayList<>();
        int count1=0;
        createSubString(s1,0,set,count1);
        int count2=0;
        createSubString(s2,0,set,count2);
        if(count1==count2){
            return s1;
        }else if(count1>count2){
            return s1;
        }else if(count2<count1){
            return s2;
        }
        return "";
    }

    public static void createSubString(String s, int index, List<String> set, int count){
        if(index==s.length() && !set.contains(s.toCharArray()[index]+"")){
            count++;
            return;
        }

        set.add(s.toCharArray()[index]+"");
        createSubString(s,index+1,set,count);
        set.remove(set.size()-1);
        createSubString(s,index+1,set,count);
    }
}
