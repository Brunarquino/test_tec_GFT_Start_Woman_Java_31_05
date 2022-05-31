package questao4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Contato> Agenda = new ArrayList<>();






    }

    public void inserirContato(List<Contato> agenda, Contato contato) {
        agenda.add(contato);
    }
    public void removerContato(List<Contato> agenda, Contato contato) {
        agenda.remove(contato);
    }


}
