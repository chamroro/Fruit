package com.example.lab3;

import java.util.Comparator;

public class Fruit {
	
	int no;
	String name;
	int price;
	
	public Fruit(int no, String name, int price) {
		this.no =no;
		this.name =name;
		this.price = price;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {

		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [no=" + no + ", name=" + name + ", price=" + price + "]";
	}
}

class FruitConparator implements Comparator<Fruit>{
	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.name.compareTo(o2.name);
	}
}

class FruitComparatorDesc implements Comparator<Fruit>{
	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o2.name.compareTo(o1.name);
	}
}