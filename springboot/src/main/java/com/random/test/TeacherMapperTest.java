package com.random.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.random.controller.TeacherController;

/**
 * @description 使用Spring MVC来实现一组对Teacher对象操作的RESTful API.
 * @author random
 * @version 1.0
 * @date 2018年7月30日
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MockServletContext.class)
@WebAppConfiguration
public class TeacherMapperTest {

	private MockMvc mvc;

	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.standaloneSetup(
				new TeacherController()).build();
	}

	@Test
	public void testUserController() throws Exception {
		// 测试UserController
		RequestBuilder request = null;

		// 1、get查一下teacher列表，应该为空
		request = get("/teachers/");
		mvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("[]")));

		// 2、post提交一个teacher
		request = post("/teachers/")
				.param("id", "8")
				.param("name", "测试大师")
				.param("age", "20");
		mvc.perform(request)
		//		.andDo(MockMvcResultHandlers.print())
				.andExpect(content().string(equalTo("success")));

		// 3、get获取teacher列表，应该有刚才插入的数据
		request = get("/teachers/");
		mvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("[{\"id\":8,\"name\":\"测试大师\",\"age\":20}]")));

		// 4、put修改id为1的teacher
		request = put("/teachers/8")
				.param("name", "测试终极大师")
				.param("age", "30");
		mvc.perform(request)
				.andExpect(content().string(equalTo("success")));

		// 5、get一个id为1的teacher
		request = get("/teachers/8");
		mvc.perform(request)
				.andExpect(content().string(equalTo("{\"id\":8,\"name\":\"测试终极大师\",\"age\":30}")));

		// 6、del删除id为1的teacher
		request = delete("/teachers/8");
		mvc.perform(request)
				.andExpect(content().string(equalTo("success")));

		// 7、get查一下teacher列表，应该为空
		request = get("/teachers/");
		mvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("[]")));

	}

}