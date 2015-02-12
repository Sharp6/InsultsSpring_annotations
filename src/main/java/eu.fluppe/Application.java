package eu.fluppe;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import eu.fluppe.services.InsultService;

public class Application {
	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		InsultService insultService = (InsultService) appContext.getBean("insultService",InsultService.class);
		System.out.println(insultService.findAll().get(0).getInsultString());

	}
}