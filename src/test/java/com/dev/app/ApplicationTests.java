package com.dev.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dev.app.persistence.bean.User;
import com.dev.app.persistence.dao.UserDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private UserDao userDao;
	
	@Test
	public void contextLoads() {
		assertTrue(userDao != null);
	}

    @Test
    public void findAllUsers() {

        List<User> users = userDao.findAllUsers();
        assertNotNull(users);
        assertTrue(!users.isEmpty());
    }

    @Test
    public void findUserById() {
        User user = userDao.findUserById(1);
        assertNotNull(user);
    }

    @Test
    public void createUser() {
        User user = new User();
        user.setId(5);
        user.setName("Roberto");
        user.setSurname("Rossi");
        userDao.insertUser(user);
        
        User newUser = userDao.findUserById(user.getId());
        assertEquals("Roberto", newUser.getName());
        assertEquals("Rossi", newUser.getSurname());
    }

}
