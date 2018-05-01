package com.cmy.dependency.dependencymiddle;

import com.cmy.dependency.dependencylower.Person;

public class MidDriver {
	public static void main(String[] args) {
		Person p1 = new Person(24, "İlteber", "Ayvaci", true);
		Person p2 = new Person(25, "Can Mert", "Yildiz", true);
		Person p3 = new Person(30, "Alp", "Peh", true);
		
		System.out.println(p1.showPerson());
	}
}
