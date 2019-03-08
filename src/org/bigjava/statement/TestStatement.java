package org.bigjava.statement;

import java.util.Scanner;

import org.bigjava.function.Paging;
import org.bigjava.function.SendMail;
import org.bigjava.user.dao.UserDao;
import org.bigjava.user.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStatement {
	
	public static ApplicationContext app = new ClassPathXmlApplicationContext("app.xml");
	public static UserDao userDao = (UserDao) app.getBean("userDaoImpl");
	public static Scanner input = new Scanner(System.in);
	
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
