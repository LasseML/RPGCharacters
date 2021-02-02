package com.experis_academy;

import com.experis_academy.equipment.EquipmentFactory;
import com.experis_academy.equipment.WeaponFactory;
import com.experis_academy.hero.Hero;
import com.experis_academy.heroclass.HeroClassFactory;

public class Main {

    public static void main(String[] args) {
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


    }
}
