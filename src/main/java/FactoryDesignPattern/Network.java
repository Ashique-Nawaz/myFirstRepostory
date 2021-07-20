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
public class Network<T> {
    
    // here my net can be of any type 
    T net;

    public String doSomething() {
//        net = new T();
        return net.getClass().toString();
    }
    
    
}
