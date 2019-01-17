package com.laibao.hello.scala

import java.sql.{ResultSet, SQLException}

trait RowMapper {

  def mapRow(rs:ResultSet, rowNum:Int):AnyRef throws SQLException;

}
