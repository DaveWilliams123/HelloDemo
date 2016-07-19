import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class HelloTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		HelloWorld Hi =  new HelloWorld();
		assertEquals("Hello", Hi.Hello());
	}

}
