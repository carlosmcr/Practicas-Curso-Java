package es.indra.carro.springcarro.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LogAspect {

	// * es.indra.carro.springcarro.service.impl.*.*(..)
	// Tipo de retorno(Boolean/String...) es.indra.carro.sprincarro.PAQUETE.CLASE.METODO(String nombre--Por ejemplo)
	@Before("execution(* es.indra.carro.springcarro.service.impl.*.*(..))")
	public void antesDeLosMetodos(JoinPoint joinPoint) {
		// Advice
		System.out.println("Dentro del aspectp para: " + joinPoint);
	}

	// Anotacion generica para todos los metodos de CarroController
//	@Around("execution(* es.indra.carro.springcarro.controller.CarroController.*(..))")
//	public void tiempoMetodos(ProceedingJoinPoint pjp) {
//		try {
//			long start = System.currentTimeMillis();
//			System.out.println("Llamando al metodo");
//			pjp.proceed();
//			System.out.println("Ejecucion completada");
//			long elapsedTime = System.currentTimeMillis() - start;
//			System.out.println("Tiempo de ejecucion: " + elapsedTime + " milisegundos.");
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
//	}

	// Anotacion personalizada que solo se ejecuta en el metodo con la anotacion @TiempoDeEjecucion
	// pjp.proceed(); ejecuta el metodo y devuelve lo que retorne el metodo original(getAllCategoria() del controller)
	@Around("@annotation(es.indra.carro.springcarro.aspects.annotation.TiempoDeEjecucion)")
	public void anotacionPersonalizada(ProceedingJoinPoint pjp) {
		try {
			long start = System.currentTimeMillis();
			System.out.println("Llamando al metodo");
			pjp.proceed();
			System.out.println("Ejecucion completada");
			long elapsedTime = System.currentTimeMillis() - start;
			System.out.println("Tiempo de ejecucion: " + elapsedTime + " milisegundos.");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

}
