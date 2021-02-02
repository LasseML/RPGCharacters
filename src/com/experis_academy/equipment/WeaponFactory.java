package com.experis_academy.equipment;

public class WeaponFactory {

    public static Weapon getWeaponFactory(String weaponName, int weaponLevel, String weaponType){

        if(weaponType.equalsIgnoreCase("MAGIC")) {
            return new MagicWeapon(weaponName, weaponLevel);
        }
        if(weaponType.equalsIgnoreCase("MELEE")) {
            return new MeleeWeapon(weaponName, weaponLevel);
        }
        if(weaponType.equalsIgnoreCase("RANGED")) {
            return new RangedWeapon(weaponName, weaponLevel);
        }

        System.out.println("No such weapon type!");

        return null;

    }

}
