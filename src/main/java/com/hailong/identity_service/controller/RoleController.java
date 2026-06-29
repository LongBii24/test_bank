package com.hailong.identity_service.controller;

import com.hailong.identity_service.dto.request.RoleRequest;
import com.hailong.identity_service.dto.response.ApiResponse;
import com.hailong.identity_service.dto.response.RoleResponse;
import com.hailong.identity_service.service.RoleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
@Slf4j
public class RoleController {
    private final RoleService roleService;

    @PostMapping
    ApiResponse<RoleResponse> create(@RequestBody RoleRequest request){
        return ApiResponse.<RoleResponse>builder()
                .result(roleService.create(request))
                .build();
    }

    @GetMapping
    ApiResponse<List<RoleResponse>> getAll(){
        return ApiResponse.<List<RoleResponse>>builder()
                .result(roleService.getALl())
                .build();
    }

    @DeleteMapping("/{role}")
    ApiResponse<Void> deleted(@PathVariable String role){
        roleService.delete(role);
        return ApiResponse.<Void>builder().build();
    }
}
