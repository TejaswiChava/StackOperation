package StackTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import stack.StackOperation;

public class StackOperationTest {
	StackOperation stackoperation;

	@Before
	public void setUp() throws Exception {
		stackoperation=new StackOperation();
	}

	@Test
	public void pushtest() {
		assertEquals(true, stackoperation.push(10));
		assertEquals(true, stackoperation.push("Teju"));
		assertEquals(true, stackoperation.push(5.05));
		assertEquals(true, stackoperation.push(800.0f));
		assertEquals(true, stackoperation.push('s'));	
	}
	@Test
	public void poptest() {
		stackoperation.push(9);
		stackoperation.push(6);
		stackoperation.push(7);
		stackoperation.push(2);
		stackoperation.pop(2);
		stackoperation.pop(3);
		assertEquals(true, stackoperation.pop(2));
		
		
	}
	@Test
	public void sizetest()
	{
		stackoperation.push(9);
		stackoperation.push(6);
		stackoperation.push(7);
		stackoperation.push(2);
		assertEquals(4, stackoperation.Size());
	}
	@Test
	public void isEmptytest()
	{
		assertEquals(true, stackoperation.isEmpty());
	}
	
}
