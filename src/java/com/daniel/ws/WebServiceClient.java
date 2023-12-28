package com.daniel.ws;

public class WebServiceClient {
    public static void main(String[] args) {
        // Create an instance of the HelloWorld implementation class
        HelloWorldImpl helloWorldService = new HelloWorldImpl();

        // Call the method defined in the web service interface
        String result = helloWorldService.getHelloWorldAsString();

        // Print the result
        System.out.println("Web Service Response: " + result);
    }
}
