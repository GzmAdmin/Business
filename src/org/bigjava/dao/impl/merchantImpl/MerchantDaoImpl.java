package org.bigjava.dao.impl.merchantImpl;

import org.bigjava.dao.merchant.MerchantDao;
import org.bigjava.entity.merchant.Merchant;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class MerchantDaoImpl extends HibernateDaoSupport implements MerchantDao {

	// �û�ע�����
	@Override
	public void registerMerchant(Merchant merchant) {
		// TODO Auto-generated method stub
		System.out.println("��ʼע�����");
		
		
	}

}
