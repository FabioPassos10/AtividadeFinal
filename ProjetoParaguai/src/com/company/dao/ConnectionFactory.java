package com.company.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection() {
        try	{
            return	DriverManager.getConnection(
                    "jdbc:mysql://localhost/emds",	"root",	"root");
        }	catch	(SQLException e)	{
            throw new	RuntimeException(e);
        }
    }
}
