import br.com.dio.desafio.dominio.*;

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


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Introdução ao Java!");
        bootcamp.setDescricao("Introdução a linguaguem de " +
                "Programação Java!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Julio Moura");

        Dev dev2 = new Dev();
        dev2.setNome("Pedro Moura");


        dev1.InscreverBootcamp(bootcamp);
        dev2.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + dev1.getConteudoInscritos());
        System.out.println("Conteudos Inscritos: " + dev2.getConteudoInscritos());
        dev1.progredir();
        dev2.progredir();
        System.out.println("Conteudos Concluidos: " + dev1.getConteudoConcluidos());
        System.out.println("Conteudos Inscritos: " + dev1.getConteudoInscritos());
        System.out.println("Conteudos Concluidos: " + dev2.getConteudoConcluidos());
        dev1.progredir();
        System.out.println("Xp : " + dev1.calcularTotalXp() + " " + dev2.calcularTotalXp());
    }
}