package org.bigjava.merchant.dao;

import org.bigjava.merchant.entity.Merchant;
import org.bigjava.user.entity.User;

/**
 * ���̲���
 * @author Administrator
 *
 */
public interface MerchantDao {
	
	/**
	 * �û�ע�����
	 */
	public void registerMerchant(Merchant merchant, User user);
	
	/**
	 * ͨ��id��ѯ�û���Ϣ
	 */
	public User queryUser(int u_id);
	
	/**
	 * ͨ������id��ѯ�����û�
	 */
	public Merchant queryMerchant(int m_id);
	
	/**
	 * ɾ������
	 */
	public void deleteMerchant(Merchant merchant);
	
	/**
	 * �޸ĵ���
	 */
	public void  updateMerchant(Merchant merchant, Merchant updateMerchant);

}
