package com.bridgelabz.basicProblems;

import java.util.List;
import java.util.*;
public class ListManager {

    public void addElement(List<Integer> list, int element){
        list.add(element);
    }

    public boolean removeElement(List<Integer> list, int element) {
        return list.remove(Integer.valueOf(element));
    }


    public int getSize(List<Integer> list) {
        return list.size();
    }
}
