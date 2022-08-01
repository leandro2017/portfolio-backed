package com.primerApp.SprintBoot.security.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.Map;


@Service
public class UsuarioDetailsService implements UserDetailsService  {

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Map<String, String> usuarios = Map.of(
        "lceli", "USER",
        "admin", "ADMIN"
    );
    var rol = usuarios.get(username);
    if (rol != null) {
      User.UserBuilder userBuilder = User.withUsername(username);
      // "admin" => [BCrypt] => $2y$10$HvE7WW9qZ99Gx.6oIpHAru9FR3XpUO3AHyrE9jxEpkPWhYBm6GRHG
      String encryptedPassword = "$2y$10$HvE7WW9qZ99Gx.6oIpHAru9FR3XpUO3AHyrE9jxEpkPWhYBm6GRHG";
      userBuilder.password(encryptedPassword).roles(rol);
      return userBuilder.build();
    } else {
      throw new UsernameNotFoundException(username);
    }

  }
}
