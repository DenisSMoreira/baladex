/**
 * 
 */
package com.denism.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.denism.core.entity.Clube;
import com.denism.core.entity.Login;
import com.denism.core.entity.User;
import com.denism.service.ClubeService;

/**
 * @author denism
 * 
 */
@Controller
@RequestMapping("/login")
public class LoginController {
 
	/**
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/autentication/{user}/{password}", method = RequestMethod.GET)
	@ResponseBody
	public User autentication(@PathVariable("user") Long user, @PathVariable("password") String password) throws Exception {
		 
		User userAut = new User();
		Login login = new Login();
		login.setCpf(user.toString());
		login.setPassword(password);
		userAut.setLogin(login );
		
		return null;
	}
 

}