package com.company;

import com.company.view.FormMenu;

import javax.swing.*;
import java.awt.*;

public class GerenciarEscola {

    public static void main(String[] args) {
        JFrame telaPrincipal = new JFrame("Sistema de Gerenciamento da Escola");
        telaPrincipal.setContentPane(new FormMenu().getMenuPanel());
        telaPrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        telaPrincipal.setExtendedState(Frame.MAXIMIZED_BOTH);
        telaPrincipal.setVisible(true);
    }
}
