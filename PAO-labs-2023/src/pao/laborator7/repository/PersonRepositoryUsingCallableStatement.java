package pao.laborator7.repository;

import pao.laborator7.config.DatabaseConfiguration;
import pao.laborator7.entity.Person;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class PersonRepositoryUsingCallableStatement {
    public void insertPerson(Person person) {
        String preparedSql = "{call insertPerson(?,?,?)}";

        Connection connection = DatabaseConfiguration.getDatabaseConnection();
        try {
            CallableStatement cstmt = connection.prepareCall(preparedSql);
            cstmt.setString(2, person.getName());
            cstmt.setDouble(3, person.getAge());

            cstmt.registerOutParameter(1, Types.INTEGER); // id - result of the procedure call

            cstmt.execute();
            System.out.println("Added user with id:" + cstmt.getInt(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
