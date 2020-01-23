package com.shoppingcart.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shoppingportal.model.UserBean;

@Repository
public interface UserRepository extends JpaRepository<UserBean, String> {

	@Query("from UserBean ub where ub.name=?1 and ub.password=?2")
	UserBean findByNameAndPassword(String name, String password);

	List<UserBean> findByMobilenumber(Long mobilenumber);
	

	@Query("delete from UserBean ub where ub.name=?1")
	void deleteByName(String name);

	List<UserBean> findByName(String name);

	@Query("from UserBean ub where ub.address=?1")
	UserBean getAddress(String address);

}
