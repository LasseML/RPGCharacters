package com.experis_academy.equipment;

public class EquipmentFactory {

    //Factory to generate equiplemt pieces objects
    public static Equipment getEquipmentFactory(String equipmentName,
                                                int equipmentLevel,
                                                String equipmentType,
                                                String equipmentSlot){

        if(equipmentType.equalsIgnoreCase("CLOTH")) {
            return new ClothEquipment(equipmentName, equipmentLevel, equipmentSlot);
        }
        if(equipmentType.equalsIgnoreCase("LEATHER")) {
            return new LeatherEquipment(equipmentName, equipmentLevel, equipmentSlot);
        }
        if(equipmentType.equalsIgnoreCase("PLATE")) {
            return new PlateEquipment(equipmentName, equipmentLevel, equipmentSlot);
        }

        System.out.println("No such equipment type!");

        return null;

    }

}
