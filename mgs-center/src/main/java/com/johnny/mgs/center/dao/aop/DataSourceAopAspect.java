package com.johnny.mgs.center.dao.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataSourceAopAspect {

	@Before("execution(* com.johnny.mgs.center.dao.base..*(..))")
	public void before(JoinPoint point) throws NoSuchMethodException,
			SecurityException {
		String method = point.getSignature().getName();
		Class<?> targetClass = point.getTarget().getClass();
		Class<?>[] parameterTypes = ((MethodSignature) point.getSignature())
				.getMethod().getParameterTypes();
		// 方法注解可以覆盖类注解
		Method m = targetClass.getMethod(method, parameterTypes);
		if (m != null && m.isAnnotationPresent(DataSource.class)) {
			DataSource data = m.getAnnotation(DataSource.class);
			MultiDataSource.setDataSourceKey(data.value());
		}
	}

	@After("execution(* com.johnny.mgs.center.dao.base..*(..))")
	public void after(JoinPoint point) {
		MultiDataSource.clearDataSource();
	}
}
