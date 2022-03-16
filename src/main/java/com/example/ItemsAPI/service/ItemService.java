package com.example.ItemsAPI.service;

import com.example.ItemsAPI.model.Item;

import java.util.List;

public interface ItemService
{

    Item save(Item item );

    void delete( int itemId );

    List<Item> all();

    Item findById( int itemId );

}
