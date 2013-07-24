
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
 *         &lt;element name="AccelerationValue" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="fromAccelerationUnit" type="{http://www.webserviceX.NET/}Accelerations"/>
 *         &lt;element name="toAccelerationUnit" type="{http://www.webserviceX.NET/}Accelerations"/>
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
    "accelerationValue",
    "fromAccelerationUnit",
    "toAccelerationUnit"
})
@XmlRootElement(name = "ChangeAccelerationUnit")
public class ChangeAccelerationUnit {

    @XmlElement(name = "AccelerationValue")
    protected double accelerationValue;
    @XmlElement(required = true)
    protected Accelerations fromAccelerationUnit;
    @XmlElement(required = true)
    protected Accelerations toAccelerationUnit;

    /**
     * Gets the value of the accelerationValue property.
     * 
     */
    public double getAccelerationValue() {
        return accelerationValue;
    }

    /**
     * Sets the value of the accelerationValue property.
     * 
     */
    public void setAccelerationValue(double value) {
        this.accelerationValue = value;
    }

    /**
     * Gets the value of the fromAccelerationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Accelerations }
     *     
     */
    public Accelerations getFromAccelerationUnit() {
        return fromAccelerationUnit;
    }

    /**
     * Sets the value of the fromAccelerationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accelerations }
     *     
     */
    public void setFromAccelerationUnit(Accelerations value) {
        this.fromAccelerationUnit = value;
    }

    /**
     * Gets the value of the toAccelerationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Accelerations }
     *     
     */
    public Accelerations getToAccelerationUnit() {
        return toAccelerationUnit;
    }

    /**
     * Sets the value of the toAccelerationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Accelerations }
     *     
     */
    public void setToAccelerationUnit(Accelerations value) {
        this.toAccelerationUnit = value;
    }

}
