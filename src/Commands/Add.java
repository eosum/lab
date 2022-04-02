package Commands;

import App.CollectionManager;
import Data.*;

public class Add implements Command {
    String name, soundtrack, car;
    WeaponType weaponType;
    Float x, y;
    Boolean isHero, hasToothpick;
    Long impactSpeed;
    Integer minutesOfWaiting;
    private final CollectionManager collectionManager;

    public Add(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    public void information_input() {
        name = ElementInput.nameInput();
        x = ElementInput.xInput();
        y = ElementInput.yInput();
        isHero = ElementInput.isHeroInput();
        hasToothpick = ElementInput.hasToothpickInput();
        minutesOfWaiting = ElementInput.minutesOfWaitingInput();
        impactSpeed = ElementInput.impactSpeedInput();
        weaponType = ElementInput.weaponTypeInput();
        soundtrack = ElementInput.soundtrackInput();
        car = ElementInput.carInput();
    }

    public HumanBeing createElement() {
        return new HumanBeing(collectionManager.getId(), name, new Coordinates(x, y), isHero, hasToothpick, impactSpeed,
                soundtrack, minutesOfWaiting, weaponType, new Car(car));
    }

    public void execute(String args[]) {
        information_input();
        collectionManager.add(createElement());
    }

    @Override
    public String toString() {
        return "Commands.Add - добавляет новый элемент в коллекцию";
    }
}
