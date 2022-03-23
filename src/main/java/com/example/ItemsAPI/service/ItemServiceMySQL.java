package com.example.ItemsAPI.service;

import com.example.ItemsAPI.model.Item;
import com.example.ItemsAPI.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemServiceMySQL implements ItemService
{
    private final ItemRepository itemRepository;

    public ItemServiceMySQL(ItemRepository itemRepository )
    {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item save(Item item )
    {
        return itemRepository.save(item);
    }

    @Override
    public void delete(Integer itemId )
    {
        itemRepository.deleteById(itemId );
    }

    @Override
    public List<Item> all()
    {
        List<Item> result = new ArrayList<>();
        itemRepository.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Item findById(Integer itemId )
    {
        return itemRepository.findById(itemId).orElseThrow(()-> new IllegalStateException("Item not found, try again."));

    }
}

