package com.spring.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {
    Connection MakeConnection() throws SQLException;
}
