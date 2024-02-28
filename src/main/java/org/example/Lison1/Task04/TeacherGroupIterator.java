package org.example.Lison1.Task04;

import java.util.Iterator;
import java.util.List;

public class TeacherGroupIterator implements Iterator<Teacher> {

    private List<Teacher> teacherList;
    int index = 0;

    public TeacherGroupIterator(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    @Override
    public boolean hasNext() {
        return index < teacherList.size();
    }

    @Override
    public Teacher next() {
        if (hasNext()){
            return teacherList.get(index++);
        }
        return null;
    }
    @Override
    public void remove() {
        teacherList.remove(--index);
    }
}
