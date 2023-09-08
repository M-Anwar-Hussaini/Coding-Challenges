
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ali Baba
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        LinkedList<Character> list = new LinkedList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }
        HashSet<String> set = new HashSet<>();
        set.add("88");
        set.add("69");
        set.add("96");
        set.add("00");

        boolean flag = true;
        while (list.size() > 1) {
            String temp = "" + list.pollFirst() + "" + list.pollLast();
            if (!set.contains(temp)) {
                flag = false;
                break;
            }
        }

        if (list.size() == 1) {
            char num = list.poll();
            System.out.println(num);
            if (num != '8' && num !='0') {
                flag = false;
            }
        }

        System.out.println(flag);
    }

}
