package com.ahogek.sample.service.impl;

import com.ahogek.sample.service.JwtService;
import org.springframework.stereotype.Service;

/**
 * JWT服务实现类
 *
 * @author AhogeK ahogek@gmail.com
 * @since 2023-06-15 20:29:09
 */
@Service
public class JwtServiceImpl implements JwtService {

    @Override
    public String extractUsername(String token) {
        return null;
    }
}
