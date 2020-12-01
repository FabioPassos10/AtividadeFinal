package com.company.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormMenu extends Container {
    private JButton alunoButton;
    private JButton sairButton;
    private JButton disciplinasButton;
    private JButton professorButton;
    private JPanel menuPanel;

    public JPanel getMenuPanel() {
        return menuPanel;
    }

    public FormMenu() {
        alunoButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame telaAluno = new JFrame("Cadastro de Alunos");
                telaAluno.setContentPane(new FormAluno().getAlunoPanel());
                telaAluno.setSize(500, 500);
                telaAluno.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                telaAluno.setVisible(true);

            }
        });
        sairButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.exit(0);
            }
        });
        professorButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame telaProf = new JFrame("Cadastro Professor");
                telaProf.setContentPane(new FormProf().getProfPanel());
                telaProf.setSize(500, 500);
                telaProf.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                telaProf.setVisible(true);
            }
        });
        disciplinasButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame telaDisciplina = new JFrame("Cadastro Disciplina");
                telaDisciplina.setContentPane(new FormDisciplina().getDisciplinaPanel());
                telaDisciplina.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                telaDisciplina.setVisible(true);
            }
        });
    }
}
