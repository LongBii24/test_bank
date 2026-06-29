package com.hailong.identity_service.mapper;

import com.hailong.identity_service.dto.request.PermissionRequest;
import com.hailong.identity_service.dto.response.PermissionResponse;
import com.hailong.identity_service.entity.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);
    PermissionResponse toPermissionResponse(Permission permission);
}
