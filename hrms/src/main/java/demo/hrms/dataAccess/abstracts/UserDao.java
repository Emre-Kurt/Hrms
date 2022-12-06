package demo.hrms.dataAccess.abstracts;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User,Integer> {

	List<User> findAllByEmail(String email);
	
}
