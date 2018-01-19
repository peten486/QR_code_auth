package org.peten.Login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class LoginController {
	
	@RequestMapping(value = "/login.do")
    @ResponseBody
	public void login(){
		System.out.println("login.?");
	}
}
