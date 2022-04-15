package App;

import Data.HumanBeing;
import Parser.ParserToXml;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.LinkedList;

public class CollectionManager {
    LinkedList<HumanBeing> collection = new LinkedList<>();
    private Long id = 1L;
    ZonedDateTime initTime = ZonedDateTime.now();

    public Long getId() {
        return id++;
    }

    public void mergeCollections(LinkedList<HumanBeing> collectionFromFile) {
        collection.addAll(collectionFromFile);
    }

    public void save() {
        ParserToXml parserToXml = new ParserToXml();
        parserToXml.parseToXml(collection);
    }

    public void info() {
        System.out.println("Тип - " + collection.getClass() + "\n"
                            + "Количество элементов - " + collection.size() + "\n"
                            + "Дата инициализации - " + initTime);
    }

    public void removeGreater(HumanBeing CompareElement) {
        for (HumanBeing element: collection) {
            if (element.compareTo(CompareElement) == 1) {
                collection.remove(element);
            }
        }
    }

    public void addIfMin(HumanBeing Element) {
        Collections.sort(collection);
        if (collection.peekFirst().compareTo(Element) >= 0) collection.addFirst(Element);
    }

    public void filterStartsWithSoundtrackName(String SubString) {
        for (HumanBeing element: collection) {
            String NameSoundtrack = element.getSoundtrackName();
            if (NameSoundtrack.startsWith(SubString)) {
                System.out.println(element);
            }
        }
    }

    public void countLessThanWeaponType(String weaponType) {
        int amount = 0;
        for(HumanBeing element: collection) {
            if (element.getWeaponType().length() < weaponType.length()) {
                amount++;
            }
        }
        System.out.println(amount);
    }

    public void printAscending() {
        Collections.sort(collection);
        for (HumanBeing element: collection) {
            System.out.println(element + "\n");
        }
    }

    public void removeFirst() {
        collection.removeFirst();
    }

    public void show() {
        System.out.println(collection);
    }

    public void clear() {
        collection.clear();
    }

    public void add(HumanBeing element) {
        collection.add(element);
    }

    public boolean updateById(Long updateId) {
        for(HumanBeing element: collection) {
            if (element.getId() == updateId) {
                collection.remove(element);
                return true;
            }
        }
        return false;
    }

    public boolean removeById(Long deleteId) {
        for(HumanBeing element: collection) {
            if (element.getId() == deleteId) {
                collection.remove(element);
                return true;
            }
        }
        return false;
    }

}

