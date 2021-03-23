package com.yiming.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Timer;
import java.util.concurrent.Executors;


@EnableRedisRepositories
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		RedisTemplate template = (RedisTemplate)run.getBean("redisTemplate");
		template.boundHashOps("goods").put("id",01);
		template.boundHashOps("goods").put("name",012);
		template.boundHashOps("goods").put("pass",0341);
		template.boundSetOps("li").add("aef","fwe","wf");
	}
}
interface doma{
	void select();
	void insert();
}
abstract class doma0 implements doma{
	public void select(){}
	public abstract void insert();
}
class  doma1 extends doma0 {


	@Override
	public void insert() {
		Executors.newCachedThreadPool();
		try {
			ObjectInputStream o = new ObjectInputStream(new FileInputStream("s.out"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Timer timer = new Timer();

	}

}
class  dongtaiporxy implements InvocationHandler {

	private Object target;

	public void setTarget(Object target) {
		this.target = target;
	}


	public Object getProxy(){
		return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(target,args);
	}
}