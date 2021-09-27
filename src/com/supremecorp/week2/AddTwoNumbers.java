package com.supremecorp.week2;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by suprememajor on 9/27/21
 */
public class AddTwoNumbers {
    public static LinkedList<Integer> addTwo(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> res = new LinkedList<>();
        int carry = 0;
        while (!(l1.isEmpty() && l2.isEmpty())) {
            int x = (l1.isEmpty()) ? 0 : l1.pop();
            int y = (l2.isEmpty()) ? 0 : l2.pop();
            int sum = carry + x + y;
            carry = sum / 10;
            res.push(sum % 10);
        }
        if (carry > 0) {
            res.push(carry);
        }
        Collections.reverse(res);
        System.out.println(res);
        return res;
    }
}
