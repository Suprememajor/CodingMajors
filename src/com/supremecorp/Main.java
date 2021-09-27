package com.supremecorp;

import com.supremecorp.week2.AddTwoNumbers;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AddTwoNumbers.addTwo(getList(List.of(2, 4, 3)), getList(List.of(5, 6, 4)));
        AddTwoNumbers.addTwo(getList(List.of(0)), getList(List.of(0)));
        AddTwoNumbers.addTwo(getList(List.of(9, 9, 9, 9, 9, 9, 9)), getList(List.of(9, 9, 9, 9)));
        AddTwoNumbers.addTwo(getList(List.of(5, 6, 2, 7, 9)), getList(List.of(2, 6, 8, 5, 3)));
        AddTwoNumbers.addTwo(getList(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)),
                getList(List.of(9, 8, 7, 6, 5, 4, 3, 2, 1)));
    }

    private static LinkedList<Integer> getList(List list) {
        return new LinkedList<>(list);
    }
}
