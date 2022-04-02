package Commands;

import App.CollectionManager;
import Data.*;

public class Update implements Command {
    private final CollectionManager collectionManager;
    String name, soundtrack, car;
    WeaponType weaponType;
    Float x, y;
    Boolean isHero, hasToothpick;
    Long impactSpeed;
    Integer minutesOfWaiting;

    public Update(CollectionManager collectionManager) {
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

    public HumanBeing createElement(Long id) {
        return new HumanBeing(id, name, new Coordinates(x, y), isHero, hasToothpick, impactSpeed,
                soundtrack, minutesOfWaiting, weaponType, new Car(car));
    }

    public void execute(String args[]) {
        try {
            final Long id = Long.parseLong(args[0]);
            if (!this.collectionManager.update_by_id(id)) {
                System.out.println("Объекта с id = " + id + " не найдено");
            } else {
                information_input();
                collectionManager.add(createElement(id));
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Некорректный ввод! id не введен или введен неверно");
        }
    }

    @Override
    public String toString() {
        return "Commands.Update - обновить значение элемента коллекции, id которого совпадает с исходным";
    }
}
