package com.hailong.identity_service.mapper;

import ch.qos.logback.core.model.ComponentModel;
import com.hailong.identity_service.dto.request.UserCreationRequest;
import com.hailong.identity_service.dto.request.UserUpdateRequest;
import com.hailong.identity_service.dto.response.UserResponse;
import com.hailong.identity_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

//để su dụng cho service
@Mapper(componentModel =  "Spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

//    cái này dùng để ignore hoặc mapp cái này trùng cái kia
//    @Mapping(source = "firstName",target = "lastName")
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
