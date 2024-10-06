package com.example.loginSignup.Model;

import jakarta.persistence.Entity;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;


@Entity
public class User implements UserDetail {
}
