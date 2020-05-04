/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.pw.users;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;


/**
 *
 * @author marta
 */
@ApplicationScoped
public class UserStore {
    private final Map <Long,User> users = new HashMap<>();
   
    @PostConstruct
    public void start(){
        Stream.of(new User (1l,"marta","xxx"), new User (2l,"mario","xxx"), new User (3l,"stefano","xxx")).
                forEach (v->users.put(v.getId(),v));
        }
    
      public Collection <User> all(){
            return users.values();
    }
      
      public User create (User u) {
        return users.putIfAbsent(u.getId(),u);
      }
      
      public void delete (Long id){
          users.remove(id);
      }
    
}
