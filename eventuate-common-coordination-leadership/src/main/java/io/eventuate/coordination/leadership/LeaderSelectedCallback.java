package io.eventuate.coordination.leadership;

/**
 * Leader选择后回调逻辑
 */
public interface LeaderSelectedCallback {
  void run(LeadershipController leadershipController);
}
