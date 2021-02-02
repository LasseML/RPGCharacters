package com.experis_academy.equipment;

public class MeleeWeapon implements Weapon{

    private String weaponName ="";
    private String weaponType = "MELEE";
    private String equipmentSlot = "Weapon";
    private int weaponLevel = 1;
    private int baseDamage = 15;

    public MeleeWeapon(String name, int level){
        this.weaponName = name;
        this.weaponLevel = level;
    }

    @Override
    public int weaponDamage(int heroStr, int heroDex, int heroInt) {
        int damage = (int) (baseDamage + weaponLevel * 2 + heroStr * 1.5);

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
