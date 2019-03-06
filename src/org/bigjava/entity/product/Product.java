package org.bigjava.entity.product;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.bigjava.entity.categorysecond.CategorySecond;
import org.bigjava.entity.comment.Comment;
import org.bigjava.entity.orderitem.Orderitem;

/**
 * ��Ʒ��
 * @author Administrator
 *
 */
public class Product {
	
	private int p_id;// ��Ʒid
	private String p_name;// ��Ʒ��
	private double p_price;// ��Ʒ�۸�
	private double market;// �г��۸�
	private String p_image;// ��ƷͼƬ
	private String p_desc;// ��Ʒ����
	private int sale_volume;// ��Ʒ������
	private int is_hot;// �Ƿ�Ϊ������Ʒ
	private Date p_date;// ��Ʒ�ϼ�ʱ��

	private CategorySecond categorySecond;// ָ����һ������
	
	private Orderitem orderItem;// һ��һָ�򶩵���
	
	private Set<Comment> setCom = new HashSet<Comment>();// ָ��Comment��
	
	public Set<Comment> getSetCom() {
		return setCom;
	}

	public void setSetCom(Set<Comment> setCom) {
		this.setCom = setCom;
	}

	public Orderitem getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(Orderitem orderItem) {
		this.orderItem = orderItem;
	}

	public void setP_price(double p_price) {
		this.p_price = p_price;
	}

	public void setMarket(double market) {
		this.market = market;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public Double getP_price() {
		return p_price;
	}

	public void setP_price(Double p_price) {
		this.p_price = p_price;
	}

	public Double getMarket() {
		return market;
	}

	public void setMarket(Double market) {
		this.market = market;
	}

	public String getP_image() {
		return p_image;
	}

	public void setP_image(String p_image) {
		this.p_image = p_image;
	}

	public String getP_desc() {
		return p_desc;
	}

	public void setP_desc(String p_desc) {
		this.p_desc = p_desc;
	}

	public int getSale_volume() {
		return sale_volume;
	}

	public void setSale_volume(int sale_volume) {
		this.sale_volume = sale_volume;
	}

	public int getIs_hot() {
		return is_hot;
	}

	public void setIs_hot(int is_hot) {
		this.is_hot = is_hot;
	}

	public Date getP_date() {
		return p_date;
	}

	public void setP_date(Date p_date) {
		this.p_date = p_date;
	}

	public CategorySecond getCategorySecond() {
		return categorySecond;
	}

	public void setCategorySecond(CategorySecond categorySecond) {
		this.categorySecond = categorySecond;
	}
	
}
