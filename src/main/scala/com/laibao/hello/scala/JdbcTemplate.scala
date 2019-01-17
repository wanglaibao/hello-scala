package com.laibao.hello.scala

import java.sql.{Connection, PreparedStatement, ResultSet}

trait JdbcTemplate {

  def query(psc: PreparedStatementCreator, rowMapper: RowMapper): List[AnyRef]


  def query(psc: Connection => PreparedStatement, rowMapper: (ResultSet, Int) => AnyRef): List[AnyRef]


  def queryWithFunctionalWay[ResultItem](psc: Connection => PreparedStatement, rowMapper: (ResultSet, Int) => ResultItem): List[ResultItem]
}
