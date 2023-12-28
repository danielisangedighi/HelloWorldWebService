/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.daniel.client;

import com.daniel.ws.HelloWorld;
import com.daniel.ws.HelloWorldImpl;

/**
 *
 * @author Administrator
 */
public class HelloWorldClient {
    public static void main(String[] args) {
        // Create an instance of the HelloWorld interface
        HelloWorld helloWorldService = new HelloWorldImpl(); // Assuming you have an implementation class

        // Call the method defined in the interface
        String result = helloWorldService.getHelloWorldAsString();

        // Print the result
        System.out.println(result);
    }
}