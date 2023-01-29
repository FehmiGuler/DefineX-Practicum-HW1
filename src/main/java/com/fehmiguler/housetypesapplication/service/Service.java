package com.fehmiguler.housetypesapplication.service;

import com.fehmiguler.housetypesapplication.HouseTypesApplication;
import com.fehmiguler.housetypesapplication.entities.*;


public class Service {
    private HouseTypes[] yazlikList;
    private HouseTypes[] villaList;
    private HouseTypes[] evList;

    public Service(HouseTypes[] yazlikList, HouseTypes[] villaList, HouseTypes[] evList) {
        this.yazlikList = yazlikList;
        this.villaList = villaList;
        this.evList = evList;
    }

    //Toplam fiyat metodu
    public int totalPrice(HouseTypes[] houseTypes){
        int totalPrice=0;
        for(HouseTypes h : houseTypes){
            totalPrice += h.getPrice();
        }

        return totalPrice;
    }

    //Tüm tipteki evler için toplam fiyat metodu
    public int totalPriceOfAll(){
        int totalPriceOfAll=0;
        totalPriceOfAll = totalPrice(yazlikList) + totalPrice(evList) + totalPrice(villaList);
        return totalPriceOfAll;
    }

    //Ortalama metrekare dönen metod
    public int averageSquareMeter(HouseTypes[] houseTypes){
        int average=0;
        for(HouseTypes h : houseTypes){
            average += h.getSquareMeter();
        }
        average = average / houseTypes.length;
        return average;
    }

    //Tüm tipteki evler için ortalama metrekare dönen metod
    public int averageSquareMeterOfAll(){
        int averageSquareMeterOfAll = 0;
        averageSquareMeterOfAll = ( averageSquareMeter(villaList) + averageSquareMeter(evList) + averageSquareMeter(yazlikList) ) / 3;
        return  averageSquareMeterOfAll;
    }


    public void filter(int room, int livingRoom) {
        int yazlikCounter=0;
        int villaCounter=0;
        int evCounter=0;
        for(HouseTypes y: yazlikList){
            if(room == y.getRoomCount() && livingRoom == y.getLivingRoomCount()){
                yazlikCounter++;
            }
        }
        for(HouseTypes e: evList){
            if(room == e.getRoomCount() && livingRoom == e.getLivingRoomCount()){
                evCounter++;
            }
        }
        for(HouseTypes v: villaList){
            if(room == v.getRoomCount() && livingRoom == v.getLivingRoomCount()){
                villaCounter++;
            }
        }
        System.out.println("There are "+evCounter+" ev, "+villaCounter+" villa and "+yazlikCounter+" yazlik according to the criteria you are looking for.");
    }
}
