import java.util.ArrayList;

public class ListaMedicos {
    static ArrayList<Medico> medicos = new ArrayList<>();

    public void addMedico(Medico medico) {
        if (medico != null) {
            medicos.add(medico);
        }
    }

    public void rmvMedico(Medico medico) {
        medicos.removeIf((item) -> item.getNomeCompleto().equalsIgnoreCase(medico.getNomeCompleto()));

    }

    public static Medico buscar(Medico medico) {
        for (Medico itemDaLista : medicos) {
            if (itemDaLista.getNomeCompleto().equalsIgnoreCase(medico.getNomeCompleto())) {
                return medico;
            }
        }
        return null;
    }

    public void editar(Medico editMedico) {
        int indice = medicos.indexOf(ListaMedicos.buscar(editMedico));
        medicos.set(indice, editMedico);
    }

    public static String listar() {
        StringBuilder builder = new StringBuilder();
        for (Medico medico : ListaMedicos.medicos) {
            builder.append("Nome: " + medico.getNomeCompleto() + "\nTelefone: " + medico.getTelefoneContato() + "\nCRM: " + medico.getCrm() + "\n");
        }
        return builder.toString();
    }

}