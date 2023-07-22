package com.roomprogram;

class Human {
	String job() {
		return "Human:Working Puropose";

	}
}

class Teacher extends Human {
	String job() {
		return "Teacher:Teaches the Students";
	}
}

class Doctor extends Human {
	String job() {
		return "Doctor:Treatment of Pateint's";
	}
}

class Lawyer extends Human {
	String job() {
		return "Lawyer:Protecting a Client";
	}
}

public class OverridingHuman {
	public static void main(String[] args) {
		Human h = new Human();
		Teacher tch = new Teacher();
		Doctor dr = new Doctor();
		Lawyer lwr = new Lawyer();
		System.out.println(h.job());
		System.out.println(tch.job());
		System.out.println(dr.job());
		System.out.println(lwr.job());
	}

}
