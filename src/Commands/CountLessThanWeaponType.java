package Commands;

import App.CollectionManager;
import Data.WeaponType;

public class CountLessThanWeaponType implements Command{
    private final CollectionManager collectionManager;

    public CountLessThanWeaponType(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String[] args) {
        String weaponType = String.join(" ", args);
        try {
            WeaponType.valueOf(weaponType);
        } catch (Exception e) {
            System.out.println("Такого типа оружия не существует");
        }
        collectionManager.countLessThanWeaponType(weaponType);
    }

    @Override
    public String toString() {
        return "count_less_than_weapon_type - выводит кол - во элементов, weapon type которых меньше заданного";
    }

}
