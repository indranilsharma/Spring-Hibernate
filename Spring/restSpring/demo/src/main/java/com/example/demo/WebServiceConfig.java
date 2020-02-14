package com.example.demo;


import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebServiceConfig {

    
	private Bus bus;

	@Bean
	public Endpoint endpoint() {
		
		Endpoint endpoint = (Endpoint) new EndpointImpl(bus, new HelloWs());
		endpoint.publish("/hello");
		return endpoint;
	}
}
