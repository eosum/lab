package App;

import Data.HumanBeing;

import java.util.LinkedList;

public class CollectionManager {
    static LinkedList<HumanBeing> collection = new LinkedList<>();
    private Long id = 1L;

    public void info() {
        System.out.println("Тип - " + collection.getClass() + "\n"
                            + "Дата инициализации - НЕ ЗАБУДЬ СДЕЛАТЬ" + "\n"
                            + "Количество элементов - " + collection.size());
    }

    public void filter_starts_with_soundtrack_name(String SubString) {
        for (HumanBeing element: collection) {
            String NameSoundtrack = element.getSoundtrackName();
            if (NameSoundtrack.startsWith(SubString)) {
                System.out.println(element);
            }
        }
    }

    public void print_ascending() {

    }

    public void remove_first() {
        collection.removeFirst();
    }

    public void show() {
        System.out.println(collection);
    }

    public void clear() {
        collection.clear();
    }

    public Long getId() {
        return id++;
    }

    public void add(HumanBeing element) {
        collection.add(element);
    }

    public boolean update_by_id(Long updateId) {
        for(HumanBeing element: collection) {
            if (element.getId() == updateId) {
                collection.remove(element);
                return true;
            }
        }
        return false;
    }

    public boolean remove_by_id(Long deleteId) {
        for(HumanBeing element: collection) {
            if (element.getId() == deleteId) {
                collection.remove(element);
                return true;
            }
        }
        return false;
    }

}
