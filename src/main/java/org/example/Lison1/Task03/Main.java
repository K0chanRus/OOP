package org.example.Lison1.Task03;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup(new ArrayList<>(Arrays.asList(
                new Student(1L,"Герман","Пузиков", "Станиславович"),
                new Student(3L,"Олег","Гармаш", "Владимирович"),
                new Student(2L,"Ирина","Солдатова", "Иванова"))));
        StudentGroupServise servise = new StudentGroupServise(studentGroup);
        servise.soutList(studentGroup.studentList);
        System.out.println();
        servise.soutList(servise.getSortedStudentGroup());
        System.out.println();
        servise.soutList(servise.getSortedStudentGroupByFIO());
        System.out.println();
        StreamGroup streamGroup = new StreamGroup(new ArrayList<>(Arrays.asList(
        new Stream(158, "Разработчики", "58"),
        new Stream(295, "Дизайнеры", "102"),
        new Stream(146, "Тестировщики", "75"))));
        StreamServise groupServise = new StreamServise(streamGroup);
        groupServise.soutStream(streamGroup.streamList);
        System.out.println();
        groupServise.soutStream(groupServise.getSortedStreamGroup());
        System.out.println();
        groupServise.soutStream(groupServise.getSortedStreamGroupByFIO());
    }
}
