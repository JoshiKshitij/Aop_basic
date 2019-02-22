package app.ghost.basic;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class LoggingAspect {

	/*
	 * @Before(" execution(*  *())") public void loggingNames(JoinPoint joinPoint) {
	 * System.out.println("method name is " +joinPoint.getSignature());
	 * System.out.println("method is of Class "
	 * +joinPoint.getTarget().getClass().getSimpleName());
	 * System.out.println("method  arugument passes are " +
	 * Arrays.toString(joinPoint.getArgs())); }
	 */
	
	
	/*
	 * @Before(" getAllSetters()") public void allMehtods(JoinPoint joinPoint) {
	 * System.out.println("method name is " +joinPoint.getSignature());
	 * System.out.println("method is of Class "
	 * +joinPoint.getTarget().getClass().getSimpleName());
	 * System.out.println("method  arugument passes are " +
	 * Arrays.toString(joinPoint.getArgs()));
	 * System.out.println("--------------------------------------"); }
	 */
	/*
	 * @Pointcut("within(app.ghost.basic..*)") public void getAllSetters() {}
	 */
	/*
	 * @Around(" getAllSetters() " ) public Object
	 * displayAllMehtodInfo(ProceedingJoinPoint joinPoint) throws Throwable {
	 * System.out.println("method name is " +joinPoint.getSignature());
	 * System.out.println("method is of Class "
	 * +joinPoint.getTarget().getClass().getSimpleName());
	 * System.out.println("method  arugument passes are " +
	 * Arrays.toString(joinPoint.getArgs()));
	 * 
	 * try { System.out.println("method returned vlue is " + joinPoint.proceed() );
	 * System.out.println("--------------------------------------"); return
	 * joinPoint.proceed(); } catch (Exception e) { // some code for logging if need
	 * else dont use the tru block throw e; }
	 * 
	 * }
	 * 
	 * @AfterThrowing( pointcut =" getAllSetters()" , throwing ="e" ) public void
	 * AllMehtodadterThrowingException(JoinPoint joinPoint , Throwable e) {
	 * System.out.println("method name is " +joinPoint.getSignature());
	 * System.out.println("method is of Class "
	 * +joinPoint.getTarget().getClass().getSimpleName());
	 * System.out.println("method  arugument passes are " +
	 * Arrays.toString(joinPoint.getArgs()));
	 * System.out.println("excetion cause is " +e.getCause());
	 * System.out.println("--------------------------------------"); }
	 * 
	 */	
	
	
	@Before("within( app.ghost.basic..* )")
	void loggingforApple(){
		System.out.println("i am logging for apple");
	}
	
	
	
}
