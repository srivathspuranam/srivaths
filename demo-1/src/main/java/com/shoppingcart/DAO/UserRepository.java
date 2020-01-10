package com.shoppingcart.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shoppingportal.model.UserBean;

@Repository
public interface UserRepository extends JpaRepository<UserBean, String> {

	@Query("from UserBean ub where ub.name=? and ub.password=?")
	UserBean findByNameAndPassword(String name, String password);

	List<UserBean> findByMobilenumber(String mobilenumber);

	@Query("delete from UserBean ub where ub.name=?")
	void deleteByName(String name);

}
