package mypackage;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.varia.NullAppender;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ServiceException, RemoteException {

        BasicConfigurator.configure(new NullAppender());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Country Code: ");
        String countryInfo = scanner.nextLine();

        CountryInfoServiceLocator infoService = new CountryInfoServiceLocator();
        CountryInfoServiceSoapType infoServiceSoap = infoService.getCountryInfoServiceSoap();

        String countryPhoneCode = infoServiceSoap.countryIntPhoneCode(countryInfo);
        String countryName = infoServiceSoap.countryName(countryInfo);
        String countryCapital = infoServiceSoap.capitalCity(countryInfo);
        String countryCurrency = infoServiceSoap.countryCurrency(countryInfo).getSName();
        String countryLanguage = infoServiceSoap.languageName(countryInfo);
        String countryFlag = infoServiceSoap.countryFlag(countryInfo);

        System.out.println("=============================================");
        System.out.println("Code: " + countryPhoneCode +
                "\nName: " + countryName +
                "\nCapital: " + countryCapital +
                "\nCurrency: " + countryCurrency +
                "\nLanguage: " + countryLanguage +
                "\nFlag: " + countryFlag
        );
        System.out.println("=============================================");
    }
}
