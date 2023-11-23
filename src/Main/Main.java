package Main;

import BusinessObject.Boleta;
import java.time.LocalDate;
import java.time.LocalTime;
import java.sql.Date;
import java.sql.Time;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        Boleta bl = new Boleta();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        bl.setImporte(15.5f);
        bl.setFechaExpedicion(LocalDate.now());
        bl.setHoraExpedicion(LocalTime.now());
        String newFormato = bl.getFechaExpedicion().format(formato);
        System.out.println(bl.getFechaExpedicion());
        System.out.println(bl.getHoraExpedicion());
        System.out.println("----------------");
        //System.out.println(Date.valueOf(bl.getFechaExpedicion()));
        System.out.println(newFormato+", nuevo formato");
        System.out.println(Time.valueOf(bl.getHoraExpedicion()));
    }
}
