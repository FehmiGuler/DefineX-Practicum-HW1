package com.fehmiguler.housetypesapplication.entities;

public abstract class HouseTypes {
    private int price;
    private String type;
    private int squareMeter;
    private int roomCount;
    private int livingRoomCount;

    public HouseTypes(int price, String type, int squareMeter, int roomCount, int livingRoomCount) {
        this.price = price;
        this.type = type;
        this.squareMeter = squareMeter;
        this.roomCount = roomCount;
        this.livingRoomCount = livingRoomCount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(int squareMeter) {
        this.squareMeter = squareMeter;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getLivingRoomCount() {
        return livingRoomCount;
    }

    public void setLivingRoomCount(int livingRoomCount) {
        this.livingRoomCount = livingRoomCount;
    }
}
