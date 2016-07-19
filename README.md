# cutpoint
第四章 切面的定义

@Aspect   声明一个POJO为切面

@Pointcut("execution(* com.weib.concert.beans.Performance.perform(..))")  定义切点

@Before("performance()")  在切点前执行

@AfterReturning("performance()")  在切点返回后执行

@AfterThrowing("performance()") 在切点异常时执行

@Around("performance()")  代理执行切点为，通过ProceedingJoinPoint#proceed()执行切点方法的代码

@EnableAspectJAutoProxy   在Config中声明切点为自动代理

@DeclareParents(value="com.weib.concert.beans.Performance+",  defaultImpl=PerformanceEncoreable.class) 
