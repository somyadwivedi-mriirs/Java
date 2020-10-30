package hsbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Customer c1 = (Customer) ctx.getBean("cust1");
		System.out.println(c1);
		
		
		
	}

}
