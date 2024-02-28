package org.example.Lison1.Task04;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> list);
}
