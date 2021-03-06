package com.experis_academy;

import com.experis_academy.equipment.EquipmentFactory;
import com.experis_academy.equipment.WeaponFactory;
import com.experis_academy.hero.Hero;
import com.experis_academy.heroclass.HeroClassFactory;

public class Main {

    public static void main(String[] args) {
        //Alice is a ranger and shows how to level up here

        Hero alice = new Hero("Alice", HeroClassFactory.getHeroClass("RANGER"));
        alice.printHeroStats();
        alice.gainExp(500);
        alice.printHeroStats();

        //Bob is a mage and do a lot of stuff here
        Hero bob = new Hero("Bob", HeroClassFactory.getHeroClass("MAGE"));
        bob.printHeroStats();
        bob.gainExp(1300);
        bob.printHeroStats();
        System.out.println("Attack Damage: " + bob.attack());
        bob.equipWeapon(WeaponFactory.getWeaponFactory("Cruise missile", 999, "MISSILE"));
        bob.equipWeapon(WeaponFactory.getWeaponFactory("Staff of burn burn", 6, "MAGIC"));
        System.out.println("Attack Damage: " + bob.attack());
        bob.equipItem(EquipmentFactory.getEquipmentFactory("Pretty cloak of the wind",
                5, "CLOTH", "BODY"));
        bob.printHeroStats();
        bob.equipItem(EquipmentFactory.getEquipmentFactory("Ugly coat of the north",
                7, "CLOTH", "BODY"));
        bob.printHeroStats();
        bob.printEquipmentStats(bob.getBodySlot());
        System.out.println(bob.attack());

        //Clementine is a warrior
        Hero clementine = new Hero("Clementine", HeroClassFactory.getHeroClass("WARRIOR"));
        clementine.printHeroStats();
        clementine.gainExp(0);
        clementine.equipItem(EquipmentFactory.getEquipmentFactory("Simple plate armor",
                1, "PLATE", "BODY"));
        clementine.printEquipmentStats(clementine.getBodySlot());
        clementine.printHeroStats();
        clementine.equipItem(EquipmentFactory.getEquipmentFactory("Simple plate helmet",
                1, "PLATE", "HEAD"));
        clementine.printEquipmentStats(clementine.getHeadSlot());
        System.out.println(clementine.attack());
        clementine.equipWeapon(WeaponFactory.getWeaponFactory("Maul of Bonk", 1, "MELEE"));
        System.out.println(clementine.attack());


    }
}
