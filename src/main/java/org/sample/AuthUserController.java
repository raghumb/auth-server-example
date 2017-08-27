package org.sample;

import java.security.Principal;

import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST endpoint to be used by other micro-services using SSO to validate the
 * authentication of the logged in user.
 * 

 *
 */
@RestController
@EnableResourceServer
@RequestMapping("/")
public class AuthUserController {
	
	/**
	 * Return the principal identifying the logged in user
	 * @param user
	 * @return
	 */
	@RequestMapping("/user")
	public Principal getCurrentLoggedInUser(Principal user) {
		return user;
	}
}
