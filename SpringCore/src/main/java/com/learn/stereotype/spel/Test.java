package com.learn.stereotype.spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
//import org.springframework.expression.Expression;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/learn/stereotype/spel/config.xml");

		Demo demo = context.getBean("demo", Demo.class);

		System.out.println(demo);

		/*
		 * SpelExpressionParser temp = new SpelExpressionParser(); Expression exp =
		 * (Expression)temp.parseExpression("34+88");
		 * 
		 * System.out.println(exp.getValue());
		 */

	}

}
