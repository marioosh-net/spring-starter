
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChangeAccelerationUnitResult" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "changeAccelerationUnitResult"
})
@XmlRootElement(name = "ChangeAccelerationUnitResponse")
public class ChangeAccelerationUnitResponse {

    @XmlElement(name = "ChangeAccelerationUnitResult")
    protected double changeAccelerationUnitResult;

    /**
     * Gets the value of the changeAccelerationUnitResult property.
     * 
     */
    public double getChangeAccelerationUnitResult() {
        return changeAccelerationUnitResult;
    }

    /**
     * Sets the value of the changeAccelerationUnitResult property.
     * 
     */
    public void setChangeAccelerationUnitResult(double value) {
        this.changeAccelerationUnitResult = value;
    }

}
