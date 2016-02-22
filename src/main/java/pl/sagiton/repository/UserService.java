package pl.sagiton.repository;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by szymon on 22.02.16.
 */

@Service("userService")
public class UserService {


    public Map<String, String> getUserDetails(String username){

        Map<String, String> userMap = new HashMap<String, String>();

        if(!username.equals("Johny") && !username.equals("Donna") && !username.equals("James")) return null;

        userMap.put("username", username);
        userMap.put("password", username + "123");

        return userMap;
    }
}
