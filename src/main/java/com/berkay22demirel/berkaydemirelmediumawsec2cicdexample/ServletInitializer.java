package com.berkay22demirel.berkaydemirelmediumawsec2cicdexample;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BerkayDemirelMediumAwsEc2CiCdExampleApplication.class);
	}

}
