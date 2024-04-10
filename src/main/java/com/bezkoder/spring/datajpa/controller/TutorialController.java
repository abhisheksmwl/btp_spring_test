package com.bezkoder.spring.datajpa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class TutorialController {

	private static final Logger LOG = LoggerFactory.getLogger(TutorialController.class);
	@GetMapping("/greeting")
	public String greeting() {
		LOG.info("logger called");
		LOG.error("xxxx-error loges");
		LOG.debug("xxxx- debug logges");
		return "Hi, How are you? logger updated";
	}
	
}
