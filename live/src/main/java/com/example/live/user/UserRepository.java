package com.example.live.user;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

    @Repository
    public interface UserRepository extends JpaRepository<User, Long> {
        
    }

