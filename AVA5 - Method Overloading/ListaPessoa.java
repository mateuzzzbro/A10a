import java.awt.*;
import javax.swing.*;

public class ListaPessoa {
    private final JFrame principal;

    public ListaPessoa(JFrame principal) {
        this.principal = principal;
        inicializarLista();
    }

    private void inicializarLista() {
        JDialog listaPessoas = new JDialog(principal, "Lista de Pessoas", true);
        listaPessoas.setSize(750, 650);
        listaPessoas.setLayout(new BorderLayout());

        listaPessoas.add(new JLabel("Lista de Pessoas", SwingConstants.CENTER), BorderLayout.NORTH);
        listaPessoas.add(new JTextArea("Exemplo de lista de pessoas..."), BorderLayout.CENTER);

        JButton btnFechar = new JButton("Fechar");
        btnFechar.addActionListener(e -> listaPessoas.setVisible(false));
        listaPessoas.add(btnFechar, BorderLayout.SOUTH);

        listaPessoas.setLocationRelativeTo(principal);
        listaPessoas.setVisible(true);
    }
}
