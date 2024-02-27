package com.lab1.backend2.Dao;

import java.io.*;
import java.util.ArrayList;
import com.lab1.backend2.Containers.ZodicSign;

public class SignRepository {
    private String element;
    private String sign;
    public SignRepository(){
        element = "";
        sign = "";
    }
    public SignRepository(String element, String sign){
        this.element = element;
        this.sign = sign;
    }
    public ZodicSign getZodicSign(String element, String sign){
        ZodicSign zodicSign = new ZodicSign();
        BufferedReader reader;
        ArrayList<String> arr = new ArrayList<String>();
        String path = "./DB/" + element + "/" + sign + ".txt";
        //FileInputStream file = new FileInputStream(path);
        try{
            System.setIn(new FileInputStream(path));
            reader = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
            String line = reader.readLine();
            while(line != null){
                arr.add(line);
                line = reader.readLine();
            }
            reader.close();
        }
        catch(Exception ex){
            return null;
        }
        String desc = "";
            for(int i = 6; i < arr.size(); i++){
                desc += arr.get(i);
            }
            zodicSign = new ZodicSign(sign, element,arr.get(0), arr.get(1), arr.get(3), arr.get(2), arr.get(4), desc, arr.get(5) );
        return zodicSign;
    } 
    /*----------------GETTERS_AND_SETTERS------------------ */
    public String getElement() {
        return element;
    }
    public String getSign() {
        return sign;
    }
    public void setElement(String element) {
        this.element = element;
    }
    public void setSign(String sign) {
        this.sign = sign;
    }
}
