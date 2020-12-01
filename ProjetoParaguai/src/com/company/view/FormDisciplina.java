package com.company.view;

import com.company.model.Disciplinas;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormDisciplina {
    private JTextField textMateria;
    private JTextField textProf;
    private JTextField textNum;
    private JButton gravarButton;
    private JButton sairButton;
    private JPanel disciplinaPanel;

    public JPanel getDisciplinaPanel() {
        return disciplinaPanel;
    }

    public FormDisciplina() {
        gravarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Disciplinas disciplinas = new Disciplinas();
                disciplinas.setNomeMateria(textMateria.getText());
                disciplinas.setProfessor(textProf.getText());
                disciplinas.setNumSala(Integer.parseInt(textNum.getText()));
                JOptionPane.showMessageDialog(
                        null,
                        "Dados Disciplina \n" + disciplinas.toString(),
                        "Cadastro Disciplina",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
        sairButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.exit(0);
            }
        });
        limparTela();
    }

    private void limparTela() {
        textMateria.setText("");
        textNum.setText("");
        textProf.setText("");
    }
}
