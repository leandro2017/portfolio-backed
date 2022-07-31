
package com.primerApp.SprintBoot.service;

import com.primerApp.SprintBoot.model.User;
import com.primerApp.SprintBoot.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Leandro
 */
@Service
public class UserService implements IUserService
{
    @Autowired
    public UserRepository userRepository;
    
    @Override
    public List<User> getUser() {
      return userRepository.findAll();
    }

    @Override
    public void newUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getUser(Long id) {
        return  userRepository.findById(id).orElse(null);
    }

    @Override
    public void UpdateUser(User user) 
    {
        userRepository.save(user);
    }
    
}
