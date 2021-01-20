package io.eventuate.common.common.spring.jdbc;

import io.eventuate.common.jdbc.EventuateTransactionTemplate;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.function.Supplier;

/**
 * 事务模板执行，包装Spring TransactionTemplate
 */
public class EventuateSpringTransactionTemplate implements EventuateTransactionTemplate {

  private TransactionTemplate transactionTemplate;

  public EventuateSpringTransactionTemplate(TransactionTemplate transactionTemplate) {
    this.transactionTemplate = transactionTemplate;
  }

  @Override
  public <T> T executeInTransaction(Supplier<T> callback) {
    return transactionTemplate.execute(status -> callback.get());
  }
}
