package io.eventuate.common.jdbc;

import java.util.function.Supplier;

/**
 * 事务执行模板
 */
public interface EventuateTransactionTemplate {
  <T> T executeInTransaction(Supplier<T> callback);
}
