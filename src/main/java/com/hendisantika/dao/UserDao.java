package com.hendisantika.dao;

import com.hendisantika.model.Employee;
import com.hendisantika.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-security-oauth2-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 31/12/17
 * Time: 15.48
 * To change this template use File | Settings | File Templates.
 */


@Repository
public interface UserDao extends CrudRepository<Employee, Long> {
    Employee findByUsername(String username);


   // void delete(long id);
}
