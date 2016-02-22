package pl.sagiton.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import java.util.HashMap;
import java.util.Map;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by szymon on 22.02.16.
 */
@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    private UserService userService = new UserService();


    @Test
    public void userExistTest(){
        assertNotNull(userService.getUserDetails("Johny"));
        assertNotNull(userService.getUserDetails("Donna"));
        assertNotNull(userService.getUserDetails("James"));
    }


    @Test
    public void userDoesNotExistTest(){
        assertNull(userService.getUserDetails("Szymon"));
    }

    @Test
    public void goodUserDataTest(){
        Map<String,String> testMap = new HashMap<String, String>();
        testMap.put("username","Johny");
        testMap.put("password","Johny123");
        assertTrue(equalMaps(userService.getUserDetails("Johny"),testMap));
    }




    private boolean equalMaps(Map<String,String>m1, Map<String,String>m2) {
        if (m1.size() != m2.size())
            return false;
        for (String key: m1.keySet())
            if (!m1.get(key).equals(m2.get(key)))
                return false;
        return true;
    }

}
