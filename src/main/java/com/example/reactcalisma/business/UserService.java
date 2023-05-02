package com.example.reactcalisma.business;

import com.example.reactcalisma.dataAccess.UserRepository;
import com.example.reactcalisma.entiti.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepository userRepository;
    PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder=new BCryptPasswordEncoder();
    }

    public User save(User user) {

        user.setSifre(this.passwordEncoder.encode(user.getSifre()));
        return userRepository.save(user);
    }
}
