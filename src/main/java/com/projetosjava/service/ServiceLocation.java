
package com.projetosjava.service;

import com.google.gson.Gson;
import com.projetosjava.locstation.Localizacao;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class ServiceLocation {
    
    protected static String url = "http://api.open-notify.org/iss-now.json";
    
    
    public static Localizacao buscaLoc() throws Exception {
        String urlPath = "http://api.open-notify.org/iss-now.json";
        URL url = new URL(urlPath);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setRequestMethod("GET");
        conn.setDoInput(true);
        
        try{
            BufferedReader buff = new BufferedReader(new InputStreamReader((conn.getInputStream()),"utf-8"));
            
            String covertJsonString = Util.converterParaString(buff);
            System.out.println(covertJsonString);
            Gson gson = new Gson();
            Localizacao loc = gson.fromJson(covertJsonString, Localizacao.class);
            System.out.println(loc);
            return loc;
            
        }catch(Exception e){
            throw new Exception(conn.getResponseCode()+ e.getMessage());
        }
        
    }
}
