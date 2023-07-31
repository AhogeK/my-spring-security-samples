package com.ahogek.sample.service;

/**
 * JWT服务
 *
 * @author AhogeK ahogek@gmail.com
 * @since 2023-06-15 20:26:49
 */
public interface JwtService {

    /**
     * 解析用户名
     *
     * @param token token
     * @return 用户名
     */
    String extractUsername(String token);
}
