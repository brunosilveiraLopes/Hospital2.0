import java.util.ArrayList;

public class ListaInternacoes {

    static ArrayList<Internacao> internacoes = new ArrayList<>();

    public void cadastrar(Internacao internacao) {
        if (internacao != null) {
            internacoes.add(internacao);
        }
    }

    public void removerInternacao(Internacao internacao) {
        internacoes.removeIf((item) -> item.getDataInternacao().equals(internacao.getDataInternacao()));
    }

    public static Internacao buscar(Internacao internacao) {
        for (Internacao item : internacoes) {
            if (item.getDataInternacao().equals(internacao.getDataInternacao())) {
                return internacao;
            }

        }
        return null;
    }

    public void editarInternacao(Internacao internacao) {
        int indice = internacoes.indexOf(ListaInternacoes.buscar(internacao));
        if (indice != -1) {
            internacoes.set(indice, internacao);
        }
    }

    public static String listar() {
        StringBuilder builder = new StringBuilder();
        for (Internacao internacao : ListaInternacoes.internacoes) {
            builder.append("Dados do Médico: \n" + internacao.dadosDoMedico() + " - Data da Internação: " + internacao.getDataInternacao() + " - Data da alta(se houver): " + internacao.getDataAlta() + "\n");
        }
        return builder.toString();
    }
}
