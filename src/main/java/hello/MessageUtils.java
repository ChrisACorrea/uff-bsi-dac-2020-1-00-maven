/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.lang.String;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author chris
 */
public abstract class MessageUtils {
    
    private static String getMessage(String lang) {
        
        String msg = "";
        
        if(lang == null || StringUtils.isBlank(lang)) {
            lang = "pt";
        }
        
        switch(lang){
            case "pt":
                msg = "Alô, ";
                break;
            case "en":
                msg = "Hello, ";
                break;
            case "fr":
                msg = "Bonjour, ";
                break;
            case "de":
                msg = "Hallo, ";
                break;
        }
        
        return msg;
    }
    
    public static String getMensagemMontada(String lang, String nome){
        
        String msg = getMessage(lang);
       
        if(nome == null || StringUtils.isBlank(nome)) {
            nome = "Desconhecido";
        }
        
        return msg + nome + "!";
    }
}
