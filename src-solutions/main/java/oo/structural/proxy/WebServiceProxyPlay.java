package oo.structural.proxy;

import com.ibm.training.simple_ws.SimpleWs;
import com.ibm.training.simple_ws.SimpleWs_Service;

public class WebServiceProxyPlay {
	public static void main(String[] args) throws Exception {
		// Must start soap ui and strat the mock endpoint 
		consumeWebServiceThroughProxy(new SimpleWs_Service().getSimpleWsSOAP());
	}

	private static void consumeWebServiceThroughProxy(SimpleWs serviceInterface) {
		System.out.println("Using a Dynamic Proxy: <<<" + serviceInterface + ">>>");
		String response = serviceInterface.echo("my message");
		System.out.println("Received response from Web Service: '" + response + "'");
	}
}
