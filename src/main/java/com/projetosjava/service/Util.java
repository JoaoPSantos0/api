
package com.projetosjava.service;

import java.io.BufferedReader;
import java.io.IOException;

public class Util {
    public static String converterParaString(BufferedReader reader) throws IOException{
     
        String resposta, jsonString="";
        while((resposta = reader.readLine())!=null){
            
            jsonString += resposta;
        }
        return jsonString;
    }
}
