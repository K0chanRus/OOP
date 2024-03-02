package org.example.Lison1.Task06.DZ1;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> list);
}
