// package am.cs322;

// import am.cs322.model.User;
// import am.cs322.model.UserDTO;
// import org.springframework.stereotype.Service;

// @Service
// public class UserServiceImpl implements UserService {

//     private final UserRepository userRepository;

//     public UserServiceImpl(UserRepository userRepository) {
//         this.userRepository = userRepository;
//     }


//     @Override
//     public UserDTO createUser(String firstName, String lastName) {
//         User createdUser = userRepository.save(new User(firstName, lastName));
//         return new UserDTO(createdUser.getFirstName() + " " + createdUser.getLastName());
//     }
// }


package am.cs322;
import am.cs322.userrepository.UserRepository;
import am.cs322.model.UserDTO;
import am.cs322.model.User;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport; 
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDTO createUser(String firstName, String lastName) {
        User createdUser = userRepository.save(new User(firstName, lastName));
        return new UserDTO(createdUser.getFirstName() + " " + createdUser.getLastName() + " " + createdUser.getId());
    }

    public List<UserDTO>getAllUsers() { 
       Iterable<User> usersIterable = userRepository.findAll();
       List<User> usersList = StreamSupport.stream(usersIterable.spliterator(), false)
                                    .collect(Collectors.toList());
        return usersList.stream()
                .map(user -> {
                    return new UserDTO(user.getFirstName() +" " +user.getLastName() + " " + user.getId());
                }).collect(Collectors.toList());
    }
}