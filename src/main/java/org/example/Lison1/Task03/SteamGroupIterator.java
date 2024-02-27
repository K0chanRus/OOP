package org.example.Lison1.Task03;

import java.util.Iterator;
import java.util.List;

public class SteamGroupIterator implements Iterator<Stream> {
    private List<Stream> streamList;
    int index = 0;

    public SteamGroupIterator(StreamGroup streamGroup) {
        this.streamList = streamGroup.streamList;
    }

    @Override
    public boolean hasNext() {
        return index < streamList.size();
    }

    @Override
    public Stream next() {
        if (hasNext()){
            return streamList.get(index++);
        }
        return null;
    }
}
