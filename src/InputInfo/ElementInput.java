package InputInfo;

import CheckCorrectData.CheckCorrectInput;
import Data.*;

import java.util.Scanner;

public class ElementInput {

    private String name;
    private String soundtrack;
    private String car;
    private WeaponType weaponType;
    private Float x;
    private Float y;
    private Boolean realHero;
    private Boolean hasToothpick;
    private Long impactSpeed;
    private Integer minutesOfWaiting;
    private CheckCorrectInput check = new CheckCorrectInput();

    public void nameInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите имя: ");
            name = input.nextLine().trim();
            if (check.checkName(name) == 1) break;
            System.out.println("Некорректный ввод. Попробуйте еще раз.");
        }
    }

    public void xInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите координату x: ");
            if (input.hasNextFloat()) {
                x = input.nextFloat();
                if (check.checkCoordinateX(x) == 1) break;
            }
            System.out.println("Неверный формат ввода или число превышает " + Coordinates.getMaxX());
        }
    }

    public void yInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите координату y: ");
            if (input.hasNextFloat()) {
                y = input.nextFloat();
                if (check.checkCoordinateY(y) == 1) break;
            }
            System.out.println("Неверный формат ввода или число превышает " + Coordinates.getMaxY());
        }
    }

    public void realHeroInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Является героем: ");
            if (input.hasNextBoolean()) {
                realHero = input.nextBoolean();
                if(check.checkRealHero(realHero) == 1) break;
            }
            System.out.println("Введите либо true либо false!");
        }
    }

    public void hasToothpickInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Есть зубочистка: ");
            if (input.hasNextBoolean()) {
                hasToothpick = input.nextBoolean();
                break;
            }
            System.out.println("Введите либо true либо false!");
        }
    }

    public void impactSpeedInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите скорость: ");
            if (input.hasNextLong()) {
                impactSpeed = input.nextLong();
                break;
            }
            System.out.println("Введите целое число!");
        }
    }

    public void soundtrackInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите имя саундтрека: ");
            soundtrack = input.nextLine().trim();
            if (check.checkSoundtrackName(soundtrack) == 1) break;
            System.out.println("Неправильный ввод. Строка должна быть не пустой!");
        }
    }

    public void minutesOfWaitingInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите время ожидания: ");
            if (input.hasNextInt()) {
                minutesOfWaiting = input.nextInt();
                break;
            }

            System.out.println("Введите число!");
        }
    }

    public void weaponTypeInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите тип оружия. Возможные варианты - ");
            WeaponType.outputWeaponType();

            if (check.checkWeaponType(input.nextLine().trim()) == 1) {
                weaponType = WeaponType.valueOf(input.nextLine().trim());
                break;
            }

            System.out.println("Введите слово из предложенного списка.");
        }
    }

    public void carInput() {
        while(true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите марку машины: ");
            if (input.hasNextLine()) {
                car = input.nextLine().trim();
                if (check.checkCar(car) == 1) break;
            }

            System.out.println("Некорректный ввод.");
        }
    }

    public HumanBeing createElement(Long id) {
        return new HumanBeing(id, name, new Coordinates(x, y), realHero, hasToothpick, impactSpeed,
                soundtrack, minutesOfWaiting, weaponType, new Car(car));
    }

    public HumanBeing resultElement(Long id) {
        nameInput();
        xInput();
        yInput();
        realHeroInput();
        hasToothpickInput();
        impactSpeedInput();
        minutesOfWaitingInput();
        soundtrackInput();
        weaponTypeInput();
        carInput();

        return createElement(id);
    }

}
