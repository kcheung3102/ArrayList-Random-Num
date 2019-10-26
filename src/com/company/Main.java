package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    Random rand = new Random();
	    ArrayList<String> items = new ArrayList<String>();
	    items.add("Pizza");
	    items.add("Juice");
	    items.add("Pineapples");
	    items.add("Apples");
	    items.add("Bananas");
	    items.add("Corn");

	    System.out.println(items.get(rand.nextInt(items.size())));

    }

}
