
package com.primerApp.SprintBoot.service;

import com.primerApp.SprintBoot.model.User;
import java.util.List;

/**
 *
 * @author Leandro
 */
 
public interface IUserService 
{
    public List<User> getUser();
    
    public  void newUser(User user);
    public void deleteUser(Long id);
    public User getUser(Long id);
    public void UpdateUser(User user);
}
