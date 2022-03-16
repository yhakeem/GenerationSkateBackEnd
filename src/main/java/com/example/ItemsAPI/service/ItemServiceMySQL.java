package com.example.ItemsAPI.service;

import com.example.ItemsAPI.model.Item;
import com.example.ItemsAPI.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceMySQL implements ItemService
{
    private final ItemRepository itemRepository;

    public ItemServiceMySQL(@Autowired ItemRepository itemRepository )
    {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item save(Item item )
    {
        //TODO implement this method
        return null;
    }

    @Override
    public void delete( int itemId )
    {
        //TODO implement this method
    }

    @Override
    public List<Item> all()
    {
        //TODO implement this method
        return null;
    }

    @Override
    public Item findById( int itemId )
    {
        //TODO implement this method
        return null;
    }
}

