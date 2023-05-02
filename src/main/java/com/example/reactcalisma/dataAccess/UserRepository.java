package com.example.reactcalisma.dataAccess;

import com.example.reactcalisma.entiti.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
