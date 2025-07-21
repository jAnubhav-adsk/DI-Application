package com.application.logger.interceptors;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("\nBefore Method " + invocation.getMethod().getName());
        Object result = invocation.proceed();
        System.out.println("After Method " + invocation.getMethod().getName() + "\n");

        return result;
    }
}
