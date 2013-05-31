package com.aver;

import org.apache.camel.CamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunSample {
	public static void main(String[] args) throws Exception {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"camel-server.xml");
		CamelContext context = (CamelContext) appContext
				.getBean("camelContext");
		context.addRoutes(new MessageQueueToFileFolderRoute());
		context.start();
	}
}
