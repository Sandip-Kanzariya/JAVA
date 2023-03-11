package com.learn.slifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Annotation {
	private String subject;

	public Annotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Annotation(String subject) {
		super();
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Annotation [subject=" + subject + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println("Annotation : Start ");
	}

	@PreDestroy
	public void end() {
		System.out.println("Annotation : End ");
	}

}
