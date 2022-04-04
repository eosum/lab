package Commands;

import Data.*;

import java.util.Scanner;

public class ElementInput {

    private String name;
    private String soundtrack;
    private String car;
    private WeaponType weaponType;
    private Float x;
    private Float y;
    private Boolean isHero;
    private Boolean hasToothpick;
    private Long impactSpeed;
    private Integer minutesOfWaiting;

    public void nameInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите имя: ");
            name = input.nextLine();
            if (name.trim().length() > 0) break;
            System.out.println("Неправильный ввод. Строка должна быть не пустой!");
        }
    }

    public void xInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите координату x: ");
            if (input.hasNextFloat()) {
                x = input.nextFloat();
                if (Coordinates.checkValidX(x)) break;
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
                if (Coordinates.checkValidY(y)) break;
            }
            System.out.println("Неверный формат ввода или число превышает " + Coordinates.getMaxY());
        }
    }

    public void isHeroInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Является героем: ");
            if (input.hasNextBoolean()) {
                isHero = input.nextBoolean();
                break;
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
            soundtrack = input.nextLine();
            if (soundtrack.trim().length() > 0) break;

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
            try {
                weaponType = WeaponType.valueOf(input.nextLine());
            } catch (Exception e) {
                System.out.println("Введите слово из предложенного списка!");
            }
        }
    }

    public void carInput() {
        while(true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите марку машины: ");
            if (input.hasNextLine()) {
                car = input.nextLine();
                break;
            }
            System.out.println("Ошибка!");
        }
    }

    public HumanBeing createElement(Long id) {
        return new HumanBeing(id, name, new Coordinates(x, y), isHero, hasToothpick, impactSpeed,
                soundtrack, minutesOfWaiting, weaponType, new Car(car));
    }

    public HumanBeing resultElement(Long id) {
        nameInput();
        xInput();
        yInput();
        isHeroInput();
        hasToothpickInput();
        impactSpeedInput();
        minutesOfWaitingInput();
        soundtrackInput();
        weaponTypeInput();
        carInput();

        return createElement(id);
    }

}
