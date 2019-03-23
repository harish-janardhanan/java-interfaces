package com.hj.core.jdbc;

import java.sql.Connection;




public class JDBCSupport {
    private final String userName;
    private final String password;
    private final String uri;

    JDBCSupport(String userName, String password, String uri){
        this.userName = userName;
        this.password = password;
        this.uri = uri;
    }

    public Connection getConnection (){
        Connection connection = createConnection();
        return  connection;
    }

    private Connection createConnection(){
        return getConnection();
    }
}
