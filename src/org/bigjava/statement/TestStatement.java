package org.bigjava.statement;

import java.util.Date;
import java.util.Scanner;

import org.bigjava.function.Paging;
import org.bigjava.function.SendMail;
import org.bigjava.merchant.dao.MerchantDao;
import org.bigjava.merchant.entity.Merchant;
import org.bigjava.product.dao.ProductDao;
import org.bigjava.product.entity.Product;
import org.bigjava.user.dao.UserDao;
import org.bigjava.user.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStatement {
	
	public static ApplicationContext app = new ClassPathXmlApplicationContext("app.xml");
	public static UserDao userDao = (UserDao) app.getBean("userDaoImpl");
	public static MerchantDao merchantDao = (MerchantDao) app.getBean("merchantDaoImpl");
	public static ProductDao productDao = (ProductDao) app.getBean("ProductDaoImpl");
	public static Scanner input = new Scanner(System.in);
	
	// �����Ʒ
	public static void addProduct() {
		System.out.println("����Ҫ�����Ʒ�ĵ���id");
		int id = input.nextInt();
		System.out.println("������Ʒ��");
		String product_name = input.next();
		System.out.println("������Ʒ�۸�");
		Double product_price = input.nextDouble();
		System.out.println("������Ʒ�г��۸�");
		Double product_market = input.nextDouble();
		System.out.println("������Ʒ����");
		String p_desc = input.next();
		int is_hot = 0;
		Date p_date = new Date();
		
		Product product = new Product();
		product.setP_name(product_name);
		product.setP_price(product_price);
		product.setMarket(product_market);
		product.setP_desc(p_desc);
		product.setIs_hot(is_hot);
		product.setP_date(p_date);
		
		Merchant merchant = merchantDao.queryMerchant(id);
		merchantDao.addProduct(product, merchant);
	}
	
	// �޸ĵ�����Ϣ
	public static void updateMerchant() {
		System.out.println("�����޸ĵĵ��̵�id");
		int m_id = input.nextInt();
		System.out.println("�����޸ĵĵ�����");
		String m_name = input.next();
		System.out.println("�����޸ĵĵ���Ȩ��");
		int m_is_freeze = input.nextInt();
		
		Merchant merchant = merchantDao.queryMerchant(m_id);
		
		Merchant updateMerchant = new Merchant();
		updateMerchant.setM_name(m_name);
		updateMerchant.setM_is_freeze(m_is_freeze);
		
		merchantDao.updateMerchant(merchant, updateMerchant);
	}
	
	// ɾ��������Ϣ
	public static void deleteMerchant() {
		System.out.println("����ɾ�����̵�id");
		int id = input.nextInt();
		
		Merchant merchant = merchantDao.queryMerchant(id);
		
		merchantDao.deleteMerchant(merchant);
	}
	
	// �޸�����
	public static void updateUserPassword() {
		System.out.println("�޸������û���id");
		int id = input.nextInt();
		System.out.println("�޸ĺ�����");
		String newPassword = input.next();
		
		User user = userDao.query(id);
		
		if (user == null || user.equals("")) {
			System.out.println("û�д��û�");
			return;
		}
		
		userDao.updateUserPassword(newPassword, user);
	}
	
	// ��¼
	public static void loginUser() {
		System.out.println("�û���");
		String username = input.next();
		System.out.println("����");
		String password = input.next();
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		userDao.loginUser(user);
	}
	
	// ע�����
	public static void registerMerchant() {
		System.out.println("����id");
		int u_id = input.nextInt();
		System.out.println("���������");
		String m_name = input.next();
		Date m_time = new Date();
		int m_is_freeze = 1;
		
		Merchant merchant = new Merchant();
		merchant.setM_name(m_name);
		merchant.setM_time(m_time);
		merchant.setM_is_freeze(m_is_freeze);
		
		User user = merchantDao.queryUser(u_id);
		
		merchantDao.registerMerchant(merchant, user);
	}
	
	// ��ѯ�û��Ƿ��Ѵ���
	public static void checkUsername() {
		System.out.println("��ʼУ���û���");
		String username = input.next();
		userDao.checkUsername(username);
	}
	
	// �����ʼ�
	public static void sendRandom() {
		String randomNumber = "��֤��:"+SendMail.randomNumber();//	��֤��
		
		SendMail.sendMail("2868583170@qq.com", randomNumber, "Business�ڶ��β���");//	�����ռ������䡢��֤�롢�ʼ�����
	}
	
	// ע���û�
	public static void register() {
		User user = new User();
		System.out.println("��ʼע��");
		System.out.println("�û���:");
		String username = input.next();
		System.out.println("����:");
		String password = input.next();
		System.out.println("�û���ʵ����:");
		String u_name = input.next();
		System.out.println("�û��Ա�");
		String sex = input.next();
		System.out.println("�û�����:");
		String email = input.next();
		System.out.println("�û��绰����:");
		String phone = input.next();
		user.setUsername(username);
		user.setPassword(password);
		user.setU_name(u_name);
		user.setSex(sex);
		user.setEmail(email);
		user.setPhone(phone);
		
		userDao.registerUser(user);
		System.out.println("ע��ɹ���");
	}
	
	//	�޸����
	public static void update() {
		User user = new User();
		System.out.println("��ʼ�޸�");
		System.out.println("����Ҫ�޸ĵ��û�id");
		int u_id = input.nextInt();
		
		User users = userDao.query(u_id);
		if (users == null) {
			System.out.println("û�д��û�");
			return;
		}
		
		System.out.println("�û���:");
		String username = input.next();
		System.out.println("�û��Ա�");
		String sex = input.next();
		user.setU_id(u_id);
		user.setUsername(username);
		user.setSex(sex);
		
		userDao.updateUser(user, users);
		System.out.println("�޸ĳɹ���");
	}
	
	//ɾ���û�
	public static void delete() {
		System.out.println("��ʼɾ��");
		System.out.println("����Ҫɾ�����û�id");
		int u_id = input.nextInt();
		
		User user = userDao.query(u_id);
		if (user == null) {
			System.out.println("û�д��û�");
			return;
		}
		
		userDao.deleteUser(user);
	}
	
	// ģ����ѯ������
	public static void demendPages() {
		System.out.println("��ʼ��ѯ");
		System.out.println("�����ѯ��username");
		String username = input.next();
		if (username.equals("") || username.equals(null)) {
			System.out.println("û�д��ǳ�");
		}
		
		int totalNumber = userDao.queryPages(username);
		System.out.println("���뵱ǰҳ��");
		int presentPage = input.nextInt();
		Paging paging = new Paging(presentPage, totalNumber);
		
		userDao.limitDemend(username, paging);
		
		
	}

}
