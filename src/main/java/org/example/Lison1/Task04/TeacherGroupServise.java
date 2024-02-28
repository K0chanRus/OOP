package org.example.Lison1.Task04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherGroupServise {
    TeacherGroup teacherGroup;

    public TeacherGroupServise(TeacherGroup teacherGroup) {
        this.teacherGroup = teacherGroup;
    }
    public List<Teacher> getSortedTeacherGroup(){
        List<Teacher> teacherList = teacherGroup.teacherList;
        Collections.sort(teacherList);
        return teacherList;
    }

    public void soutList(List<Teacher> teacherList){
        for (Teacher t : teacherList){
            System.out.println(t);
        }
    }

    public List<Teacher> getSortedTeacherGroupByFIO() {
        List<Teacher> result = new ArrayList<>(teacherGroup.teacherList);
        result.sort(new UserComparator<Teacher>());
        return result;
    }
}
