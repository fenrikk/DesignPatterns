package singleton;

import java.util.LinkedList;
import java.util.List;

public class DCLSingleton {
    private static volatile DCLSingleton instance;
    private final LinkedList<Integer> list = new LinkedList<Integer>();

    public static DCLSingleton getInstance() {
        DCLSingleton localInstance = instance;
        if (localInstance == null) {
            synchronized (Singleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new DCLSingleton();
                }
            }
        }
        return localInstance;
    }

    public void addElement(int element) {
        list.add(element);
    }

    public List<Integer> getList() {
        return list;
    }
}
