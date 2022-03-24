package com.example.ItemsAPI.model;


import com.example.ItemsAPI.controller.dto.ItemDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;
    private String date;
    private String itemName;
    private String itemType;
    private String description;
    private String reccomend;
    private String frequency;
    private String img;

//will have to change this to match your fields.

public Item(ItemDto itemDto){
   this.name=itemDto.getName();
   this.date=itemDto.getDate();
    this.itemName=itemDto.getItemName();
    this.itemType=itemDto.getItemType();
    this.description=itemDto.getDescription();
    this.reccomend=itemDto.getReccomend();
    this.frequency=itemDto.getFrequency();
   this.img=itemDto.getImg();
}
//blank constructor?
public Item(){};


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
