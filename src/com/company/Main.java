package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	    Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        while (scanner.hasNextInt())
        {
            int num = scanner.nextInt();
            // moves an element already on the list to the front
            if (list.contains(num))
            {
                list.remove(list.indexOf(num));
                list.addFirst(num);
            }
            // adds new element to the front
            else
                list.addFirst(num);
        }

        System.out.println(list);
    }
}
