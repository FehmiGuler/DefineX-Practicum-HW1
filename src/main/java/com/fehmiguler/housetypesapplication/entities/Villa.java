package com.fehmiguler.housetypesapplication.entities;

public class Villa extends HouseTypes {

    public Villa(int price, int squareMeter, int roomCount, int livingRoomCount) {
        super(price, "Villa", squareMeter, roomCount, livingRoomCount);
    }
    public static HouseTypes[] getVillaList(){
        HouseTypes[] villaList = new Villa[3];
        villaList[0] = new Villa(3_000_000, 165, 4, 1);
        villaList[1] = new Villa(4_450_000, 150, 3, 1);
        villaList[2] = new Villa(6_000_000, 300, 5, 2);

        return villaList;
    }
}
