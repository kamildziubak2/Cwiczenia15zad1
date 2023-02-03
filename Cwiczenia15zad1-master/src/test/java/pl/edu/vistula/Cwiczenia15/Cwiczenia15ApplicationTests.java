package pl.edu.vistula.Cwiczenia15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvcBuilder;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class Cwiczenia15ApplicationTests {
	@Autowired
	MockMvc mockMvc;

	@Test
	void contextLoads(){

	}


	@Test
	void helloTest() throws Exception{
		this.mockMvc.perform(get("/"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello Vistula, in my first Spring controller")));
	}

	@Test
	void greetingTest() throws Exception{
		this.mockMvc.perform(get("/greeting"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(content().string(containsString("Lorem ipsum")));
	}

}