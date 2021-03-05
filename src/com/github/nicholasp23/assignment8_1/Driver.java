package com.github.nicholasp23.assignment8_1;

import java.util.*;

public class Driver {

    public static void main(String[] args){

        Map<UrgencyLevel, Set<MedicalInfo>> infoMap = new TreeMap<>(((o1, o2) -> o2.ordinal() - o1.ordinal()));

        for(UrgencyLevel level : UrgencyLevel.values()){
            infoMap.put(level, new HashSet<>());
        }

        infoMap.get(UrgencyLevel.CASUAL).add( new MedicalInfo("coolBoy", 13, 65, 120));
        infoMap.get(UrgencyLevel.MEDIOCORE).add( new MedicalInfo("aweBoy", 25, 87, 129));
        infoMap.get(UrgencyLevel.HARDCORE).add( new MedicalInfo("dedBoy", 87, 59, 87));
        infoMap.get(UrgencyLevel.CASUAL).add( new MedicalInfo("notsocoolBoy", 15, 60, 156));
        infoMap.get(UrgencyLevel.MEDIOCORE).add( new MedicalInfo("notsoaweBoy", 23, 63, 183));
        infoMap.get(UrgencyLevel.HARDCORE).add( new MedicalInfo("notsodedBoy", 48, 45, 356));

        for(Map.Entry<UrgencyLevel, Set<MedicalInfo>> pairofThese : infoMap.entrySet()){
            UrgencyLevel level = pairofThese.getKey();
            System.out.println("Patient of Urgency Level " + level);
            for (MedicalInfo medicalInfo : pairofThese.getValue()) {
                System.out.println(medicalInfo);
            }
            System.out.println("");
        }
    }

}
