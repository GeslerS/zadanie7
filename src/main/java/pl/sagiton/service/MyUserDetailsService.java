package pl.sagiton.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.stereotype.Service;
import pl.sagiton.repository.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * Created by szymon on 22.02.16.
 */
@Service
public class MyUserDetailsService implements UserDetailsService{

    @Autowired
    UserService userService;


    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Map<String, String> userMap = userService.getUserDetails(s);

        if(userMap == null) throw new UsernameNotFoundException("User doesn't exist (" + s +")");

        String username = userMap.get("username");
        String password = userMap.get("password");
        List authList = new ArrayList();
        authList.add(new SimpleGrantedAuthority("ROLE_USER"));



       return new User(username, password, authList);
    }
}
