package com.dev.test;

import static org.junit.Assert.*;
import org.junit.Test;

import com.dev.demo.Demo;

public class TestDemo {

	@Test
	public void testMain() {
		Demo dev = new Demo();
		System.out.println("test print");
		assertNotNull(dev);	
	}

}
