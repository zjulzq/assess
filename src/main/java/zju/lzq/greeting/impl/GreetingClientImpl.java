package zju.lzq.greeting.impl;

import zju.lzq.greeting.Greeting;
import zju.lzq.greeting.GreetingClient;

public class GreetingClientImpl implements GreetingClient {

	private Greeting greeting;

	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}

	public void execute() {
		System.out.println(greeting.greet());

	}

}
