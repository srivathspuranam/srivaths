package com.pro.cont;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.pro.conn.connection;
import com.pro.user.Users;

public class TaskService {
	public static String setStatus(String name, String tstatus) {
		String result = null;
		try {
			SessionFactory sessionFactory = connection.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Query query = session.createQuery("update Users set Tstatus = :Tstatus where name = :name");
			query.setParameter("tstatus", tstatus);
			query.setParameter("name", name);
			int i = query.executeUpdate();
			transaction.commit();
			if (i > 0) {
				result = "success";
			} else {
				result = "fail";
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = "Server Busy";
		}
		return result;
	}

	public static String setTask(int id, String task, String assigned) {
		String result = null;
		try {
			SessionFactory sessionFactory = connection.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Query query = session
					.createQuery("update Users set task = :task , assigned = :assigned where id = :id");
			query.setParameter("task", task);
			query.setParameter("assigned", assigned);
			query.setParameter("id", id);
			int i = query.executeUpdate();
			transaction.commit();
			if (i > 0) {
				result = "success";
			} else {
				result = "fail";
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = "Server Busy";
		}
		return result;
	}

	public static Users getStatus(String name) {
		Users result = null;
		try {
			SessionFactory sessionFactory = connection.getSessionFactory();
			Session session = sessionFactory.openSession();
			Query query = session.createQuery("from Users where assigned = :name");
			query.setParameter("name", name);
			result = (Users) query.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
