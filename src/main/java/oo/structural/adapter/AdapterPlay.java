package oo.structural.adapter;

import oo.structural.adapter.external.LegacySMSSender;

public class AdapterPlay {
	public static void main(String[] args) {
		LegacySMSSender externalSystemsToAdapt = new LegacySMSSender();
		
		SMSSender smsSender = new SMSSenderAdapter(externalSystemsToAdapt);

		businessCodeWithAdapter(smsSender);
	}

	private static void businessCodeWithAdapter(SMSSender smsSender) {
		smsSender.sendSMS(new Phone("+4", "0720099111"), "Hello World!");
	}
}
