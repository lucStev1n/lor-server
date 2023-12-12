package cs.jou.domain.strategy.service.handle.impl;

import cs.jou.domain.strategy.service.handle.BaseAlgorithm;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.List;

@Component
public class SingleRateRandomDrawAlgorithm extends BaseAlgorithm {
    @Override
    public String randomDraw(Long strategyId, List<String> excludeAwardIds) {
        String[] rateTuple = rateTupleMap.get(strategyId);
        assert  rateTuple != null;

        int random = new SecureRandom().nextInt(100) + 1;
        int idx = hashIdx(random);

        String award = rateTuple[idx];
        if (excludeAwardIds.contains(award)) {
            return "未中奖";
        }

        return award;
    }
}
