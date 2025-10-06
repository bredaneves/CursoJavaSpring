package com.devsuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.entities.OrderItem;
import com.devsuperior.dsmeta.entities.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
