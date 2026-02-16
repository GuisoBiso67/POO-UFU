import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

public class Interface {
    JFrame janela = new JFrame("AGENDA");

    private JButton botaoProcurar = new JButton("Procurar");
    private JButton botaoApagar = new JButton("Apagar");
    private JButton botaoCadastrar = new JButton("Cadastrar");

    private JTextField campoNome = new JTextField(20);
    private JTextField campoTelefone = new JTextField(20);
    private JTextField campoEndereco = new JTextField(20);

    JLabel aviso =  new JLabel();
    JLabel nomeEncontrado = new JLabel();

    JTextField campoText = new JTextField(20);
    //JPanel painel = new JPanel();

    public Interface(Agenda agenda) {
        janela.setSize(500,350);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);

        janela.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("INSIRA OS DADOS", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        janela.add(titulo, BorderLayout.NORTH);

        JPanel painelCentro = new JPanel();
        painelCentro.setLayout(new GridLayout(4,2,10,15));
        painelCentro.setBorder(BorderFactory.createEmptyBorder(30, 40, 30, 40));
        painelCentro.add(new JLabel("Nome:"));
        painelCentro.add(campoNome);
        painelCentro.add(new JLabel("Telefone:"));
        painelCentro.add(campoTelefone);
        painelCentro.add(new JLabel("Endereço:"));
        painelCentro.add(campoEndereco);
        painelCentro.add(aviso, BorderLayout.CENTER);
        aviso.setVisible(false);
        painelCentro.add(nomeEncontrado, BorderLayout.NORTH);
        nomeEncontrado.setVisible(false);

        janela.add(painelCentro, BorderLayout.CENTER);

        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 15));
        painelBotoes.add(botaoProcurar);
        painelBotoes.add(botaoApagar);
        painelBotoes.add(botaoCadastrar);
        janela.add(painelBotoes, BorderLayout.SOUTH);

        botaoApagar.addActionListener (e -> {
                campoNome.setText("");
                campoTelefone.setText("");
                campoEndereco.setText("");
        });
        botaoCadastrar.addActionListener (e -> {
            String nome = campoNome.getText();
            String telefone = campoTelefone.getText();
            String endereco = campoEndereco.getText();
            Pessoa newPessoa = new Pessoa(nome, telefone, endereco);
            agenda.addPessoa(newPessoa);

            aviso.setText("Nome Cadastrado");
            aviso.setVisible(true);
            Timer timer = new Timer(2000, a -> aviso.setVisible(false));
            timer.setRepeats(false);
            timer.start();
        });
        botaoProcurar.addActionListener (e -> {
            String nome = campoNome.getText();
            String telefone = campoTelefone.getText();
            String endereco = campoEndereco.getText();
            Pessoa pessoaEncontrada = null;
            for(Pessoa p : agenda.getAgenda()){
                if(p.nome.equals(nome) || p.endereco.equals(endereco) || p.telefone.equals(telefone)) {
                     pessoaEncontrada = new Pessoa(p.nome, p.telefone, p.endereco);
                    break;
                }
            }
            if(pessoaEncontrada != null) {
                nomeEncontrado.setText(pessoaEncontrada.nome + " / " + pessoaEncontrada.telefone + " / " + pessoaEncontrada.endereco);
            }else{
                nomeEncontrado.setText("Contato inexistente");
            }
            nomeEncontrado.setVisible(true);
            Timer timer = new Timer(5000, a -> nomeEncontrado.setVisible(false));
            timer.setRepeats(false);
            timer.start();
        });
        janela.setVisible(true);
    }
}
