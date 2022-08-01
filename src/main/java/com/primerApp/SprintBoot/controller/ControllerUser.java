
package com.primerApp.SprintBoot.controller;


import com.primerApp.SprintBoot.model.User;
import com.primerApp.SprintBoot.service.IUserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Leandro
 */
@RestController
@CrossOrigin (origins = "*")
public class ControllerUser 
{
      @Autowired
      private IUserService iuserService;
    
    
    @GetMapping("/get/user")
      public List<User> getUser()
      {
          return iuserService.getUser();
      }
      
      @PostMapping("/new/user")
      public void newUser(@RequestBody User user)
      {
          iuserService.newUser(user);
      }
      
      @DeleteMapping("/delete/{id}")
      public void deleteUser(@PathVariable Long id)
      {
          iuserService.deleteUser(id);
      }
  
                   @PutMapping("/update/{id}")
                   public User updateUser(@PathVariable Long id,@RequestBody User user){

		User usuario = iuserService.getUser(id);
		
                
                
                usuario.setName(user.getName());
		usuario.setSurname(user.getSurname());
		usuario.setAge(user.getAge());
		usuario.setPhone(user.getPhone());
		usuario.setResidence(user.getResidence());
		usuario.setMail(user.getMail());
		usuario.setDescription(user.getDescription());
		usuario.setTitle(user.getTitle());
		usuario.setUrlphoto(user.getUrlphoto());

		iuserService.newUser(usuario);
		return usuario;
      
            }
} 
