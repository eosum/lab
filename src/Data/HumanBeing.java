package Data;

import Data.Car;
import Data.Coordinates;

import java.time.ZonedDateTime;

public class HumanBeing {
    private Long id; // поле не может быть null, значение генерируется автоматически, уникально, > 0
    private String name; // поле не может быть 0, строка не пустая
    private Coordinates coordinates; // поле не может быть null
    private java.time.ZonedDateTime creationDate; //
    private Boolean realHero; // поле не может быть null
    private Boolean hasToothpick; // поле может быть null
    private Long impactSpeed; // поле может быть null
    private String soundtrackName; // поле не может быть null
    private Integer minutesOfWaiting; // поле может быть null
    private WeaponType weaponType; // поле может быть null
    private Car car; // поле не может быть null

    public HumanBeing(Long id, String name, Coordinates coordinates, Boolean realHero, Boolean hasToothpick, Long impactSpeed,
                      String soundtrackName, Integer minutesOfWaiting, WeaponType weaponType, Car car) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.realHero = realHero;
        this.hasToothpick = hasToothpick;
        this.impactSpeed= impactSpeed;
        this.soundtrackName = soundtrackName;
        this.minutesOfWaiting = minutesOfWaiting;
        this.weaponType = weaponType;
        this.car = car;

        creationDate = ZonedDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public String getSoundtrackName() {
        return soundtrackName;
    }

    @Override
    public String toString() {
        return "id = " + id + "\n"
                + "name = " + name + "\n"
                + "coordinates: " + coordinates + "\n"
                + "realHero = " + realHero + "\n"
                + "hasToothpick = " +  hasToothpick+ "\n"
                + "impactSpeed = " + impactSpeed + "\n"
                + "soundtrackName = " + soundtrackName + "\n"
                + "minutesOfWaiting = " + minutesOfWaiting + "\n"
                + "weaponType = " + weaponType + "\n"
                + "car = " + car + "\n"
                + "creationDate = " + creationDate;
    }

}