package leo.spring.mvn.service;

import java.util.List;
import java.util.Optional;

import leo.spring.mvn.entity.UserEntity;

public interface UserService {

    void saveUser(UserEntity userEntity);

    Optional<UserEntity> getUser(String email);

    void updateUserName(String email, String newName);

    List<UserEntity> getUserList();

    void deleteUser(String email);

}
