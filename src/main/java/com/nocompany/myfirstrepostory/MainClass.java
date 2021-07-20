package com.nocompany.myfirstrepostory;

//package testProject;

import FactoryDesignPattern.LycaNetwork;
import FactoryDesignPattern.NetwokFactory;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("my first git project");
                NetwokFactory network = new LycaNetwork();
                network.getNetworkRate();
                NetwokFactory network1 = new LycaNetwork();
                NetwokFactory network2 = new LycaNetwork();
                
	}

}
