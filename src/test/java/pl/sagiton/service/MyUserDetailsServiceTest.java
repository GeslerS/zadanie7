package pl.sagiton.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.api.mockito.PowerMockito;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import pl.sagiton.repository.UserService;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

/**
 * Created by szymon on 22.02.16.
 */
@RunWith(MockitoJUnitRunner.class)
public class MyUserDetailsServiceTest {

    @InjectMocks
    UserService userService = new UserService();

    private MyUserDetailsService myUserDetailsService = new MyUserDetailsService();


    @Test(expected = UsernameNotFoundException.class)
    public void UsernameNotFoundException(){
        when(userService.getUserDetails(anyString())).thenReturn(null);
        myUserDetailsService.loadUserByUsername("Szymon");
    }


}
