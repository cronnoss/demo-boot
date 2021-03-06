package com.geekbrains.demoboot.repositories;

import com.geekbrains.demoboot.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
//public interface ItemRepository extends JpaRepository<Item, Long> {
//    Item findByTitle(String title);
//    List<Item> findByCostBetween(int min, int max);
//}

@Repository
public interface ItemRepository extends PagingAndSortingRepository<Item, Long>, JpaSpecificationExecutor<Item> {
}