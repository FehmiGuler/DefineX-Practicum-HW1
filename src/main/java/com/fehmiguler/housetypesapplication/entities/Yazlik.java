package com.fehmiguler.housetypesapplication.entities;

public class Yazlik extends HouseTypes {

    public Yazlik(int price, int squareMeter, int roomCount, int livingRoomCount) {
        super(price, "Yazlik", squareMeter, roomCount, livingRoomCount);
    }
    public static HouseTypes[] getYazlikList() {
        HouseTypes[] yazlikList = new Yazlik[3];
        yazlikList[0] = new Yazlik(1_000_000, 140, 4, 1);
        yazlikList[1] = new Yazlik(1_450_000, 120, 3, 1);
        yazlikList[2] = new Yazlik(3_000_000, 200, 5, 2);

        return yazlikList;
    }
}
