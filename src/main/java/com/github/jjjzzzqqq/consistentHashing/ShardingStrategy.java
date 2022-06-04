package com.github.jjjzzzqqq.consistentHashing;

/**
 * 分片策略接口
 *
 * @author jjjzzzqqq.github.io
 */
public interface ShardingStrategy <K>{
    /**
     *
     */
    int getShardIdByKey(K key);

    int getTotalShardCount();
}
