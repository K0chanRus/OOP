package org.example.Lison1.Task03;

import java.util.Iterator;
import java.util.List;

public class Stream implements Comparable<Stream>{

    public int numberGroup;
    public String nameGroup;
    public String numberOfStudent;
    

    public Stream(int numberGroup, String nameGroup, String numberOfStudent) {
        this.numberGroup = numberGroup;
        this.nameGroup = nameGroup;
        this.numberOfStudent = numberOfStudent;
    }
    
    @Override
    public String toString() {
        return "Stream{" +
                "numberGroup=" + numberGroup +
                ", nameGroup='" + nameGroup + '\'' +
                ", numberOfStudent=" + numberOfStudent +
                '}';
    }

    @Override
    public int compareTo(Stream o) {
        if (this.numberGroup > o.numberGroup)
            return 1;
        else if (this.numberGroup < o.numberGroup) {
            return -1;
        }
        else return 0;
    }
}
