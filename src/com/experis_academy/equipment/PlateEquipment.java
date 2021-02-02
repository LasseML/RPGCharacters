package com.experis_academy.equipment;

public class PlateEquipment implements Equipment{

        private String equipmentName ="";
        private String equipmentType = "PLATE";
        private String equipmentSlot = "";
        private int equipmentLevel = 1;
        private double statModifier = 0;


        public PlateEquipment(String name, int level, String equipmentSlot){
            this.equipmentName = name;
            this.equipmentLevel = level;
            this.equipmentSlot = equipmentSlot;

            if(equipmentSlot.equalsIgnoreCase("BODY")){
                statModifier = 1;
            } else if (equipmentSlot.equalsIgnoreCase("HEAD")){
                statModifier = 0.8;
            } else if(equipmentSlot.equalsIgnoreCase("LEGS")){
                statModifier = 0.6;
            } else {
                System.out.println("Unrecognized equipmentslot!");
            }

        }

        @Override
        public String equipmentSlot() {
            return equipmentSlot;
        }

        @Override
        public String getEquipmentName() {
            return equipmentName;
        }

        @Override
        public int getEquipmentLevel() {
            return equipmentLevel;
        }

        @Override
        public int getEquipmentStatStr() {
            return (int) (statModifier * (3 + equipmentLevel * 2));
        }

        @Override
        public int getEquipmentStatDex() { return (int) (statModifier * (1 + equipmentLevel * 1));
        }

        @Override
        public int getEquipmentStatInt() { return 0; };

        @Override
        public int getEquipmentStatHp() {
            return (int) (statModifier * (30 + equipmentLevel * 12));
        }
}
