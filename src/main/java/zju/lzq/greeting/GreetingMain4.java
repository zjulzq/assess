package zju.lzq.greeting;

import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.S2ContainerFactory;

public class GreetingMain4 {

	private static final String PATH = "zju/lzq/greeting/GreetingMain4.dicon";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		S2Container container = S2ContainerFactory.create(PATH);
		container.init();
		try {
			GreetingClient greetingClient = (GreetingClient) container
					.getComponent("greetingClient");
			greetingClient.execute();
		} finally {
			container.destroy();
		}
	}

}
