package org.bigjava.addr.entity;

import org.bigjava.user.entity.User;

/**
 * �ջ���ַ��
 * @author Administrator
 *
 */
public class Addr {
	
	private int a_id;// �ջ���ַid
	private String address;// �ջ���ַ
	
	private User user;// ָ���û���

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
