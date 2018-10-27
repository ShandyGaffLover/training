package org.shandygafflover.sample001;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:context.xml"})
public class HelloWorldTest {

	@Autowired
	private Hello hello;

	@Test
	public void testSayHello() {
		Assert.assertThat(hello.sayHello(), is(equalTo("Hello, World!")));

	}

}
