package com.org.tav.day7;


import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;

public class Person implements CheckPerson{
	
	public enum Sex{
		male, female
	}
	
String name ;
LocalDate birthday ;
String emailAdddress ;
Sex gender;
public Person(String name, LocalDate birthday, String emailAdddress, Sex gender) {
	super();
	this.name = name;
	this.birthday = birthday;
	this.emailAdddress = emailAdddress;
	this.gender = gender;
}
public int getAge() {
	return birthday.until(IsoChronology.INSTANCE.dateNow()).getYears();
}

public void printPerson() {
	System.out.println(name+" , "+ this.getAge());
}

public String getName() {
	return name;
}
public LocalDate getBirthday() {
	return birthday;
}
public String getEmailAdddress() {
	return emailAdddress;
}
public Sex getGender() {
	return gender;
}

public static List<Person> createRoster(){
	
	ArrayList<Person> roster = new ArrayList<>();
	roster.add(new Person("Farha", IsoChronology.INSTANCE.date(1980, 6, 20), "abc@gmail.com", Person.Sex.female));
	roster.add(new Person("abhi", IsoChronology.INSTANCE.date(1991, 6, 10), "abc@gmail.com", Person.Sex.male));
	roster.add(new Person("rajat", IsoChronology.INSTANCE.date(2000, 3, 22), "abc@gmail.com", Person.Sex.male));
	roster.add(new Person("Asha", IsoChronology.INSTANCE.date(1999, 5, 30), "abc@gmail.com", Person.Sex.female));
	return roster;
}

//approach 1
public static void printPerson(List<Person> roster , int age) {
	for(Person p :roster) {if(p.getAge() >= age) {
		p.printPerson();}
	}
}

//approach 2
public static void printPersonsWithinAgeRange(List<Person> roster , int low , int high) {
	for(Person p :roster) {
		if(low<=p.getAge() && p.getAge()<high) {
			p.printPerson();
		}
	}
}

//approch3 
@Override
public boolean test(Person p) {
	// TODO Auto-generated method stub
	return p.gender == Person.Sex.male && p.getAge()>= 18 && p.getAge()<=25;
}



}
