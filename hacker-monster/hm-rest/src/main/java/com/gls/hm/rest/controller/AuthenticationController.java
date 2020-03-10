package com.gls.hm.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gls.hm.rest.factory.jwt.TokenHelper;
import com.gls.hm.rest.model.AuthenticationRequest;
import com.gls.hm.rest.model.AuthenticationResponse;
import com.gls.hm.user.service.impl.UserDetailService;
import com.gls.hm.user.model.User;

@Controller
public class AuthenticationController
{
	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private TokenHelper tokenHelper;

	@Autowired
	private UserDetailService userDetailsService;

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest authenticationRequest) throws Exception
	{
		Authentication authentication = null;
		try
		{
			authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
		}
		catch (Exception e)
		{
			throw new Exception("Authentication failed: ", e);
		}

		// Inject into security context
		SecurityContextHolder.getContext().setAuthentication(authentication);

		User user = (User) authentication.getPrincipal();

		final String token = tokenHelper.generateToken(user.getUsername());

		return ResponseEntity.ok(new AuthenticationResponse(token, tokenHelper.getExpiresIn()));
	}
}
