package com.experis_academy.heroclass;

public class HeroClassFactory {

    //Factory to generate heroClass objects, takes a class, as string, and returns a class object
    public static HeroClass getHeroClass(String heroClass){

        HeroClass  newHeroClass = new HeroClass();

        if(heroClass.equalsIgnoreCase("MAGE")) {
            newHeroClass.setHeroClassName("Mage");
            newHeroClass.setStartHp(100);
            newHeroClass.setStartStr(2);
            newHeroClass.setStartDex(3);
            newHeroClass.setStartInt(10);
            newHeroClass.setLevelUpHp(15);
            newHeroClass.setLevelUpStr(1);
            newHeroClass.setLevelUpDex(2);
            newHeroClass.setLevelUpInt(5);

            return newHeroClass;
        }
        if(heroClass.equalsIgnoreCase("RANGER")) {
            newHeroClass.setHeroClassName("Ranger");
            newHeroClass.setStartHp(120);
            newHeroClass.setStartStr(5);
            newHeroClass.setStartDex(10);
            newHeroClass.setStartInt(2);
            newHeroClass.setLevelUpHp(20);
            newHeroClass.setLevelUpStr(2);
            newHeroClass.setLevelUpDex(5);
            newHeroClass.setLevelUpInt(1);

            return newHeroClass;
        }
        if(heroClass.equalsIgnoreCase("WARRIOR")) {
            newHeroClass.setHeroClassName("Warrior");
            newHeroClass.setStartHp(152);
            newHeroClass.setStartStr(10);
            newHeroClass.setStartDex(3);
            newHeroClass.setStartInt(1);
            newHeroClass.setLevelUpHp(30);
            newHeroClass.setLevelUpStr(5);
            newHeroClass.setLevelUpDex(2);
            newHeroClass.setLevelUpInt(1);

            return newHeroClass;
        }

        System.out.println("No such class!");
        return null;

    }
}
