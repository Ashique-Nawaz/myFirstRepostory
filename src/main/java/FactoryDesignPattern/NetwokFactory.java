/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryDesignPattern;

/**
 *
 * @author Administrator
 */
public class NetwokFactory {

    String networkType ;
    
    float networkRate ;
    
    public NetwokFactory getNetwok(String networkType) {
//        this.networkType = networkType;
        if("EE".equalsIgnoreCase(networkType)){
            return new EENetwork();
        } else if ("3".equalsIgnoreCase(networkType)){
            return new ThreeNetwork();
        } else {
            return new LycaNetwork();
        }
    }

    /**
     * Subclass specific handler in factory class
     */ 
    public NetwokFactory getNetwork() {
        if(this instanceof EENetwork){
            this.networkType = "EE network";
        } else if(this instanceof LycaNetwork){
            this.networkType = "Lyca network";
        } else if(this instanceof ThreeNetwork){ 
            this.networkType = "Three network";
        }
        return this;
    }
        
    public float calculateCost(int sec){
        return sec*networkRate;
    }
    
    public float getNetworkRate(){
        return networkRate;
    }

}
