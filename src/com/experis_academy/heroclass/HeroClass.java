package com.experis_academy.heroclass;

public class HeroClass {

    private int startHp = 0;
    private int startStr = 0;
    private int startDex = 0;
    private int startInt = 0;

    private int levelUpHp = 0;
    private int levelUpStr = 0;
    private int LevelUpDex = 0;
    private int LevelUpInt = 0;
    private String heroClassName = "";

    public String getHeroClassName() {
        return heroClassName;
    }

    public int getStartHp() {
        return startHp;
    }

    public int getStartStr() {
        return startStr;
    }

    public int getStartDex() {
        return startDex;
    }

    public int getStartInt() {
        return startInt;
    }

    public int getLevelUpHp() {
        return levelUpHp;
    }

    public int getLevelUpStr() {
        return levelUpStr;
    }

    public int getLevelUpDex() {
        return LevelUpDex;
    }

    public int getLevelUpInt() {
        return LevelUpInt;
    }

    public void setStartHp(int startHp) {
        this.startHp = startHp;
    }

    public void setStartStr(int startStr) {
        this.startStr = startStr;
    }

    public void setStartDex(int startDex) {
        this.startDex = startDex;
    }

    public void setStartInt(int startInt) {
        this.startInt = startInt;
    }

    public void setLevelUpHp(int levelUpHp) {
        this.levelUpHp = levelUpHp;
    }

    public void setLevelUpStr(int levelUpStr) {
        this.levelUpStr = levelUpStr;
    }

    public void setLevelUpDex(int levelUpDex) {
        LevelUpDex = levelUpDex;
    }

    public void setLevelUpInt(int levelUpInt) {
        LevelUpInt = levelUpInt;
    }

    public void setHeroClassName(String heroClassName) {
        this.heroClassName = heroClassName;
    }


}
