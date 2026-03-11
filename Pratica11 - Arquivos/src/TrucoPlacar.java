import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class TrucoPlacar extends JFrame {

    JTextField j1d1, j2d1, tentos1, quedas1;
    JTextField j1d2, j2d2, tentos2, quedas2;

    JCheckBox jogo1, jogo2;

    public TrucoPlacar() {

        setTitle("Placar de Truco");
        setSize(500,350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel painelCentral = new JPanel(new GridLayout(2,1));

        // DUPLA 1
        JPanel dupla1 = new JPanel(new GridLayout(5,2));
        dupla1.setBorder(BorderFactory.createTitledBorder("Dupla 1"));

        j1d1 = new JTextField();
        j2d1 = new JTextField();
        tentos1 = new JTextField();
        quedas1 = new JTextField();
        jogo1 = new JCheckBox("Já tem jogo");

        dupla1.add(new JLabel("Jogador 1:"));
        dupla1.add(j1d1);

        dupla1.add(new JLabel("Jogador 2:"));
        dupla1.add(j2d1);

        dupla1.add(new JLabel("Tentos:"));
        dupla1.add(tentos1);

        dupla1.add(new JLabel("Quedas:"));
        dupla1.add(quedas1);

        dupla1.add(jogo1);

        // DUPLA 2
        JPanel dupla2 = new JPanel(new GridLayout(5,2));
        dupla2.setBorder(BorderFactory.createTitledBorder("Dupla 2"));

        j1d2 = new JTextField();
        j2d2 = new JTextField();
        tentos2 = new JTextField();
        quedas2 = new JTextField();
        jogo2 = new JCheckBox("Já tem jogo");

        dupla2.add(new JLabel("Jogador 1:"));
        dupla2.add(j1d2);

        dupla2.add(new JLabel("Jogador 2:"));
        dupla2.add(j2d2);

        dupla2.add(new JLabel("Tentos:"));
        dupla2.add(tentos2);

        dupla2.add(new JLabel("Quedas:"));
        dupla2.add(quedas2);

        dupla2.add(jogo2);

        painelCentral.add(dupla1);
        painelCentral.add(dupla2);

        add(painelCentral, BorderLayout.CENTER);

        // BARRA INFERIOR
        JPanel barra = new JPanel();

        JButton gravar = new JButton("Gravar");
        JButton ler = new JButton("Ler");
        JButton limpar = new JButton("Limpar");

        barra.add(gravar);
        barra.add(ler);
        barra.add(limpar);

        add(barra, BorderLayout.SOUTH);

        // AÇÃO GRAVAR
        gravar.addActionListener(e -> {
            try {
                var fw = new FileWriter("truco.txt");

                fw.write(j1d1.getText() + "\n");
                fw.write(j2d1.getText() + "\n");
                fw.write(tentos1.getText() + "\n");
                fw.write(quedas1.getText() + "\n");
                fw.write(String.valueOf(jogo1.isSelected()) + "\n");

                fw.write(j1d2.getText() + "\n");
                fw.write(j2d2.getText() + "\n");
                fw.write(tentos2.getText() + "\n");
                fw.write(quedas2.getText() + "\n");
                fw.write(String.valueOf(jogo2.isSelected()) + "\n");

                fw.close();

                JOptionPane.showMessageDialog(null,"Dados gravados!");

            } catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Erro ao gravar");
            }
        });

        // AÇÃO LER
        ler.addActionListener(e -> {
            try (BufferedReader br = new BufferedReader(new FileReader("truco.txt"))) {

                j1d1.setText(br.readLine());
                j2d1.setText(br.readLine());
                tentos1.setText(br.readLine());
                quedas1.setText(br.readLine());
                jogo1.setSelected(Boolean.parseBoolean(br.readLine()));

                j1d2.setText(br.readLine());
                j2d2.setText(br.readLine());
                tentos2.setText(br.readLine());
                quedas2.setText(br.readLine());
                jogo2.setSelected(Boolean.parseBoolean(br.readLine()));

                br.close();

            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"Arquivo nao encontrado!");
            } catch(IOException ex){
                JOptionPane.showMessageDialog(null,"Erro de I/O");
            } catch (SecurityException se){
                JOptionPane.showMessageDialog(null,"Acesso negado!");
            }
        });

        // AÇÃO LIMPAR
        limpar.addActionListener(e -> {

            j1d1.setText("");
            j2d1.setText("");
            tentos1.setText("");
            quedas1.setText("");
            jogo1.setSelected(false);

            j1d2.setText("");
            j2d2.setText("");
            tentos2.setText("");
            quedas2.setText("");
            jogo2.setSelected(false);
        });

        setVisible(true);
    }
}