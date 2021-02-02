package com.experis_academy.equipment;

public class RangedWeapon implements Weapon{

    private String weaponName ="";
    private String weaponType = "RANGED";
    private String equipmentSlot = "Weapon";
    private int weaponLevel = 1;
    private int baseDamage = 5;

    public RangedWeapon(String name, int level){
        this.weaponName = name;
        this.weaponLevel = level;
    }

    @Override
    public int weaponDamage(int heroStr, int heroDex, int heroInt) {
        int damage = baseDamage + weaponLevel * 3 + heroDex * 2;

        return damage;
    }

    @Override
    public String getWeaponName() {
        return weaponName;
    }

    @Override
    public int getWeaponLevel() {
        return weaponLevel;
    }
}
