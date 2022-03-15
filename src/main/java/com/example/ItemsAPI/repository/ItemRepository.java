package com.example.ItemsAPI.repository;
import com.example.ItemsAPI.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer> {
}