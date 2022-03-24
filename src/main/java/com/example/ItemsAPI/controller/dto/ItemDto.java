package com.example.ItemsAPI.controller.dto;

public class ItemDto
{

    private String name;
    private String date;
    private String itemName;
    private String itemType;
    private String description;
    private String reccomend;
    private String frequency;
    private String img;





    public ItemDto(String name,String date, String itemName, String itemType, String description, String reccomend,String frequency, String img )
    {
        this.name = name;
        this.date = date;
        this.itemName = itemName;
        this.itemType = itemType;
        this.description = description;
        this.reccomend = reccomend;
        this.frequency = frequency;
        this.img = img;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReccomend() {
        return reccomend;
    }

    public void setReccomend(String reccomend) {
        this.reccomend = reccomend;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
