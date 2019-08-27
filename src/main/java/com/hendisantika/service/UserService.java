package com.hendisantika.service;

import com.hendisantika.model.Employee;
import com.hendisantika.model.User;

import java.util.List;


/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-security-oauth2-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 31/12/17
 * Time: 15.52
 * To change this template use File | Settings | File Templates.
 */

public interface UserService {

    Employee save(Employee user);

    List<Employee> findAll();

   // User delete(long id);
}
