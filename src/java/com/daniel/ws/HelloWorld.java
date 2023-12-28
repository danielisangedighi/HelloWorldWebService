package com.daniel.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
//import javax.swing.text.Style;

//Service Endpoint Interface

/**
 *
 * @author Administrator
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld{
	
    /**
     *
     * @return
     */
    @WebMethod 
    String getHelloWorldAsString();
	
}

