package org.example.Lison1.Task03;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamServise {
    StreamGroup streamGroup;

    public StreamServise(StreamGroup streamGroup) {
        this.streamGroup = streamGroup;
    }

    public List<Stream> getSortedStreamGroup(){
        List<Stream> streamList = streamGroup.streamList;
        Collections.sort(streamList);
        return streamList;
    }

    public void soutStream(List<Stream> streamList){
        for (Stream s : streamList){
            System.out.println(s);
        }
    }

    public List<Stream> getSortedStreamGroupByFIO() {
        List<Stream> result = new ArrayList<>(streamGroup.streamList);
        result.sort(new StreamComparator());
        return result;
    }
}
