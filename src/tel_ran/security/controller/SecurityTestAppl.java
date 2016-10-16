package tel_ran.security.controller;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import tel_ran.security.impl.SecurConfig;

public class SecurityTestAppl {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		SecurConfig securConfig = (SecurConfig) ctx.getBean("securConfig");
		
		System.out.println(securConfig.checkSecurity("name3", "000003"));
		System.out.println(securConfig.checkSecurity("name4", "000005"));
		System.out.println(securConfig.checkSecurity("name6", "000001"));
		ctx.close();
	}
}
