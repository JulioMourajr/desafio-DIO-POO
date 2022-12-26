import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Introducao a Java");
        curso1.setCargaHoraria(12);
        curso1.setDescricao("Curso para aprender o principios " +
                "da linguaguem java.");
        Curso curso2 = new Curso();
        curso2.setTitulo("Introducao a JS");
        curso2.setCargaHoraria(8);
        curso2.setDescricao("Curso para aprender o principios " +
                "da linguaguem javaScript.");

        Conteudo conteudo = new Curso();



        DateTimeFormatter myFormatObj = DateTimeFormatter.
                ofPattern("dd-MM-yyyy");
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de SQL.");
        mentoria.setDescricao("Duvidas em SQL, manda uma" +
                "DM.");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}