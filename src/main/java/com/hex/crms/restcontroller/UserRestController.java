package com.hex.crms.restcontroller;

import java.net.URLDecoder;
import java.util.HashMap;
//CHECKSTYLE:OFF 
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.jose4j.jwk.RsaJsonWebKey;
import org.jose4j.jwk.RsaJwkGenerator;
import org.jose4j.jws.AlgorithmIdentifiers;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.lang.JoseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.hex.crms.model.User;
import com.hex.crms.service.UserService;

@RestController

public class UserRestController {
    private static final Logger log = LoggerFactory.getLogger(UserRestController.class);
    @Autowired
    private UserService UserService;

    @RequestMapping(value = "/account/RegisterUser", method = RequestMethod.POST, headers = "Accept=application/json")
    public User addUser(@RequestBody User u) {

// write your code here.

        return null;
    }

    @RequestMapping(value = "/oauth/token", method = RequestMethod.POST, headers = "Accept=application/json")
    public String loginUser(@RequestBody String login) throws JoseException {
// write your code here.
    return null;

  		
    }
    
}
