package org.example.Lison1.Task04;

import java.util.List;

public class TeacherView implements UserView<Teacher>{
    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher t: list){
            System.out.println(t);
        }
    }
}
