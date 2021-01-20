package io.eventuate.common.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 结果集映射
 *
 * @param <T>
 */
public interface EventuateRowMapper<T> {
    T mapRow(ResultSet rs, int rowNum) throws SQLException;
}
