package com.Ghassen.ShopMB.repository;


import com.Ghassen.ShopMB.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    List<OrderItem> findByProductId(Long id);

}
