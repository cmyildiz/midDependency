package com.cmy.dependency.dependencymiddle;

import java.util.ArrayList;
import com.cmy.dependency.dependencylower.Person;

public class Family {
	
	private Person father;
	private Person mother;
	private ArrayList<Person> children;
	private String surname;
	
	public Family(Person father, Person mother, String surname) {
		this.father = father;
		this.mother = mother;
		this.surname = surname;
		children = new ArrayList<Person>();
	}
	public Person getFather() {
		return father;
	}
	public void setFather(Person father) {
		this.father = father;
	}
	public Person getMother() {
		return mother;
	}
	public void setMother(Person mother) {
		this.mother = mother;
	}
	public ArrayList<Person> getChildren() {
		return children;
	}
	public void addChildren(Person child) {
		if(child.getAge() < 18) {
			children.add(child);
		}
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String showParent() {
		return "Family [father=" + father + ", mother=" + mother + " ]";
	}
	
	@Override
	public String toString() {
		return "Family [father=" + father + ", mother=" + mother + ", children=" + children + ", surname=" + surname
				+ "]";
	}
	
}
