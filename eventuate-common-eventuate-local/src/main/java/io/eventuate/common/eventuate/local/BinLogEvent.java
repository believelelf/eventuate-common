package io.eventuate.common.eventuate.local;

import java.util.Optional;

/**
 * 获取binlog偏移量
 */
public interface BinLogEvent {
  Optional<BinlogFileOffset> getBinlogFileOffset();
}
