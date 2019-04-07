package application;

import java.util.Date;

import atividade.enums.OrderStatus;
import atividades.Order;

public class program {
	
	public static void main(String[] args) {
		
		Order pedido = new Order (1080, new Date() , OrderStatus.PROCESSING);
		
		System.out.println(pedido);
		
		OrderStatus statusDoPedido = OrderStatus.SHIPPED;
		OrderStatus statusDoPedido2 = OrderStatus.valueOf("SHIPPED");
		
		System.out.println(statusDoPedido + " " + statusDoPedido2);
		
	}

}
