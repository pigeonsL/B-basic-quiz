package tw.gtb.quiz;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static Map<Integer, User> userMap = new HashMap<>();
    static {
        userMap.put(1, new User(1L, "KAMIL", 24L, "https://inews.gtimg.com/newsapp_match/0","Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repellendus, non, dolorem, cumque distinctio magni quam expedita velit laborum sunt amet facere tempora ut fuga aliquam ad asperiores voluptatem dolorum! Quasi"));
    }
    public User find(Integer id){
        if(userMap.get(id) != null){
            return userMap.get(id);
        }
        return null;
    }
}
