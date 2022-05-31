package questao4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Contato> Agenda = new ArrayList<>();

        inserirContato(Agenda, new Contato(1, 21,"2222222222"));


    }

    public static void inserirContato(List<Contato> agenda, Contato contato) {
        agenda.add(contato);
    }
    public static void removerContato(List<Contato> agenda, Contato contato) {
        agenda.remove(contato);
    }


}
