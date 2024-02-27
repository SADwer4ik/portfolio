package com.lab1.backend2.Services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import com.lab1.backend2.Containers.ZodicSign;
import com.lab1.backend2.Dao.SignRepository;

@Service
public class SignService {
    public ArrayList<ZodicSign> getZodSign(LocalDate date){
        int day, month;
        day = date.getDayOfMonth();
        month = date.getMonthValue();
        SignRepository signRep = new SignRepository();
        ArrayList<ZodicSign> res = new ArrayList<ZodicSign>();
        switch(month){
            case(1):
                if(day < 17){
                    res.add( signRep.getZodicSign("Earth", "Capricorn")); //Козерог
                }
                else if(day >= 24){
                    res.add(signRep.getZodicSign("Air", "Aquarius")); //Водолей
                }
                else{
                    res.add(signRep.getZodicSign("Air", "Aquarius"));
                    res.add( signRep.getZodicSign("Earth", "Capricorn"));
                }
                break;
            case(2):
                if(day < 15) res.add(signRep.getZodicSign("Air", "Aquarius")); // Водолей
                else if(day >= 23) res.add(signRep.getZodicSign("Water", "Pisces")); //Рыбы
                else{
                    //Водолей или Рыбы
                    res.add(signRep.getZodicSign("Air", "Aquarius"));
                    res.add(signRep.getZodicSign("Water", "Pisces"));
                }
                break;
            case(3):
                if(day < 17) res.add(signRep.getZodicSign("Water", "Pisces")); // Рыбы
                else if(day >= 24) res.add(signRep.getZodicSign("Fire", "Aries")); //Овен
                else{
                    res.add(signRep.getZodicSign("Fire", "Aries"));
                    res.add(signRep.getZodicSign("Water", "Pisces"));
                }
                break; // Овен или Рыбы
            case(4):
                if(day < 17) res.add(signRep.getZodicSign("Fire", "Aries")); //Овен
                else if(day >= 24) res.add(signRep.getZodicSign("Earth", "Taurus")); //Телец
                else{
                    res.add(signRep.getZodicSign("Earth", "Taurus"));
                    res.add(signRep.getZodicSign("Fire", "Aries"));
                } 
                break;// Телец или Овен
            case(5):
                if(day < 17) res.add(signRep.getZodicSign("Earth", "Taurus"));// Телец
                else if(day >= 24) res.add(signRep.getZodicSign("Air", "Gemini")); //Близнецы
                else{
                    res.add(signRep.getZodicSign("Air", "Gemini"));
                    res.add(signRep.getZodicSign("Earth", "Taurus"));
                } 
                break;// Близнецы или Телец
            case(6):
                if(day <= 18) res.add(signRep.getZodicSign("Air", "Gemini"));
                else if (day >= 25) res.add(signRep.getZodicSign("Water", "Cancer"));//Рак
                else{
                    res.add(signRep.getZodicSign("Air", "Gemini"));
                    res.add(signRep.getZodicSign("Water", "Cancer"));
                }
                break;
            case(7):
                if(day < 19) res.add(signRep.getZodicSign("Water", "Cancer"));
                else if(day >= 25) res.add(signRep.getZodicSign("Fire", "Leo"));//Лев
                else{
                    res.add(signRep.getZodicSign("Water", "Cancer"));
                    res.add(signRep.getZodicSign("Fire", "Leo"));
                }
                break;
            case(8):
                if(day < 19) res.add(signRep.getZodicSign("Fire", "Leo"));
                else if(day >= 26) res.add(signRep.getZodicSign("Earth", "Virgo")); //Дева
                else{
                    res.add(signRep.getZodicSign("Fire", "Leo"));
                    res.add(signRep.getZodicSign("Earth", "Virgo"));
                }
                break;
            case(9):
                if(day <= 20) res.add(signRep.getZodicSign("Earth", "Virgo"));
                else if(day > 26) res.add(signRep.getZodicSign("Air", "Libra")); //Весы
                else{
                    res.add(signRep.getZodicSign("Earth", "Virgo")); 
                    res.add(signRep.getZodicSign("Air", "Libra"));
                }
                break;
            case(10):
                if(day < 20){
                    res.add(signRep.getZodicSign("Air", "Libra"));
                }
                else if(day > 27){
                     res.add(signRep.getZodicSign("Water", "Scorpio")); 
                }
            // Скорпион
                else{
                    res.add(signRep.getZodicSign("Air", "Libra"));
                    res.add(signRep.getZodicSign("Water", "Scorpio"));
                }
                break;
            case(11):
                if(day < 19){ res.add(signRep.getZodicSign("Water", "Scorpio")); break;}
                else if(day >= 26) res.add(signRep.getZodicSign("Fire", "Sagittarius")); //Стрелец
                else{
                    res.add(signRep.getZodicSign("Water", "Scorpio"));
                    res.add(signRep.getZodicSign("Fire", "Sagittarius"));
                }
                break;
            case(12):
                if(day < 18) res.add(signRep.getZodicSign("Fire", "Sagittarius"));
                else if(day > 24) res.add( signRep.getZodicSign("Earth", "Capricorn"));
                else{
                    res.add(signRep.getZodicSign("Fire", "Sagittarius"));
                    res.add( signRep.getZodicSign("Earth", "Capricorn"));
                }
        }
        return res;
    }
}
