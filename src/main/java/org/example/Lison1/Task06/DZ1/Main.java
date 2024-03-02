package org.example.Lison1.Task06.DZ1;

import org.example.Lison1.Task04.Teacher;
import org.example.Lison1.Task04.TeacherGroup;
import org.example.Lison1.Task04.TeacherView;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup(new ArrayList<>(Arrays.asList(
                new Student(1L,"Герман","Пузиков", "Станиславович"),
                new Student(2L,"Олег","Гармаш", "Владимирович"),
                new Student(3L,"Ирина","Солдатова", "Иванова"))));
        StudentView studentView = new StudentView();
        studentView.sendOnConsole(studentGroup.studentList);
        System.out.println();
        TeacherGroup teacherGroup = new TeacherGroup(new ArrayList<>());
        teacherGroup.teacherList.add(new Teacher(1L, "Александра","Рыболовлева","Вячеславовна"));
        teacherGroup.teacherList.add(new Teacher(2L, "Кирилл","Моисеев","Петрович"));
        teacherGroup.teacherList.add(new Teacher(3L, "Жавохиржон","Мажитов","Сергеевич"));
        TeacherView teacherView = new TeacherView();
        teacherView.sendOnConsole(teacherGroup.teacherList);
    }
}
