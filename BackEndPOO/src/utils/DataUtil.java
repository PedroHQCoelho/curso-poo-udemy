package src.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
    
    public static String converterDateParaDateEHora(Date data){

        //24/07/1987 07:40hr
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY HH:mm");
        return formatador.format(data);
    }
}
