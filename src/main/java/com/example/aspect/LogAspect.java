package com.example.aspect;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	String msg = "aop LogAspect...";
	

	@Pointcut("within(com.example..*)")
	public void pointcut() {
		
	}
	
//	@Before("execution(* com.example..*.*(..))")
//	@Before("within(com.example..*)")
	@Before("pointcut()")
	public void beforelogging(JoinPoint jp) {
		System.out.println("### @Before start");
		System.out.println("kind = " + jp.getKind());
		System.out.println("signature = " + jp.getSignature());
		System.out.println("target = " + jp.getTarget());
		System.out.println("args = " + Arrays.toString(jp.getArgs()));
//		System.out.println("this = " + jp.getThis());
		System.out.println("LongString = " + jp.toLongString());
		System.out.println("ShortString = " + jp.toShortString());
		System.out.println("SourceLocation = " + jp.getSourceLocation());
		System.out.println("### @Before end");
		
	}
	
	@After("pointcut()")
	public void afterlogging(JoinPoint jp) {
		System.out.println("### @After start");
		System.out.println("kind = " + jp.getKind());
		System.out.println("signature = " + jp.getSignature());
		System.out.println("target = " + jp.getTarget());
		System.out.println("args = " + Arrays.toString(jp.getArgs()));
//		System.out.println("this = " + jp.getThis());
		System.out.println("LongString = " + jp.toLongString());
		System.out.println("ShortString = " + jp.toShortString());
		System.out.println("SourceLocation = " + jp.getSourceLocation());
		System.out.println("### @After end");
	}

	@Around("pointcut()")
	public Object aroundlogging(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("### @Around before start");
		System.out.println("kind = " + pjp.getKind());
		System.out.println("signature = " + pjp.getSignature());
		System.out.println("target = " + pjp.getTarget());
		System.out.println("args = " + Arrays.toString(pjp.getArgs()));
//		System.out.println("this = " + jp.getThis());
		System.out.println("LongString = " + pjp.toLongString());
		System.out.println("ShortString = " + pjp.toShortString());
		System.out.println("SourceLocation = " + pjp.getSourceLocation());
		System.out.println("### @Around before end");
		Object rtn =  pjp.proceed();
		System.out.println("### @Around after start");
		System.out.println("kind = " + pjp.getKind());
		System.out.println("signature = " + pjp.getSignature());
		System.out.println("target = " + pjp.getTarget());
		System.out.println("args = " + Arrays.toString(pjp.getArgs()));
//		System.out.println("this = " + jp.getThis());
		System.out.println("LongString = " + pjp.toLongString());
		System.out.println("ShortString = " + pjp.toShortString());
		System.out.println("SourceLocation = " + pjp.getSourceLocation());
		System.out.println("### @Around after start");
		
		return rtn;
	}
	
	@AfterReturning(pointcut="pointcut()", returning="rtnValue")
	public void afterReturninglogging(JoinPoint jp, List<String> rtnValue) {
		System.out.println("### @AfterReturning start");
		System.out.println("kind = " + jp.getKind());
		System.out.println("signature = " + jp.getSignature());
		System.out.println("target = " + jp.getTarget());
		System.out.println("args = " + Arrays.toString(jp.getArgs()));
//		System.out.println("this = " + jp.getThis());
		System.out.println("LongString = " + jp.toLongString());
		System.out.println("ShortString = " + jp.toShortString());
		System.out.println("SourceLocation = " + jp.getSourceLocation());
		System.out.println("rtnValue = " + rtnValue);
		System.out.println("### @AfterReturning end");
	}
	
	@AfterReturning(pointcut="pointcut()")
	public void afterReturninglogging(JoinPoint jp) {
		System.out.println("### @AfterReturning start");
		System.out.println("kind = " + jp.getKind());
		System.out.println("signature = " + jp.getSignature());
		System.out.println("target = " + jp.getTarget());
		System.out.println("args = " + Arrays.toString(jp.getArgs()));
//		System.out.println("this = " + jp.getThis());
		System.out.println("LongString = " + jp.toLongString());
		System.out.println("ShortString = " + jp.toShortString());
		System.out.println("SourceLocation = " + jp.getSourceLocation());
		System.out.println("rtnValue = void");
		System.out.println("### @AfterReturning end");
	}
	
	@AfterThrowing(pointcut="pointcut()", throwing="e")
	public void afterThrowinglogging(JoinPoint jp, RuntimeException e) {
		System.out.println("### @AfterThrowing start");
		System.out.println("kind = " + jp.getKind());
		System.out.println("signature = " + jp.getSignature());
		System.out.println("target = " + jp.getTarget());
		System.out.println("args = " + Arrays.toString(jp.getArgs()));
//		System.out.println("this = " + jp.getThis());
		System.out.println("LongString = " + jp.toLongString());
		System.out.println("ShortString = " + jp.toShortString());
		System.out.println("SourceLocation = " + jp.getSourceLocation());
		System.out.println("throwing = " + e.getMessage());
		System.out.println("### @AfterThrowing end");
	}
	

}
