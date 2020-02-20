package io.eventuate.common.jdbc.sqldialect;

public class MsSqlDialect implements EventuateSqlDialect {
  @Override
  public String addLimitToSql(String sql, String limitExpression) {
    String newSql = sql.replaceFirst("(?i:select)", String.format("select top (%s)", limitExpression));
    if (newSql.equals(sql))
      throw new IllegalArgumentException("Didn't replace in " + newSql);
    return newSql;
  }

  @Override
  public String getCurrentTimeInMillisecondsExpression() {
    return "(SELECT DATEDIFF_BIG(ms, '1970-01-01', GETUTCDATE()))";
  }

  @Override
  public boolean supports(String driver) {
    return "com.microsoft.sqlserver.jdbc.SQLServerDriver".equals(driver);
  }

  @Override
  public int getOrder() {
    return Integer.MIN_VALUE;
  }
}
