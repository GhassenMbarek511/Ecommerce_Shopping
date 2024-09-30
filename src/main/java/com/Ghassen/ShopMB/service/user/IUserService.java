package com.Ghassen.ShopMB.service.user;


import com.Ghassen.ShopMB.dto.UserDto;
import com.Ghassen.ShopMB.model.User;
import com.Ghassen.ShopMB.requestSchema.CreateUserRequest;
import com.Ghassen.ShopMB.requestSchema.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);

    User getAuthenticatedUser();
}
