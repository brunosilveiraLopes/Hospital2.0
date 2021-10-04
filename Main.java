import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

        Endereco end1 = new Endereco("Rua tal", "007", "Robertao", "OndeTudoAcontece", "Estado RJ", "222233192");
        Endereco end2 = new Endereco("Rua Idái", "23", "Zona", "Esquecida", "Torres", "326665231");

        Paciente pac1 = new Paciente("Bruno Silveira", "323132231", "11-983327183", end1);
        Paciente pac2 = new Paciente("arievliS onurB", "332235129", "51-515151232", end2);

        ListaPacientes.pacientes.add(pac1);
        ListaPacientes.pacientes.add(pac2);

        System.out.println(ListaPacientes.listar());

        Medico med1 = new Medico("222233344", "RicardaoDoSedex", "30-0983326132");
        Medico med2 = new Medico("111222111", "Silveira", "21-8875982013");

        ListaMedicos.medicos.add(med1);
        ListaMedicos.medicos.add(med2);

        System.out.println(ListaMedicos.listar());

        Internacao internacao1 = new Internacao(pac1, med1);
        Internacao internacao2 = new Internacao(pac2, med2);

        ListaInternacoes.internacoes.add(internacao1);
        ListaInternacoes.internacoes.add(internacao2);

        LocalDate dataAlta1 = internacao1.getDataInternacao();

        internacao1.setDataAlta(dataAlta1);
        System.out.println(ListaInternacoes.listar());

        System.out.printf(
                        "O Sr. %s Atualmente Está na %s nº %s, no bairro %s - %s/%s, enquanto estava internado desde %s no hospital. Foi liberado para alta na data de: %s pelo médico: %s, supervisionado pelo médico %s.\n",
                        pac1.getNomeCompleto(), end1.getRua(), end1.getNumero(), end1.getBairro(),end1.getCidade(), end1.getEstado(), internacao2.getDataInternacao(), internacao1.getDataInternacao(), med1.getNomeCompleto(), med2.getNomeCompleto());

        System.out.printf(
                        "O Sr. %s de telefone de contato %s, foi internado em: %s.\n. E o médico que acompanhará esse processo será o %s",
                        pac2.getNomeCompleto(), pac2.getTelefone(), internacao2.getDataInternacao(), med1.getNomeCompleto());

}
}
