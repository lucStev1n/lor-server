package cs.jou.domain.strategy.service.handle;

import cs.jou.domain.strategy.model.AwardRateInfo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class BaseAlgorithm implements IDRawAlgorithm {
    private static final int HASH_INCREMENT = 0x61c88647;
    private static final int RATE_TUPLE_LENGTH = 128;

    //    奖品和概率的散列结果
    protected Map<Long, String[]> rateTupleMap = new ConcurrentHashMap<>();

    //    奖品区间概率  id -> [award->begin, award->end]
    protected Map<Long, List<AwardRateInfo>> awardRateMap = new ConcurrentHashMap<>();

    @Override
    public void init(Long strategyId, List<AwardRateInfo> awardRates) {
        awardRateMap.put(strategyId, awardRates);
        String[] rateTuple = rateTupleMap.computeIfAbsent(strategyId, k -> new String[RATE_TUPLE_LENGTH]);

        int cursor = 0;
        for (AwardRateInfo award : awardRates) {
            int rate = award.getAwardRate().multiply(new BigDecimal(100)).intValue();

            for (int i = cursor + 1; i <= rate + cursor; i++) {
                rateTuple[hashIdx(i)] = award.getAwardId();
            }

            cursor += rate;
        }
    }

    protected int hashIdx(int i) {
        return (i * HASH_INCREMENT + HASH_INCREMENT) & (RATE_TUPLE_LENGTH - 1);
    }

    @Override
    public boolean isBuild(Long strategyId) {
        return rateTupleMap.containsKey(strategyId);
    }

}
