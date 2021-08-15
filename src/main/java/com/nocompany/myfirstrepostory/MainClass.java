package com.nocompany.myfirstrepostory;

//package testProject;

import FactoryDesignPattern.LycaNetwork;
import FactoryDesignPattern.NetworkFactory;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("my first git project");
                NetworkFactory network = new NetworkFactory("EE");
                network.updateRate();
                System.out.println(network.getNetworkRate());
                network = new NetworkFactory("3");
                network.updateRate();
                System.out.println(network.getNetworkRate());
                network = new NetworkFactory("Lyca");
                network.updateRate();
                System.out.println(network.getNetworkRate());
                
	}

}
