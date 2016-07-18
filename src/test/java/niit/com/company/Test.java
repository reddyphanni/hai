package niit.com.company;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext a=new AnnotationConfigApplicationContext();
		a.scan("niit.com");
		a.refresh();
		a.getBean("shopping");
		System.out.println("i m in");
		
		
	}

}
