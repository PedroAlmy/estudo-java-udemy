package atividades;

import java.util.Date;

import atividade.enums.OrderStatus;

public class Order {

	private long idOrder;
	private Date momentOrder;
	private OrderStatus statusOrder;

	public Order() {

	}

	public Order(long idOrder, Date momentOrder, OrderStatus statusOrder) {
		super();
		this.idOrder = idOrder;
		this.momentOrder = momentOrder;
		this.statusOrder = statusOrder;
	}

	public long getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(long idOrder) {
		this.idOrder = idOrder;
	}

	public Date getMomentOrder() {
		return momentOrder;
	}

	public void setMomentOrder(Date momentOrder) {
		this.momentOrder = momentOrder;
	}

	public OrderStatus getStatusOrder() {
		return statusOrder;
	}

	public void setStatusOrder(OrderStatus statusOrder) {
		this.statusOrder = statusOrder;
	}

	@Override
	public String toString() {
		return "Order [idOrder = " + idOrder + ", momentOrder = " + momentOrder + ", statusOrder = " + statusOrder + " ]";
	}

}
