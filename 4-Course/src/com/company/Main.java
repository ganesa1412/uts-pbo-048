package com.company;

public class Main {

    public static void main(String[] args) {
        Instructor instr = new Instructor("Setiawan", "Budi", "OFF123");
	    TextBook book = new TextBook("Java in a Nutshell", "David Flannagan", "O'Reilly Media");
	    Course course = new Course("Object Oriented Programming", instr, book);

	    System.out.println(course.toString());
    }
}
