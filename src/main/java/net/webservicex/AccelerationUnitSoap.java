
package net.webservicex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AccelerationUnitSoap", targetNamespace = "http://www.webserviceX.NET/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AccelerationUnitSoap {


    /**
     * 
     * @param accelerationValue
     * @param fromAccelerationUnit
     * @param toAccelerationUnit
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ChangeAccelerationUnit", action = "http://www.webserviceX.NET/ChangeAccelerationUnit")
    @WebResult(name = "ChangeAccelerationUnitResult", targetNamespace = "http://www.webserviceX.NET/")
    @RequestWrapper(localName = "ChangeAccelerationUnit", targetNamespace = "http://www.webserviceX.NET/", className = "net.webservicex.ChangeAccelerationUnit")
    @ResponseWrapper(localName = "ChangeAccelerationUnitResponse", targetNamespace = "http://www.webserviceX.NET/", className = "net.webservicex.ChangeAccelerationUnitResponse")
    public double changeAccelerationUnit(
        @WebParam(name = "AccelerationValue", targetNamespace = "http://www.webserviceX.NET/")
        double accelerationValue,
        @WebParam(name = "fromAccelerationUnit", targetNamespace = "http://www.webserviceX.NET/")
        Accelerations fromAccelerationUnit,
        @WebParam(name = "toAccelerationUnit", targetNamespace = "http://www.webserviceX.NET/")
        Accelerations toAccelerationUnit);

}
