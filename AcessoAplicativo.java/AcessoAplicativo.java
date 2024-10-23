import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcessoAplicativo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Acesso ao aplicativo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Campos de texto para usuário e senha
        JTextField txtUsuario = new JTextField(20);
        JPasswordField txtSenha = new JPasswordField(20);

        // Botões
        JButton btnConfirmar = new JButton("Confirmar");
        JButton btnCancelar = new JButton("Cancelar");

        // Painel para organizar os componentes
        JPanel panel = new JPanel();
        panel.add(new JLabel("Usuário:"));
        panel.add(txtUsuario);
        panel.add(new JLabel("Senha:"));
        panel.add(txtSenha);
        panel.add(btnConfirmar);
        panel.add(btnCancelar);

        // Ação do botão Confirmar
        btnConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                String senha = new String(txtSenha.getPassword());

                if (usuario.equals("denys.silva") && senha.equals("Teste@2024")) {
                    JOptionPane.showMessageDialog(null, "Acesso confirmado!");
                    frame.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha inválido!");
                }
            }
        });

        // Ação do botão Cancelar
        btnCancelar.addActionListener(e -> frame.dispose());

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
}
