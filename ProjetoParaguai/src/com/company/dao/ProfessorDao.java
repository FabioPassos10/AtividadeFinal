package com.company.dao;

import com.company.model.Aluno;
import com.company.model.Prof;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProfessorDao {

    Connection con = new ConnectionFactory().getConnection();

    public ProfessorDao() {
    }

    public void inserirDado(Prof prof) throws SQLException {
        String sql = "insert into Emds.Professor" +
                "(cod, nome, email)" +
                "values(?,?,?)";
        PreparedStatement stmt = this.con.prepareStatement(sql);
        stmt.setInt(1, prof.getCod());
        stmt.setString(2, prof.getNome());
        stmt.setString(3, prof.getEmail());

        stmt.execute();
        stmt.close();
    }
}
