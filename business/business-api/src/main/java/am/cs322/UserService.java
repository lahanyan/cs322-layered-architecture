package am.cs322;

import am.cs322.model.UserDTO;

import java.util.List;

public interface UserService {

    public UserDTO createUser(String firstName, String lastName);

    public List<UserDTO>getAllUsers();
}