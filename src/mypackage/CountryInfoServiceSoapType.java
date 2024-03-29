/**
 * CountryInfoServiceSoapType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public interface CountryInfoServiceSoapType extends java.rmi.Remote {

    /**
     * Returns a list of continents ordered by name.
     */
    public mypackage.TContinent[] listOfContinentsByName() throws java.rmi.RemoteException;

    /**
     * Returns a list of continents ordered by code.
     */
    public mypackage.TContinent[] listOfContinentsByCode() throws java.rmi.RemoteException;

    /**
     * Returns a list of currencies ordered by name.
     */
    public mypackage.TCurrency[] listOfCurrenciesByName() throws java.rmi.RemoteException;

    /**
     * Returns a list of currencies ordered by code.
     */
    public mypackage.TCurrency[] listOfCurrenciesByCode() throws java.rmi.RemoteException;

    /**
     * Returns the name of the currency (if found)
     */
    public java.lang.String currencyName(java.lang.String sCurrencyISOCode) throws java.rmi.RemoteException;

    /**
     * Returns a list of all stored counties ordered by ISO code
     */
    public mypackage.TCountryCodeAndName[] listOfCountryNamesByCode() throws java.rmi.RemoteException;

    /**
     * Returns a list of all stored counties ordered by country name
     */
    public mypackage.TCountryCodeAndName[] listOfCountryNamesByName() throws java.rmi.RemoteException;

    /**
     * Returns a list of all stored counties grouped per continent
     */
    public mypackage.TCountryCodeAndNameGroupedByContinent[] listOfCountryNamesGroupedByContinent() throws java.rmi.RemoteException;

    /**
     * Searches the database for a country by the passed ISO country
     * code
     */
    public java.lang.String countryName(java.lang.String sCountryISOCode) throws java.rmi.RemoteException;

    /**
     * This function tries to found a country based on the passed
     * country name.
     */
    public java.lang.String countryISOCode(java.lang.String sCountryName) throws java.rmi.RemoteException;

    /**
     * Returns the  name of the captial city for the passed country
     * code
     */
    public java.lang.String capitalCity(java.lang.String sCountryISOCode) throws java.rmi.RemoteException;

    /**
     * Returns the currency ISO code and name for the passed country
     * ISO code
     */
    public mypackage.TCurrency countryCurrency(java.lang.String sCountryISOCode) throws java.rmi.RemoteException;

    /**
     * Returns a link to a picture of the country flag
     */
    public java.lang.String countryFlag(java.lang.String sCountryISOCode) throws java.rmi.RemoteException;

    /**
     * Returns the internation phone code for the passed ISO country
     * code
     */
    public java.lang.String countryIntPhoneCode(java.lang.String sCountryISOCode) throws java.rmi.RemoteException;

    /**
     * Returns a struct with all the stored country information. Pass
     * the ISO country code
     */
    public mypackage.TCountryInfo fullCountryInfo(java.lang.String sCountryISOCode) throws java.rmi.RemoteException;

    /**
     * Returns an array with all countries and all the language information
     * stored
     */
    public mypackage.TCountryInfo[] fullCountryInfoAllCountries() throws java.rmi.RemoteException;

    /**
     * Returns a list of all countries that use the same currency
     * code. Pass a ISO currency code
     */
    public mypackage.TCountryCodeAndName[] countriesUsingCurrency(java.lang.String sISOCurrencyCode) throws java.rmi.RemoteException;

    /**
     * Returns an array of languages ordered by name
     */
    public mypackage.TLanguage[] listOfLanguagesByName() throws java.rmi.RemoteException;

    /**
     * Returns an array of languages ordered by code
     */
    public mypackage.TLanguage[] listOfLanguagesByCode() throws java.rmi.RemoteException;

    /**
     * Find a language name based on the passed ISO language code
     */
    public java.lang.String languageName(java.lang.String sISOCode) throws java.rmi.RemoteException;

    /**
     * Find a language ISO code based on the passed language name
     */
    public java.lang.String languageISOCode(java.lang.String sLanguageName) throws java.rmi.RemoteException;
}
