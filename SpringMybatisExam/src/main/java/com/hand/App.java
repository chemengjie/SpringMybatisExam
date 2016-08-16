package com.hand;

import java.sql.Date;
import java.util.Scanner;

import com.hand.AOP.TransactionTool;
import com.hand.Util.SpringBeanFactory;
import com.sakila.Entity.Address;
import com.sakila.Entity.Customer;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		TransactionTool tt=SpringBeanFactory.getBeanFactory().getBean("transactionTool",TransactionTool.class);
		Customer aim = new Customer();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入 FirstName(first_name):");
		String input = sc.nextLine();
		aim.setFirst_name(input);
		System.out.println("请输入 LastName(last_name):");
		input = sc.nextLine();
		aim.setLast_name(input);
		System.out.println("请输入 Email(email):");
		input = sc.nextLine();
		aim.setEmail(input);
		boolean notRightAddress = true;
		int addNum = 0;
		while (notRightAddress) {
			try {
				System.out.println("请输入 Address ID:");
				input = sc.nextLine();
				addNum = Integer.parseInt(input);
				if (tt.doAddressGetCountByIdTransaction(addNum) > 0) {
					notRightAddress = false;
				} else {
					System.out.println("你输入的 Address	ID 不存在,请重新输入:");
				}
			} catch (NumberFormatException ne) {
				System.out.println("数字格式不正确");
			}
		}
		aim.setAddress_id(addNum);
		aim.setStore_id(1);
		Date now = new Date(new java.util.Date().getTime());
		aim.setCreate_date(now);
		aim.setLast_update(now);
		aim.setActive(true);
		
		tt.doCustomerAddIdEntityTransaction(aim);
		aim=tt.doCustomerGetLastCustomerTransaction();
		System.out.println("已经保存的数据如下:");
		System.out.println("ID:" + aim.getID());
		System.out.println("FirstName:" + aim.getFirst_name());
		System.out.println("LastName:" + aim.getLast_name());
		System.out.println("Email:" + aim.getEmail());
		System.out.print("Address:");

		addNum = aim.getAddress_id();
		Address add = null;
		add = tt.doAddressGetByIDTransaction(addNum);
		System.out.println(add.getAddress());
		notRightAddress = true;
		while (notRightAddress) {
			System.out.println("请输入要删除的 Customer 的 ID:");
			input = sc.nextLine();
			try {
				addNum = Integer.parseInt(input);
				notRightAddress = false;
			} catch (NumberFormatException ne) {
				System.out.println("数字格式不正确");
			}
		}
		tt.doCustomerDelByIDTransaction(addNum);
		System.out.println("你输入的 ID 为" + addNum + "的 Customer 已经 删除.");
	}
}
