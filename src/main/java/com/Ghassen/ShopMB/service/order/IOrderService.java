package com.Ghassen.ShopMB.service.order;





import com.Ghassen.ShopMB.dto.OrderDto;
import com.Ghassen.ShopMB.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
    OrderDto convertToDto(Order order);
}
