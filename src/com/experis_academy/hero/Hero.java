package com.experis_academy.hero;

import com.experis_academy.equipment.Equipment;
import com.experis_academy.equipment.Weapon;
import com.experis_academy.heroclass.HeroClass;

import java.util.HashMap;

public class Hero {
    private String heroName = "";
    private HeroClass heroClass;
    private int heroMaxHealth = 0;
    private int heroStr = 0;
    private int heroDex = 0;
    private int heroInt = 0;

    private int statFromEquipmentHp = 0;
    private int statFromEquipmentStr = 0;
    private int statFromEquipmentDex = 0;
    private int statFromEquipmentInt = 0;

    public int heroLevel = 0;
    private int heroExp = 0;
    private int nextLevelAtThisExp = 0;
    private final int expTofirstLevelUp = 100;
    private final double expLevelRequirementMultiplier = 0.10;

    private Weapon weaponSlot = null;
    private Equipment bodySlot = null;
    private Equipment headSlot = null;
    private Equipment legSlot = null;

    //initiate the hero and set starting stats to stats in class
    public Hero(String name, HeroClass heroClass) {
        heroLevel = 1;
        nextLevelAtThisExp = expTofirstLevelUp;
        this.heroName = name;
        this.heroClass = heroClass;
        this.heroMaxHealth = heroClass.getStartHp();
        this.heroStr = heroClass.getStartStr();
        this.heroDex = heroClass.getStartDex();
        this.heroInt = heroClass.getStartInt();
    }

    private void levelUp(){
        heroLevel++;
        heroMaxHealth = heroMaxHealth + heroClass.getLevelUpHp();
        heroStr = heroStr + heroClass.getLevelUpStr();
        heroDex = heroDex + heroClass.getLevelUpDex();
        heroInt = heroInt + heroClass.getLevelUpInt();
    }

    public void gainExp(int exp){
        // checks if the hero have enough exp to level up, calculates level and calls level up
        heroExp = heroExp + exp;
        if (heroExp >= nextLevelAtThisExp){
            levelUp();
            nextLevelAt();
            gainExp(0);
        }
    }

    // returns next exp target for next level
    private void nextLevelAt(){
        nextLevelAtThisExp = nextLevelAtThisExp + (int) (expTofirstLevelUp *
                                                  Math.pow((1 + expLevelRequirementMultiplier), heroLevel - 1 ));
    }
    // Equipes a weapon, weapons dosent change stats so no unequip method needed
    public void equipWeapon(Weapon weapon){
        if (weapon != null && canEquip(weapon, weapon.getWeaponLevel())) {
            System.out.println(heroName + " has equipped the mighty weapon: " + weapon.getWeaponName());
            weaponSlot = weapon;
        }
    }

    public void equipItem(Equipment equipment){
        if (equipment != null && canEquip(equipment, equipment.getEquipmentLevel())){

            unequipItem(equipment);

            if(equipment.equipmentSlot().equals("BODY")){
                bodySlot = equipment;
            } else if (equipment.equipmentSlot().equals("HEAD")) {
                headSlot = equipment;
            } else if (equipment.equipmentSlot().equals("LEGS")) {
                legSlot = equipment;
            }else {
                System.out.println("Unrecognized equipment slot!");
            }
            statFromEquipmentHp = statFromEquipmentHp + equipment.getEquipmentStatHp();
            statFromEquipmentStr = statFromEquipmentStr + equipment.getEquipmentStatStr();
            statFromEquipmentDex = statFromEquipmentDex + equipment.getEquipmentStatDex();
            statFromEquipmentInt = statFromEquipmentInt + equipment.getEquipmentStatInt();
            System.out.println(equipment.getEquipmentName() + " has been equipped");
        }
    }

    private void unequipItem(Equipment equipment){
        Equipment itemToRemove = null;
        if (equipment.equipmentSlot().equals("BODY")){
            itemToRemove = bodySlot;
            bodySlot = null;
        } else if (equipment.equipmentSlot().equals("HEAD")){
            itemToRemove = headSlot;
            headSlot = null;
        } else if (equipment.equipmentSlot().equals("LEGS")){
            itemToRemove = legSlot;
            legSlot = null;
        } else {
            System.out.println("Tried to unequip unknown item type");
        }

        if (itemToRemove != null){
            statFromEquipmentHp = statFromEquipmentHp - itemToRemove.getEquipmentStatHp();
            statFromEquipmentStr = statFromEquipmentStr - itemToRemove.getEquipmentStatStr();
            statFromEquipmentDex = statFromEquipmentDex - itemToRemove.getEquipmentStatDex();
            statFromEquipmentInt = statFromEquipmentInt - itemToRemove.getEquipmentStatInt();
            System.out.println(itemToRemove.getEquipmentName() + " has been unequipped");
        }
    }

    public int attack(){
        int damage = 0;
        if (weaponSlot != null){
            damage = weaponSlot.weaponDamage((heroStr + statFromEquipmentStr)
                    , (heroDex + statFromEquipmentDex)
                    , (heroInt + statFromEquipmentInt) );
        } else {
            System.out.println(heroName + " cant attack without a weapon!");
        }

        return damage;
    }

    private boolean levelRequirementMet(int levelRequired){
        return heroLevel >= levelRequired;
    }

    private boolean canEquip(Object equipment, int itemLevel){
        boolean equippeble = false;
        if(equipment == null){
            System.out.println("You didnt hand me any item!");
        }
        if (levelRequirementMet(itemLevel)){
            equippeble = true;
        } else {
            System.out.println("Requirements not met, train harder!");
        }
        return equippeble;
    }

    //Prints out the heros stats, this would normally be placed in a class for itself, but in this exercise its
    // been placed here for the sake of simplicity
    public void printHeroStats(){
        System.out.println(heroName + "`s Stats:");
        System.out.println("Class: " + heroClass.getHeroClassName());
        System.out.println("HP: " + (heroMaxHealth + statFromEquipmentHp));
        System.out.println("Str: " + (heroStr + statFromEquipmentStr));
        System.out.println("Dex: " + (heroDex + statFromEquipmentDex));
        System.out.println("Int: " + (heroInt + statFromEquipmentInt));
        System.out.println("Level: " + heroLevel);
        System.out.println("Xp To next: " + (nextLevelAtThisExp - heroExp));
        System.out.println();
    }

    public void printEquipmentStats(Equipment equipment){
        System.out.println(equipment.getEquipmentName() + "`s Stats:");
        System.out.println("HP: " + equipment.getEquipmentStatHp());
        System.out.println("Str: " + equipment.getEquipmentStatStr());
        System.out.println("Dex: " + equipment.getEquipmentStatDex());
        System.out.println("Int: " + equipment.getEquipmentStatInt());
        System.out.println("Level: " + equipment.getEquipmentLevel());
        System.out.println();
    }

    public Weapon getWeaponSlot() {
        return weaponSlot;
    }

    public Equipment getBodySlot() {
        return bodySlot;
    }

    public Equipment getHeadSlot() {
        return headSlot;
    }

    public Equipment getLegSlot() {
        return legSlot;
    }
}
