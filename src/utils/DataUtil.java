package src.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
    
    public static String ConverterDateParaDataEHora(Date data){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY HH:mm");        
        return formatador.format(data);
        // DD/MM/AAAA hh:mm
    }

    public static String ConverterDateParaData(Date data){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY");        
        return formatador.format(data);
        // DD/MM/AAAA hh:mm
    }

    public static String ConverterDateParaHora(Date data){
        SimpleDateFormat formatador = new SimpleDateFormat("HH:mm");        
        return formatador.format(data);
        // DD/MM/AAAA hh:mm
    }
}
