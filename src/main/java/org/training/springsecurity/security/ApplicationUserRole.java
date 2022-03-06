package org.training.springsecurity.security;

import com.google.common.collect.Sets;

import java.util.Set;

public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    TRAINEE(Sets.newHashSet(ApplicationUserPermission.STUDENT_READ,ApplicationUserPermission.COURSE_READ)),
    ADMIN(Sets.newHashSet(ApplicationUserPermission.COURSE_READ,ApplicationUserPermission.COURSE_WRITE,ApplicationUserPermission.STUDENT_READ));

    private final Set<ApplicationUserPermission> permission;


    ApplicationUserRole(Set<ApplicationUserPermission> permission) {
        this.permission = permission;
    }
}
