package com.example.lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Main {
	public static void main(String args[]){
		List<Fruit> fl = new ArrayList<Fruit>();
		System.out.println("Fruit List (orgered by name)");
		Fruit s1= new Fruit(101,"Apple",1000);
		fl.add(s1);
		Fruit s2= new Fruit(102,"Orange",1500);
		fl.add(s2);
		fl.add(new Fruit(103,"Tomato",2000));
		fl.add(new Fruit(104,"Banana",1000));
		fl.add(new Fruit(105,"Peach",2000));
		fl.add(new Fruit(106,"Melon",3000));
		fl.add(new Fruit(107,"WaterMelon",2500));
		fl.add(new Fruit(108,"Strawberry",5000));
		fl.add(new Fruit(109,"Lemon",4000));
		fl.add(new Fruit(110,"Cherry",4500));
		
		Collections.sort(fl, new FruitConparator());
		for(Fruit s : fl) {
			System.out.println(s.toString());
		}
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(fl, new FruitComparatorDesc());
		for(int i=0; i<fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}
	}
}
