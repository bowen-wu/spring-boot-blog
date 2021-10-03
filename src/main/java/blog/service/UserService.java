package blog.service;

import blog.entity.User;
import blog.mapper.UserMapper;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.List;

@Component
public class UserService {
    private final UserMapper userMapper;

    @Inject
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> getAllUser() {
        return this.userMapper.getAllUser();
    }
}
