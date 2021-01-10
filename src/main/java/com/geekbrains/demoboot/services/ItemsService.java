package com.geekbrains.demoboot.services;

import com.geekbrains.demoboot.entities.Item;
import com.geekbrains.demoboot.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsService {
    private ItemRepository itemRepository;

    @Autowired
    public void setItemRepository(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAllItems() {
        System.out.println(itemRepository.findByTitle("Tree"));
        System.out.println(itemRepository.findByCostBetween(30, 70));
        return itemRepository.findAll();
    }
}
