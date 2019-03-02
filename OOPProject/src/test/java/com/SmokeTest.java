package com;

import org.testng.annotations.Test;

public class SmokeTest
{
	@Test
	public void test1() {
//		Animal a=new Cow();
//		Animal b=new Dog();
//		a.eat();
//		b.eat();
//		
//		Car c=new BMW();
//		c.engine();
		
		Car[] c1=new Car[2];
		c1[0]=new Tesla();
		c1[1]=new BMW();
		for(int i=0;i<c1.length;i++)
		{
			c1[i].engine();
			c1[i].move();
		}
		Tesla t=new Tesla();
		LoginCredential l=new LoginCredential();
		l.setUserId("user1");
		l.setPass("s12345");
		l.loginValidation();
		
		LoginCredential l1=new LoginCredential();
		l1.setUserId("user2");
		l1.setPass("s1234545");
		l1.loginValidation();
		
	}

}
