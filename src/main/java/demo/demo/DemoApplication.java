package demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DemoApplication {
//test
	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		{
			var context = new ClassPathXmlApplicationContext("config.xml");

			AClass Acont = (AClass) context.getBean("A");
			BClass Bcont = (BClass) context.getBean("B");
			CClass Ccont = (CClass) context.getBean("C");

			System.out.println(Acont.getTextA());
			System.out.println(Bcont.getAValue());
			System.out.println(Ccont.getCValue());
		}
	}
}
