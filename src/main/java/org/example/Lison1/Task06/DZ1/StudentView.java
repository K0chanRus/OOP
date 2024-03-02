package org.example.Lison1.Task06.DZ1;

import java.util.List;

public class StudentView implements UserView<Student> {
    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student s : list){
            System.out.println(s);
        }
    }
}
