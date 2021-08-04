package oo.behavioral.observer;

import java.awt.event.ActionListener;

import oo.gui.MyFrame;

public class ObserverPlay {
	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame();
		
		// Polymorphic assignment: we refer to a concrete implementation,
		// via an interface that this implementation implements
		ActionListener actionListener = new MyButtonActionListener();
		
		myFrame.button1.addActionListener(actionListener);
	}
}
