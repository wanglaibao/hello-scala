package com.laibao.hello.scala

import java.sql.{Connection, PreparedStatement, SQLException}

trait PreparedStatementCreator {
   def createPreparedStatement(conn:Connection):PreparedStatement throws SQLException;
}
