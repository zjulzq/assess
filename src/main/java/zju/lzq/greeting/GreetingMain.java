package zju.lzq.greeting;

import zju.lzq.greeting.impl.GreetingClientImpl;
import zju.lzq.greeting.impl.GreetingImpl;

public class GreetingMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Greeting greeting = new GreetingImpl();
		GreetingClientImpl greetingClient = new GreetingClientImpl();
		greetingClient.setGreeting(greeting);
		greetingClient.execute();
	}

}
