package org.example.Lison1.Task05;
import org.example.Lison1.Task05.controller.Controller;
public class Main {
    public static void main(String[] args) {
        Controller controler = new Controller();
        controler.createStudent("1", "1","1","1");
        controler.createStudent("2", "2","2","2");
        controler.createStudent("3", "3","3","3");
        controler.createStudent("4", "4","4","4");
        controler.getAllStudent();
        System.out.println();
        controler.createTeacher("5","5","5","5");
        controler.createGroup("STUDENT", "12","12", "12", "12", 12);
        controler.createGroup("STUDENT", "7","7", "7", "7", 7);
        controler.createGroup("TEACHER", "18","18", "18", "18", 12);
        controler.createGroup("STUDENT","59", "59","59", "59",12);
        controler.getGroup(12);
    }
    //DZ5
}
