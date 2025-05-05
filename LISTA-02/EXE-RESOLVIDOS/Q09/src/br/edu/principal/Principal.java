package br.edu.principal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Principal {
    public static void main(String[] args) {
    	
        LocalDateTime agora = LocalDateTime.now();

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoMesExtenso = DateTimeFormatter.ofPattern("MMMM", new Locale("pt", "BR"));
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Data: " + agora.format(formatoData));
        System.out.println("Mês por extenso: " + agora.format(formatoMesExtenso));
        System.out.println("Hora e minuto: " + agora.format(formatoHora));
    }
}