package application;

import java.util.Calendar;

import application.model.Compromisso;
import application.model.Tarefa;

public class App {
    public static void main(String[] args) {
        Tarefa t = new Tarefa();
        t.setDescricao("Teste de Tarefa");
        t.setConcluido(false);

        System.out.println(t.getDetalhes());

        Tarefa t2 = new Tarefa("Segunda Tarefa");
        System.out.println(t2.getDetalhes());

        Compromisso c = new Compromisso();
        c.setDescricao("Período de Provas");
        
        Calendar dtInit = Calendar.getInstance();
        dtInit.set(2024, 4, 1);
        Calendar dtFim = Calendar.getInstance();
        dtFim.set(2024, 4, 8);

        c.setDataInicial(dtInit);
        c.setDataFinal(dtFim);

        System.out.println(c.getDetalhes());
    }
}