/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SchoolCertificateApp;


/**
 *
 * @author Dell
 */
public class Menu {

    public void printMenu () {
        System.out.println("=====================================");
        System.out.println();
        System.out.println("  APLIKACJA DO OBSŁUGI OCEN UCZNIÓW");
        System.out.println();
        System.out.println("=====================================");
        System.out.println();
        System.out.println("1. ");

    }

    public void chooseOptionFromMenu () {
        int choosenOption = ScannerUtility.getIntegerFromUser("Wybierz odpowiednią opcję:");
        switch (choosenOption){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }

    }
}
