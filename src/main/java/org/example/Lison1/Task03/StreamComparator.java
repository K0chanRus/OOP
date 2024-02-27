package org.example.Lison1.Task03;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream o1, Stream o2) {
        int resultOfComparing = o1.nameGroup.compareTo(o2.nameGroup);
        if (resultOfComparing == 0) {
            resultOfComparing = o1.numberOfStudent.compareTo(o2.numberOfStudent);
        }else {
            return resultOfComparing;
        }
        return resultOfComparing;
    }
}
