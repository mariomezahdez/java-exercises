import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class OperacionesFechas { // Con la clase Calendar

    public static void main(String[] args) {

        //SimpleDateFormat dateTime = new SimpleDateFormat("yyyy/MM/dd");
        //String sDate = dateTime.format(new Date());

        Calendar c = Calendar.getInstance(); //Clase que nos permite el manejo de fechas
	    Date now = c.getTime();  //Fecha y hora  al momento
        c.add(Calendar.DATE, -1); //Permite restar dias completos a la fecha actual
        Date before = c.getTime(); // Obtenemos la fecha con el dia ya restado

        System.out.println("Fecha al momento de ejecucion : " + now);
        System.out.println("Fecha al restarle un dia : " + before);

        //SimpleDateFormat newFormato = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat newFormato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); //Permite cambiar el formato de la fecha

        String dateNow = newFormato.format(now);
        System.out.println("Fecha al momento con formato : " + dateNow);

        String dateBefore = newFormato.format(before);
        System.out.println("Fecha menos un dia con formato : " + dateBefore);

    }
}
