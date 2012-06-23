package com.aver;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JMSMesageQueueToFileFolderRoutes {
	public static void main(String[] args) throws Exception {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"camel-server.xml");
		CamelContext context = (CamelContext) appContext
				.getBean("camelContext");

		context.addRoutes(new RouteBuilder() {
			public void configure() {
				from("jms:topic:customer").choice().when()
						.xpath("/customer[type='P']")
						.to("file:/Users/mathew/temp/cameloutput/preferred")
						.otherwise()
						.to("file:/Users/mathew/temp/cameloutput/regular")
						.end();
			}
		});
		context.start();
	}
}
