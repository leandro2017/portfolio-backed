package com.primerApp.SprintBoot.security.rest;

import com.primerApp.SprintBoot.security.model.AuthenticationReq;
import com.primerApp.SprintBoot.security.model.TokenInfo;
import com.primerApp.SprintBoot.security.service.JwtUtilService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("")
public class DemoRest {
  @Autowired
  private AuthenticationManager authenticationManager;

  @Autowired
  UserDetailsService usuarioDetailsService;

  @Autowired
  private JwtUtilService jwtUtilService;

  private static final Logger logger = LoggerFactory.getLogger(DemoRest.class);
@PostMapping("/authenticate")
  public ResponseEntity<TokenInfo> authenticate(@RequestBody AuthenticationReq authenticationReq) {
    logger.info("Autenticando al usuario {}", authenticationReq.getUsuario());

    authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(authenticationReq.getUsuario(),authenticationReq.getClave()));

    final UserDetails userDetails = usuarioDetailsService.loadUserByUsername(
        authenticationReq.getUsuario());

    final String jwt = jwtUtilService.generateToken(userDetails);

    TokenInfo tokenInfo = new TokenInfo(jwt);

    return ResponseEntity.ok(tokenInfo);
  }
}
