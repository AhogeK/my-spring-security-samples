package com.ahogek.aopdemo.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author AhogeK ahogek@gmail.com
 * @since 2023-08-08 16:26:46
 */
@Aspect
@Component
public class NotVeryUsefulAspect {

    @Pointcut("execution(* transfer(..))")
    private void anyOldTransfer() {
    }

    @Before("anyOldTransfer()")
    public void anyOldTransferBefore() {
        System.out.println("A transfer function is called. This is a before advice.");
    }
}
