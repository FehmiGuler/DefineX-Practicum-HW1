package com.fehmiguler.housetypesapplication.entities;

public class Ev extends HouseTypes{
    public Ev(int price, int squareMeter, int roomCount, int livingRoomCount) {
        super(price, "EV", squareMeter, roomCount, livingRoomCount);
    }
    public static HouseTypes[] getEvList(){
        HouseTypes[] evList = new Ev[3];
        evList[0] = new Ev(2_000_000, 142, 4, 1);
        evList[1] = new Ev(3_450_000, 123, 3, 1);
        evList[2] = new Ev(5_000_000, 234, 5, 2);

        return evList;
    }
}
