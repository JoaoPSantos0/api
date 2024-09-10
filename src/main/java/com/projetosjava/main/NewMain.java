
package com.projetosjava.main;

import com.projetosjava.locstation.Localizacao;
import com.projetosjava.service.ServiceLocation;


public class NewMain {

   
    public static void main(String[] args) throws Exception {
        
        Localizacao loc = ServiceLocation.buscaLoc();;
        System.out.println("Longitude: "+ loc.getIssPosition().getLongitude());
        System.out.println("Latitude: "+ loc.getIssPosition().getLatitude());
        
        
    

    }
    
}
