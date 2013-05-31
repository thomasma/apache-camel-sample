package com.aver;

import org.apache.camel.builder.RouteBuilder;

public class MessageQueueToFileFolderRoute extends RouteBuilder {
	@Override
	public void configure() throws Exception {
		from("jms:topic:customer").choice().when().xpath("/customer[type='P']")
				.to("file:/Users/mathew/temp/cameloutput/preferred")
				.otherwise().to("file:/Users/mathew/temp/cameloutput/regular")
				.end();
	}

}
