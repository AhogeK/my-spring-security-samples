package com.ahogek.sample.repository;

import com.ahogek.sample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * 用户持久层
 *
 * @author AhogeK ahogek@gmail.com
 * @since 2023-06-14 05:59:19
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * 根据邮箱查找用户
     *
     * @param email 邮箱
     * @return 用户
     */
    Optional<User> findByEmail(String email);
}
