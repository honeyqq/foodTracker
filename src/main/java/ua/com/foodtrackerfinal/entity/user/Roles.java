package ua.com.foodtrackerfinal.entity.user;

import org.springframework.security.core.GrantedAuthority;

public enum Roles implements GrantedAuthority {
    USER,
    ADMIN;

    @Override
    public String getAuthority() {
        return "ROLE_" + name();
    }
}