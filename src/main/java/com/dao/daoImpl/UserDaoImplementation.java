package com.dao.daoImpl;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import model.OepUser;
import util.MyUtil;

public class UserDaoImplementation implements UserDao {
	private Session session;
	@Override
	public void createUser(OepUser user) {
		// TODO Auto-generated method stub
		this.session=MyUtil.getSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}
/*	
	@Override
	public String toString(){
		User user = null;
		return "id"+ user.getUserId();
	}*/
	
	
	@Override
	public void retrieve() {
		// TODO Auto-generated method stub
		session=MyUtil.getSession();
		session.beginTransaction();
		Query qu = session.createQuery("from OepUser");
		List<OepUser> list = qu.list();
		System.out.println(list.size());
		for(OepUser user:list){
			System.out.println(user.getUserEmail());
		}
		
	}		
	/*	
		//List<User> list = new List<User>();
		List<User> u=null;
		Transaction tx = null;
	      try{
	    	 session.getSessionFactory(); 
	         tx = session.beginTransaction();
	         u = session.createQuery("FROM USERS").list(); 
	         for (Iterator itr = u.iterator(); itr.hasNext();){
	            User user = (User) itr.next(); 
	            System.out.print("address: " + user.getUserAddress());
	            u.add(user);
	         }
	         session.getTransaction().commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	      return u;
	}*/
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		OepUser user = new OepUser();
		
		user.setUserId(6);
		user.setUserFname("a6");
		user.setUsername("a5");
		user.setUserPassword("fss");
		user.setUserEmail("ahh@gmail.com");
		BigDecimal bg;
		Double d =  new Double("245");
		bg = BigDecimal.valueOf(d);
		user.setUserMobileNo(bg);
		user.setUserRole("NUSER");
		user.setUserStatus("ACTIVE");
		
		
		createUser(user);
	}
	@Override
	public void delete(long userId) {
		// TODO Auto-generated method stub
		this.session=MyUtil.getSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         OepUser user = (OepUser)session.get(OepUser.class, userId); 
	         session.delete(user); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
		
	}
	@Override
	public void update(long userId, String userType) {
		// TODO Auto-generated method stub
		this.session=MyUtil.getSession();
		Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         
	         OepUser user = (OepUser)session.get(OepUser.class, userId); 
	         
	         user.setUserRole("ADMIN");
	         
			 session.update(user);
			 
	         tx.commit();
	         
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	}
}

