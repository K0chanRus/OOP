package org.example.Lison1.Task03;

import java.util.Iterator;
import java.util.List;

public class StreamGroup implements Iterable<Stream>{

    public List<Stream> streamList;

    public StreamGroup(List<Stream> streamList) {
        this.streamList = streamList;
    }

    @Override
    public Iterator<Stream> iterator() {
        return new SteamGroupIterator(this);
    }
}
