package com.lab1.backend2.Services;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.lab1.backend2.Containers.ZodicSign;
import com.lab1.backend2.Dao.SignRepository;

@Service
public class FindService {
    SignRepository signRep = new SignRepository();
    public ZodicSign findSign(String name){
        name = translator(name);
       /*String[] arr = {"Air", "Earth", "Water", "Fire"};*/
       ArrayList<String> arr = new ArrayList<String>();
       arr.add("Air");
       arr.add("Earth");
       arr.add("Water");
       arr.add("Fire");
        ZodicSign sign = new ZodicSign();
        for(int i = 0; i < 4; i ++){
            sign = signRep.getZodicSign(arr.get(i), name);
            if(sign != null){
                break;
            }
        }
        return sign;
    }
    private String translator(String name){
        HashMap<String, String> trans = new HashMap<>();
        trans.put("Весы", "Libra");
        trans.put("Овен", "Aries");
        trans.put("Лев", "Leo");
        trans.put("Стрелец", "Sagittarius");
        trans.put("Телец", "Taurus");
        trans.put("Козерог", "Capricorn");
        trans.put("Близнецы", "Gemini");
        trans.put("Водолей", "Aquarius");
        trans.put("Рак", "Cancer");
        trans.put("Скорпион", "Scorpio");
        trans.put("Рыбы", "Pisces");
        trans.put("Дева", "Virgo");
        return trans.get(name);
    }
}
