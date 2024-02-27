package com.lab1.backend2.Containers;

public class ZodicSign {
    private String sign;
    private String element;
    private String rusName;
    private String bgColor;
    private String quality;
    private String description;
    private String neighbours;
    private String rusElement;
    private String date;
    public ZodicSign(){
        sign = "";
        element = "";
        rusName = "";
        quality = "";
        description = "";
        neighbours = "";
        bgColor = "";
        rusElement = "";
        date = "";
    }
    public ZodicSign(String sign, String element, String rusElement,
    String neighbour, String rusName, String bgColor, String quality, String description, String date){
        this.sign = sign;
        this.rusElement = rusElement;
        this.element = element;
        this.rusName = rusName;
        this.quality = quality;
        this.description = description;
        this.neighbours = neighbour;
        this.bgColor = bgColor;
        this.date = date;
    }
    /*-----GETTERS_AND_SETTERS----------------- */
    public String getRusName() {
        return rusName;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getRusElement() {
        return rusElement;
    }
    public void setRusElement(String rusElement) {
        this.rusElement = rusElement;
    }
    public void setRusName(String rusName) {
        this.rusName = rusName;
    }
    public String getBgColor() {
        return bgColor;
    }
    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }
    public String getNeighbours() {
        return neighbours;
    }
    public void setNeighbours(String neighbours) {
        this.neighbours = neighbours;
    }
    public String getElement() {
        return element;
    }
    public String getQuality() {
        return quality;
    }
    public String getSign() {
        return sign;
    }
    public void setElement(String element) {
        this.element = element;
    }
    public void setQuality(String quality) {
        this.quality = quality;
    }
    public void setSign(String sign) {
        this.sign = sign;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
