import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

        public static void main(String[] args) {
            Curso curso1 = new Curso();
            curso1.setTitulo("curso java");
            curso1.setDescricao("descricão curso java");
            curso1.setCargaHoraria(8);

            Curso curso2 = new Curso();
            curso2.setTitulo("curso js");
            curso2.setDescricao("descricão curso js");
            curso2.setCargaHoraria(4);

            Conteudo conteudo = new Curso();


            Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("curso js");
            mentoria.setDescricao("descricão curso js");
            mentoria.setData(LocalDate.now());


           /* System.out.println(curso1);
            System.out.println(curso2);
            System.out.println(mentoria);*/
            Bootcamp bootcamp = new Bootcamp();
            bootcamp.setNome("Bootcamp Java Developer");
            bootcamp.setDescricao("Descrição Bootcamp Java Developer");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);

            Dev devJanaina = new Dev();
            devJanaina.setNome("Camila");
            devJanaina.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos Janaina:" + devJanaina.getConteudoInscritos());
            devJanaina.progredir();
            devJanaina.progredir();
            System.out.println("-");
            System.out.println("Conteúdos Inscritos Janaina:" + devJanaina.getConteudoInscritos());
            System.out.println("Conteúdos Concluídos Janaina:" + devJanaina.getConteudosConcluidos());
           //System.out.println("XP:" + devJanaina.calcularTotalXp());

            System.out.println("-------");

            Dev devJoao = new Dev();
            devJoao.setNome("Joao");
            devJoao.inscreverBootcamp(bootcamp);
            System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudoInscritos());
            devJoao.progredir();
            devJoao.progredir();
            devJoao.progredir();
            System.out.println("-");
            System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudoInscritos());
            System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
            //System.out.println("XP:" + devJoao.calcularTotalXp());

        }

    }

