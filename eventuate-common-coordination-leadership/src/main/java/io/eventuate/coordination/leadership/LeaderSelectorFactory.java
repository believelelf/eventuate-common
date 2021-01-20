package io.eventuate.coordination.leadership;

/**
 * Leader选择器 创建
 */
public interface LeaderSelectorFactory {
  EventuateLeaderSelector create(String lockId,
                                 String leaderId,
                                 LeaderSelectedCallback leaderSelectedCallback,
                                 Runnable leaderRemovedCallback);
}
