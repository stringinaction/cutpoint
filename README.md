# cutpoint
第四章 切面的定义

@Aspect

@Pointcut("execution(* com.weib.concert.beans.Performance.perform(..))")

@Before("performance()")

@AfterReturning("performance()")

@AfterThrowing("performance()")

@EnableAspectJAutoProxy

