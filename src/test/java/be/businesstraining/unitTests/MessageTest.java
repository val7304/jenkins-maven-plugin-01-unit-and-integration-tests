package be.businesstraining.unitTests;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

import be.businesstraining.domain.Message;

public class MessageTest {

	private Message message = new Message(); //object under test

	@Test
	public void saysHelloTest(){
		//ARRANGE
		String expected = "Hello World";
		//ACT
		String actual = message.sayHello();
		//Assert value==expected
		assertThat(actual, containsString(expected));
	}

}
