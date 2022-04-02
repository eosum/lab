package Commands;

import Data.*;

import java.util.Scanner;

public class ElementInput {

    public static String nameInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите имя: ");
            String name = input.nextLine();
            if (name.trim().length() > 0) return name;
            System.out.println("Неправильный ввод. Строка должна быть не пустой!");
        }
    }

    public static Float xInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите координату x: ");
            if (input.hasNextFloat()) {
                Float x = input.nextFloat();
                if (Coordinates.checkValidX(x)) return x;
            }
            System.out.println("Неверный формат ввода или число превышает " + Coordinates.getMaxX());
        }
    }

    public static Float yInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите координату y: ");
            if (input.hasNextFloat()) {
                Float y = input.nextFloat();
                if (Coordinates.checkValidY(y)) return y;
            }
            System.out.println("Неверный формат ввода или число превышает " + Coordinates.getMaxY());
        }
    }

    public static Boolean isHeroInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Является героем: ");
            if (input.hasNextBoolean()) return input.nextBoolean();
            System.out.println("Введите либо true либо false!");
        }
    }

    public static Boolean hasToothpickInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Есть зубочистка: ");
            if (input.hasNextBoolean()) return input.nextBoolean();
            System.out.println("Введите либо true либо false!");
        }
    }

    public static Long impactSpeedInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите скорость: ");
            if (input.hasNextLong()) return input.nextLong();

            System.out.println("Введите целое число!");
        }
    }

    public static String soundtrackInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите имя саундтрека: ");
            String soundtrack = input.nextLine();
            if (soundtrack.trim().length() > 0) return soundtrack;

            System.out.println("Неправильный ввод. Строка должна быть не пустой!");
        }
    }

    public static Integer minutesOfWaitingInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите время ожидания: ");
            if (input.hasNextInt()) return input.nextInt();

            System.out.println("Введите число!");
        }
    }

    public static WeaponType weaponTypeInput() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите тип оружия. Возможные варианты - ");
            WeaponType.outputWeaponType();
            try {
                return WeaponType.valueOf(input.nextLine());
            } catch (Exception e) {
                System.out.println("Введите слово из предложенного списка!");
            }
        }
    }

    public static String carInput() {
        while(true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите марку машины: ");
            if (input.hasNextLine()) return input.nextLine();

            System.out.println("Ошибка!");
        }
    }
}
