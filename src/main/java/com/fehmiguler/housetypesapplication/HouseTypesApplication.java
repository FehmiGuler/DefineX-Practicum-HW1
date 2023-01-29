package com.fehmiguler.housetypesapplication;


import com.fehmiguler.housetypesapplication.entities.Ev;
import com.fehmiguler.housetypesapplication.entities.Villa;
import com.fehmiguler.housetypesapplication.entities.Yazlik;
import com.fehmiguler.housetypesapplication.service.Service;


public class HouseTypesApplication {
    public static void main(String[] args) {
        Service s = new Service(Yazlik.getYazlikList(), Villa.getVillaList(), Ev.getEvList());


        System.out.println("Evlerin toplam fiyatı: "+s.totalPrice(Ev.getEvList())); //Evlerin toplam fiyatı
        System.out.println("Villaların toplam fiyatı: "+s.totalPrice(Villa.getVillaList())); //Villaların toplam fiyatı
        System.out.println("Yazlıkların toplam fiyatı: "+s.totalPrice(Yazlik.getYazlikList())); //Yazlıkların toplam fiyatı
        System.out.println("Tüm tipteki evlerin toplam fiyatı: "+s.totalPriceOfAll()); //Tüm tipteki evlerin toplam fiyatı
        System.out.println("Evlerin ortalama metrekaresi: "+s.averageSquareMeter(Ev.getEvList())); //Evlerin ortalama metrekaresi
        System.out.println("Villaların ortalama metrekaresi: "+s.averageSquareMeter(Villa.getVillaList())); //Villaların ortalama metrekaresi
        System.out.println("Yazlıkların ortalama metrekaresi: "+s.averageSquareMeter(Yazlik.getYazlikList())); //Yazlıkların ortalama metrekaresi
        System.out.println("Tüm tipteki evlerin ortalama metrekaresi: "+s.averageSquareMeterOfAll()); //Tüm tipteki evlerin ortalama metrekaresi
        s.filter(3,1); //Oda ve salon sayısına göre tüm tipteki evleri filtreleyip dönen metot

    }
}
