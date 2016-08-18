package com.hand.AOP;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.hand.Util.SpringBeanFactory;
import com.hand.tables.MybatisImpl.AddressDaoSp;
import com.hand.tables.entity.Address;
import com.hand.tables.entity.Customer;

public class TransactionTool {
	PlatformTransactionManager ptm;
	TransactionTemplate tt;
	public PlatformTransactionManager getPtm() {
		return ptm;
	}
	public void setPtm(PlatformTransactionManager ptm) {
		this.ptm = ptm;
	}
	public TransactionTemplate getTt() {
		return tt;
	}
	public void setTt(TransactionTemplate tt) {
		this.tt = tt;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void doCustomerAddIdEntityTransaction(final Customer aim){
		tt.execute(new TransactionCallback() {
			public Object doInTransaction(TransactionStatus status){
				try{
					SpringBeanFactory.getBeanFactory().getBean("CustomerDao", CanAddToDb.class).AddIdEntity(aim);
				}catch(Exception e){
					ptm.rollback(status);
					System.out.println("添加Customer失败，执行回滚\n原因："+e.getMessage());
				}
				return null;
			}
		});
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void doCustomerDelByIDTransaction(final int delID){
		tt.execute(new TransactionCallback() {
			public Object doInTransaction(TransactionStatus status){
				try{
					SpringBeanFactory.getBeanFactory().getBean("CustomerDao", CanAddToDb.class).delByID(delID);
				}catch(Exception e){
					ptm.rollback(status);
					System.out.println("删除Customer失败，执行回滚\n原因："+e.getMessage());
				}
				return null;
			}
		});
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Customer doCustomerGetLastCustomerTransaction(){
		return tt.execute(new TransactionCallback() {
			public Customer doInTransaction(TransactionStatus status){
				Customer res=null;
				try{
					res=(Customer) SpringBeanFactory.getBeanFactory().getBean("CustomerDao", CanAddToDb.class).getLastCustomer();
				}catch(Exception e){
					ptm.rollback(status);
					System.out.println("获取LastCustomer失败，执行回滚\n原因："+e.getMessage());
				}
				return res;
			}
		});
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public int doAddressGetCountByIdTransaction(final int addNum){
		return tt.execute(new TransactionCallback() {
			public Integer doInTransaction(TransactionStatus status){
				int res=0;
				try{
					res=SpringBeanFactory.getBeanFactory().getBean("AddressDao", AddressDaoSp.class).getCountById(addNum);
				}catch(Exception e){
					ptm.rollback(status);
					System.out.println("获取AddressCount失败，执行回滚\n原因："+e.getMessage());
				}
				return res;
			}
		});
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Address doAddressGetByIDTransaction(final int addNum){
		return tt.execute(new TransactionCallback() {
			public Address doInTransaction(TransactionStatus status){
				Address res=null;
				try{
					res=(Address) SpringBeanFactory.getBeanFactory().getBean("AddressDao", AddressDaoSp.class).getByID(addNum);
				}catch(Exception e){
					ptm.rollback(status);
					System.out.println("获取LastCustomer失败，执行回滚\n原因："+e.getMessage());
				}
				return res;
			}
		});
	}
}
