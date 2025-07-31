package com.devsuperior.desafio1;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.devsuperior.entities.Order;
import com.devsuperior.services.OrderService;
import com.devsuperior.services.ShippingService;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class Desafio1Application implements CommandLineRunner {
	
	private OrderService orderService;	
	
	
	public Desafio1Application(OrderService orderService) {
		
		this.orderService = orderService;		
	}

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
				
		Scanner scanner = new Scanner(System.in);		
		
		while (true) {
	        System.out.print("Informe o numero do pedido: ");
	        int orderNumber = scanner.nextInt();
	        scanner.nextLine();
	        
	        System.out.print("Informe o valor do pedido: ");
	        double basicValue = scanner.nextDouble();
	        scanner.nextLine();
	        
	        System.out.print("Informe o percentual de desconto: ");
	        double percDesc = scanner.nextDouble();
	        scanner.nextLine();
	        
	        Order order = new Order(orderNumber, basicValue, percDesc);
	        
	        System.out.println("Valor total do pedido: " + orderService.total(order) );
		}
		
	}

}
