package org.bigjava.user.biz;

import java.util.List;

import org.bigjava.function.Paging;
import org.bigjava.user.entity.User;

/**
 * �û�����
 * @author Mr.Man
 *
 */
public interface UserBiz {
	
	/**
	 * �û�ע��
	 */
	public void registerUser(User user);
	
	/**
	 * �޸��û���Ϣ
	 */
	public void updateUser(User user,User users);
	
	/**
	 * ͨ��ID��ѯ�û�
	 */
	public User query(int id);
	
	/**
	 * ͨ��IDɾ���û�
	 */
	public void deleteUser(User user);
	
	/**
	 * ����Աͨ��ģ����ҳ��ѯ�û�
	 */
	public List<User> limitDemend(String username, Paging page);
	
	/**
	 * ����Աͨ��ģ����ѯ��ҳ��
	 */
	public  int queryPages(String username);
	
	/**
	 * �����û���
	 */
	public boolean checkUsername(String username);
	
}
