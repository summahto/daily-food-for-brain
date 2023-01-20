package com.summahto.java8.training;

import java.util.ArrayList;
import java.util.List;


@FunctionalInterface
interface Condition{
    public boolean test(String s);
}


class ConditionImpl implements Condition{
    @Override
    public boolean test(String s) {
        if (s.startsWith("str1"))
            return true;
        else
            return false;
    }
}
class Process{
    private List<String> list = new ArrayList<>();

    public Process() {
        for (int i = 0;i < 100;i++) {
            list.add("str"+i);
        }
    }
    public int count() {
        return list.size();
    }
    public int count(Condition cond) {
        int cnt = 0;
        for (String str : list) {
            if (cond.test(str))
                cnt++;
        }
        return cnt;
    }

}
public class Lab2_Teacher {
    public static void main(String[] args) {
        Process proc = new Process();
        System.out.println("Count = " + proc.count());
        Condition con1 =  (str)->str.endsWith("1");
        System.out.println("Count of Strings ending with 1 : " + proc.count(con1));
        System.out.println("Count of Strings starting with str1 : " + proc.count((str)->str.startsWith("str1")));
        System.out.println("Count of Strings starting with str1 : " + proc.count(new ConditionImpl()));
        System.out.println("Count of Strings  : " + proc.count((str)->true));

    }
}

