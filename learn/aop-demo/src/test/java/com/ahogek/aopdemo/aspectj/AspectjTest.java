package com.ahogek.aopdemo.aspectj;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author AhogeK ahogek@gmail.com
 * @since 2023-08-08 16:29:18
 */
@SpringBootTest
class AspectjTest {

    @Autowired
    private SomeMethods someMethods;

    @Test
    void pointcutSimpleTest() {
        Assertions.assertAll("someMethods", () -> Assertions.assertNotNull(someMethods));
        someMethods.transfer();
    }
}
