/**
 * CountryInfoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public interface CountryInfoService extends javax.xml.rpc.Service {

/**
 * This DataFlex Web Service opens up country information. 2 letter
 * ISO codes are used for Country code. There are functions to retrieve
 * the used Currency, Language, Capital City, Continent and Telephone
 * code.
 */
    public java.lang.String getCountryInfoServiceSoap12Address();

    public mypackage.CountryInfoServiceSoapType getCountryInfoServiceSoap12() throws javax.xml.rpc.ServiceException;

    public mypackage.CountryInfoServiceSoapType getCountryInfoServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getCountryInfoServiceSoapAddress();

    public mypackage.CountryInfoServiceSoapType getCountryInfoServiceSoap() throws javax.xml.rpc.ServiceException;

    public mypackage.CountryInfoServiceSoapType getCountryInfoServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
