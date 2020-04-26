package com.company;

public class Course {
    String courseName;
    Instructor instructor;
    TextBook textBook;
// Constructor
    public Course(String name, Instructor instr, TextBook text){
        this.courseName = name;
        this.instructor = instr;
        this.textBook = text;
    }
//    Methods
    public String getName(){
        return this.courseName;
    }
    public Instructor getInstructor(){
        return this.instructor;
    }
    public TextBook getTextBook(){
        return this.textBook;
    }
    public String toString(){
        String str = "------------------------------------------\n";
        str += "Course Name : " + this.courseName + "\n";
        str += "------------------------------------------\n";
        str += this.instructor.toString();
        str += "\n------------------------------------------\n";
        str += this.textBook.toString();
        str += "\n------------------------------------------";
        return str;
    }
}
