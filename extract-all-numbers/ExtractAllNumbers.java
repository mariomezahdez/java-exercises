import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllNumbers {
    public static void main(String[] args) {

        String textNumber = "43432.4243200"; //Numero a dar formato
        float val = Float.parseFloat(textNumber);

        String numberF = String.format("%.2f", val); // Se coloca la cantidad de decimales deseados
        System.out.println("Numero con 2 decimales : " + numberF);

        String cleanNumber = onlyNumber(numberF);
        System.out.println("Numero eliminando punto decimal : " + cleanNumber);

    }

    //Metodo que solo obtiene los numeros de un String
    public static  String onlyNumber(String campo){

        String number = "";
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(campo);
        while(m.find()) {
            number += m.group();
        }

        return number;
    }

}
