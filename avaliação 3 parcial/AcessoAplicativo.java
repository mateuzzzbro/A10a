
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcessoAplicativo {

    public static void main(String[] args) {
        // Criação da janela  
        JFrame frame = new JFrame("Acesso ao Aplicativo");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Criação dos componentes  
        JLabel userLabel = new JLabel("Usuário:");
        userLabel.setBounds(10, 20, 80, 25);
        frame.add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        frame.add(userText);

        JLabel passwordLabel = new JLabel("Senha:");
        passwordLabel.setBounds(10, 50, 80, 25);
        frame.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        frame.add(passwordText);

        JButton confirmButton = new JButton("Confirmar");
        confirmButton.setBounds(10, 80, 100, 25);
        frame.add(confirmButton);

        JButton cancelButton = new JButton("Cancelar");
        cancelButton.setBounds(120, 80, 100, 25);
        frame.add(cancelButton);

        // Ação do botão Confirmar  
        confirmButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

                if (username.equals("denys.silva") && password.equals("Teste@2024")) {
                    JOptionPane.showMessageDialog(frame, "Acesso confirmado!");
                    frame.dispose(); // Fecha a janela  
                } else {
                    JOptionPane.showMessageDialog(frame, "Usuário ou senha inválido!");
                }
            }
        });

        // Ação do botão Cancelar  
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Fecha a janela  
            }
        });

        // Exibição da janela  
        frame.setVisible(true);
    }
}
