import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SistemaPessoa {
    // ... (código existente)

    private void criarJanelaCadastro() {
        JFrame frameCadastro = new JFrame("Cadastro de Usuários");
        // ... (adicionar componentes e layout)

        // Botão Sair
        JButton btnSair = new JButton("Sair");
        btnSair.addActionListener(e -> frameCadastro.dispose());

        // ... (adicionar outros botões e suas ações)

        frameCadastro.pack();
        frameCadastro.setVisible(true);
    }

    // ... (outros métodos)
}import javax.swing.*;
import java.awt.*;

public class SistemaPessoa {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistema de Pessoas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria o menu (similar ao código anterior)

        // Cria o painel de cadastro
        JPanel panelCadastro = new JPanel();
        panelCadastro.setLayout(new GridLayout(5, 2)); // 5 linhas, 2 colunas

        // Adiciona os componentes ao painel de cadastro
        panelCadastro.add(new JLabel("Usuário:"));
        panelCadastro.add(new JTextField(20));
        // ... (adicione os outros componentes)

        // Cria os botões de ação
        JButton btnIncluir = new JButton("Incluir");
        // ... (crie os outros botões)

        // Adiciona os botões ao painel de cadastro
        panelCadastro.add(btnIncluir);
        // ... (adicione os outros botões)

        // Cria o rodapé (similar ao código anterior)

        frame.add(panelCadastro, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
