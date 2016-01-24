package com.echounion.mc;

import com.echounion.mc.modules.sys.entity.User;
import com.echounion.mc.modules.sys.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootDemoApplication.class)
@WebAppConfiguration
public class SpringBootDemoApplicationTests {

	@Resource
	private UserService userService;

	@Test
	public void contextLoads() {
		User user = userService.findByUsername("admin");
		System.out.println("");
	}

}
