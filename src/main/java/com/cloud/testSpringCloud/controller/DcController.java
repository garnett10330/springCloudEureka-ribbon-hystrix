package com.cloud.testSpringCloud.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cloud.testSpringCloud.service.ConsumerService;


@RestController
public class DcController {
		 private final Logger logger = Logger.getLogger(DcController.class);

		 @Autowired
		 ConsumerService consumerService;

	     @GetMapping("/consumer")
	     public String dc() {
	    	 String returnStr = consumerService.consumer();
	    	 logger.info(returnStr);
	    	 return returnStr;
	     }

}


