package org.bigjava.dao.impl.userImpl;

import java.sql.SQLException;
import java.util.List;

import org.bigjava.dao.user.UserDao;
import org.bigjava.entity.user.User;
import org.bigjava.function.Paging;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	// ע���û�
	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("dao��ʼע��");
		user.setRoot(1);// Ĭ���û�Ȩ��Ϊ1(��ͨ�û�)
		user.setU_is_freeze(1);//	Ĭ���û�Ϊ�ⶳ״̬(�ⶳ״̬)
		this.getHibernateTemplate().save(user);//	user���������ݿ���
	}

	// �޸�
	@Override
	public void updateUser(User user, User users) {
		// TODO Auto-generated method stub
		System.out.println("dao��ʼ�޸�");
		users.setUsername(user.getUsername());// ���û�������User��
		users.setSex(user.getSex());//	���Ա����User��
		this.getHibernateTemplate().update(users);//	��user�е�ֵ�Ա����ݿ��е�ֵ�����޸�
	}

	// ͨ��id��ѯ�û�
	@Override
	public User demend(int id) {
		// TODO Auto-generated method stub
		System.out.println("daoͨ��id��ѯ");
		User user = this.getHibernateTemplate().get(User.class, id);//	ͨ��id��ѯ�û�
		return user;
	}

	// ͨ��idɾ���û�
	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		System.out.println("daoͨ��idɾ���û�");
		
		this.getHibernateTemplate().delete(user);// ɾ�����ݿ�����userƥ�����Ϣ
	}

	// ����Աͨ��ģ����ҳ��ѯ�û�
	@Override
	public List<User> limitDemend(final String username, final Paging page) {
		// TODO Auto-generated method stub
		System.out.println("dao����Աͨ��ģ����ҳ��ѯ�û�");
		List<User> list = this.getHibernateTemplate().executeFind(new HibernateCallback() {
				@Override
				public Object doInHibernate(Session session) throws HibernateException, 
						SQLException {// ͨ��hibernateTemplate�ص�sessionFactory����
					// TODO Auto-generated method stub
					Query query = session.createQuery("from User where username like ?").setString(0, username+"%");// ģ����ѯ
					query.setFirstResult(page.getStart());// ��ҳ��ѯ����һ����ʼ��
					query.setMaxResults(page.getPagesize());// ��ҳ��ѯ�������
					
					return query.list();// ����ѯ����ֵת��Ϊ��������
				}
			}
		);
		System.out.println("ģ����ҳ��ѯ��������"+list);
		return list;
	}

	// ����Աͨ��ģ����ҳ��ѯ��ҳ��
	@Override
	public int demendPages(String username) {
		// TODO Auto-generated method stub
		System.out.println("����Աͨ��ģ����ҳ��ѯ��ҳ��");
		int totalNumber = 0;
		List<Long> list = this.getHibernateTemplate().find("select count(*) from User where username like ?",username+"%");// ģ����ѯһ���ж���������
		if (list != null && list.size() != 0) {
			totalNumber = list.get(0).intValue();//��ȡ��ѯ������������
		}
		System.out.println("��ѯ����������" + totalNumber);
		return totalNumber;
	}

	// У���û����Ƿ��Ѵ���
	@Override
	public boolean checkUsername(String username) {
		// TODO Auto-generated method stub
		System.out.println("��ʼУ��");
		List<User> list = this.getHibernateTemplate().find("from User where username = ?", username);// ͨ���û�����ѯ�û�
		if (list == null || list.size() == 0) {// ��û�в�ѯ���û�ʱ
			System.out.println("�û�������");
			return false;// ����false
		}
		System.out.println("�û����Ѵ���");
		return true;// ��ѯ���û�ʱ����true
	}
	
}
