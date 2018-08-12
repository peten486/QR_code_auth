package org.peten.web;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class EchoController {
	private static Logger logger = LoggerFactory.getLogger(EchoHandler.class);
	
	@RequestMapping(value = "/EchoView.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome EchoView!");
		
		return "websocket-echo";
	}
	
}
