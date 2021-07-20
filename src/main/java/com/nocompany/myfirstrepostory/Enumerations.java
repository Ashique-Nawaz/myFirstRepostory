/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nocompany.myfirstrepostory;

/**
 *
 * @author Administrator
 */
public enum Enumerations {
    DEFAULT("Default","Default"),
    THREE("THREE","THREE network is selected"),
    EE("EE","EE network is selected"),
    LYKA("LYKA","LYKA network is selected");
    
    String network;
    String description;
    
    Enumerations( String network, String description){
        this.network = network;
        this.description = description;
    }
    
    public Enumerations getEnumerationsFromNetwork(String network){
        Enumerations en = Enumerations.DEFAULT;
        for( Enumerations net : Enumerations.values()){
            if(net.network.equalsIgnoreCase(network)){
                return net;
            }
        }
        return DEFAULT;
    }
}
