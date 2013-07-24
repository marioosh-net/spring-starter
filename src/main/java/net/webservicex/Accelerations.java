
package net.webservicex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Accelerations.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Accelerations">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="celo"/>
 *     &lt;enumeration value="centigal"/>
 *     &lt;enumeration value="centimeterPersquaresecond"/>
 *     &lt;enumeration value="decigal"/>
 *     &lt;enumeration value="decimeterPersquaresecond"/>
 *     &lt;enumeration value="dekameterPersquaresecond"/>
 *     &lt;enumeration value="footPersquaresecond"/>
 *     &lt;enumeration value="gunit"/>
 *     &lt;enumeration value="gal"/>
 *     &lt;enumeration value="galileo"/>
 *     &lt;enumeration value="gn"/>
 *     &lt;enumeration value="grav"/>
 *     &lt;enumeration value="hectometerPersquaresecond"/>
 *     &lt;enumeration value="inchPersquaresecond"/>
 *     &lt;enumeration value="kilometerPerhoursecond"/>
 *     &lt;enumeration value="kilometerPersquaresecond"/>
 *     &lt;enumeration value="leo"/>
 *     &lt;enumeration value="meterPersquaresecond"/>
 *     &lt;enumeration value="milePerhourminute"/>
 *     &lt;enumeration value="milePerhoursecond"/>
 *     &lt;enumeration value="milePersquaresecond"/>
 *     &lt;enumeration value="milligal"/>
 *     &lt;enumeration value="millimeterPersquaresecond"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Accelerations")
@XmlEnum
public enum Accelerations {

    @XmlEnumValue("celo")
    CELO("celo"),
    @XmlEnumValue("centigal")
    CENTIGAL("centigal"),
    @XmlEnumValue("centimeterPersquaresecond")
    CENTIMETER_PERSQUARESECOND("centimeterPersquaresecond"),
    @XmlEnumValue("decigal")
    DECIGAL("decigal"),
    @XmlEnumValue("decimeterPersquaresecond")
    DECIMETER_PERSQUARESECOND("decimeterPersquaresecond"),
    @XmlEnumValue("dekameterPersquaresecond")
    DEKAMETER_PERSQUARESECOND("dekameterPersquaresecond"),
    @XmlEnumValue("footPersquaresecond")
    FOOT_PERSQUARESECOND("footPersquaresecond"),
    @XmlEnumValue("gunit")
    GUNIT("gunit"),
    @XmlEnumValue("gal")
    GAL("gal"),
    @XmlEnumValue("galileo")
    GALILEO("galileo"),
    @XmlEnumValue("gn")
    GN("gn"),
    @XmlEnumValue("grav")
    GRAV("grav"),
    @XmlEnumValue("hectometerPersquaresecond")
    HECTOMETER_PERSQUARESECOND("hectometerPersquaresecond"),
    @XmlEnumValue("inchPersquaresecond")
    INCH_PERSQUARESECOND("inchPersquaresecond"),
    @XmlEnumValue("kilometerPerhoursecond")
    KILOMETER_PERHOURSECOND("kilometerPerhoursecond"),
    @XmlEnumValue("kilometerPersquaresecond")
    KILOMETER_PERSQUARESECOND("kilometerPersquaresecond"),
    @XmlEnumValue("leo")
    LEO("leo"),
    @XmlEnumValue("meterPersquaresecond")
    METER_PERSQUARESECOND("meterPersquaresecond"),
    @XmlEnumValue("milePerhourminute")
    MILE_PERHOURMINUTE("milePerhourminute"),
    @XmlEnumValue("milePerhoursecond")
    MILE_PERHOURSECOND("milePerhoursecond"),
    @XmlEnumValue("milePersquaresecond")
    MILE_PERSQUARESECOND("milePersquaresecond"),
    @XmlEnumValue("milligal")
    MILLIGAL("milligal"),
    @XmlEnumValue("millimeterPersquaresecond")
    MILLIMETER_PERSQUARESECOND("millimeterPersquaresecond");
    private final String value;

    Accelerations(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Accelerations fromValue(String v) {
        for (Accelerations c: Accelerations.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
