package org.bigjava.entity.orderitem;

import org.bigjava.entity.orders.Orders;
import org.bigjava.entity.product.Product;

/**
 * �������
 * @author Administrator
 *
 */
public class Orderitem {
	
	private int item_id;// �������id
	private int count;// �������Ķ�����Ʒ������
	private double subtotal;// ���������Ʒ��С��
	
	private Orders Orders;// ���һָ�򶩵���
	
	private Product product;// һ��һָ����Ʒ

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public Orders getOrders() {
		return Orders;
	}

	public void setOrders(Orders orders) {
		Orders = orders;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
