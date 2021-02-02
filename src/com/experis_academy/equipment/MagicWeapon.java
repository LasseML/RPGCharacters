package com.experis_academy.equipment;

public class MagicWeapon implements Weapon{

    private String weaponName ="";
    private String weaponType = "MAGIC";
    private String equipmentSlot = "Weapon";
    private int weaponLevel = 1;
    private int baseDamage = 25;

    public MagicWeapon(String name, int level){
        this.weaponName = name;
        this.weaponLevel = level;
    }

    @Override
    public int weaponDamage(int heroStr, int heroDex, int heroInt) {
        int damage = baseDamage + weaponLevel * 2 + heroInt * 3;

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
