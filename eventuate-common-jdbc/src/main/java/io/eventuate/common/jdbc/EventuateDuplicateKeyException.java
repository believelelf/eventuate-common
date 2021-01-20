package io.eventuate.common.jdbc;

import java.sql.SQLException;

/**
 * 主键冲突异常
 */
public class EventuateDuplicateKeyException extends EventuateSqlException {
  public EventuateDuplicateKeyException(SQLException sqlException) {
    super(sqlException);
  }

  public EventuateDuplicateKeyException(Exception exception) {
    super(exception);
  }
}
