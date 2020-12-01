package com.company.dao;

import com.company.model.Disciplinas;
import com.company.model.Prof;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DisciplinasDao {
    Connection con = (new ConnectionFactory()).getConnection();

    public DisciplinasDao() {
    }

    public void inserirDado(Disciplinas disciplinas) throws SQLException {
        String sql = "insert into Emds.Disciplina + " +
                "(nome_materia, nome_professor, Numero_sala)" +
                "values (?,?,?)";
        PreparedStatement stmt = this.con.prepareStatement(sql);
        stmt.setInt(1, disciplinas.getNumSala());
        stmt.setString(2, disciplinas.getNomeMateria());
        stmt.setString(3, disciplinas.getProfessor());

        stmt.execute();
        stmt.close();
    }
}


