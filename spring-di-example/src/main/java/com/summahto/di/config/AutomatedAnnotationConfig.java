package com.summahto.di.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/* 	this has some major advantages over basic java configuration
	1. the required configuration is much more concise.
	2. The annotations are applied directly to the classes, not in a @Configuration class.
	3. We do not need to create a new bean arbitrarily for every new @Component class we create.
*/
@Configuration
@ComponentScan("com.summahto.di.domain")
public class AutomatedAnnotationConfig {
	
}
