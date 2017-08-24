package com.opipo.bbcode.converter;

import com.opipo.bbcode.converter.services.BBToHTMLConversionService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@DisplayName("Application Context")
public class BbCodeConverterApplicationTests {

	@Autowired
	private BBToHTMLConversionService bbToHTMLConversionService;

	@Test
	@DisplayName("Application context is correct")
	public void contextLoads() {
		Assertions.assertNotNull(bbToHTMLConversionService);
	}

}
