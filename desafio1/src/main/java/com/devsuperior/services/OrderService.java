package com.devsuperior.services;

import org.springframework.stereotype.Service;
import com.devsuperior.entities.Order;

@Service
public class OrderService {
	
	private ShippingService shippingService;
	
	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}

	public double total(Order order) {		
		return order.getBasic() * ( (100 - order.getDiscount() ) / 100 ) + shippingService.shipment(order);		
	}
}
