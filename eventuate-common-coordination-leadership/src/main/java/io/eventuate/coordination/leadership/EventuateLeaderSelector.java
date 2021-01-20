package io.eventuate.coordination.leadership;

/**
 * Leader选择器
 */
public interface EventuateLeaderSelector {
  void start();
  void stop();
}
