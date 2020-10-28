package br.fiap.com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class FiapDBManager {

  public static Connection obterConexao() {
    Connection conexao = null;
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");

      conexao = DriverManager.getConnection(
          "jdbc:oracle:thin:@localhost:1521:XE",
          "rm85401", "rm85401");

    } catch (Exception e) {
      e.printStackTrace();
    }
    return conexao;
  }

}
