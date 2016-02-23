package pl.sagiton.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.api.mockito.PowerMockito;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import pl.sagiton.repository.UserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by szymon on 22.02.16.
 */
@RunWith(MockitoJUnitRunner.class)
public class MyUserDetailsServiceTest {

    @Mock
    UserService userService = mock(UserService.class);

    @InjectMocks
    private MyUserDetailsService myUserDetailsService = new MyUserDetailsService();

    private  Map<String, String> userMap = new HashMap<String, String>();


    @Test(expected = UsernameNotFoundException.class)
    public void usernameNotFoundException(){
        when(userService.getUserDetails(anyString())).thenReturn(null);
        myUserDetailsService.loadUserByUsername("Szymon");
    }

    @Test
    public void userDetailsTest(){

        userMap.put("username", "Johny");
        userMap.put("password", "Johny123");

      when(userService.getUserDetails(anyString())).thenReturn(userMap);
      UserDetails user = myUserDetailsService.loadUserByUsername("Johny");
      assertEquals(user.getUsername(), "Johny");
      assertEquals(user.getPassword(), "Johny123");

    }
}
