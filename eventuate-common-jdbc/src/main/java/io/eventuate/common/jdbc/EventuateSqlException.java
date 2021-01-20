package io.eventuate.common.jdbc;

import java.sql.SQLException;

/**
 * SQL 异常定义
 */
public class EventuateSqlException extends RuntimeException {

  public EventuateSqlException(SQLException e) {
    super(e);
  }

  public EventuateSqlException(Exception e) {
    super(e);
  }
}
