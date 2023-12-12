package cs.jou.domain.strategy.service.handle.impl;

import cs.jou.domain.strategy.model.AwardRateInfo;
import cs.jou.domain.strategy.service.handle.BaseAlgorithm;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

@Component
public class DefaultRateRandomDrawAlgorithm extends BaseAlgorithm {
    @Override
    public String randomDraw(Long strategyId, List<String> excludeAwardIds) {
        BigDecimal differenceDenominator = BigDecimal.ZERO;

        List<AwardRateInfo> differenceAwardRateList = new ArrayList<>();
        List<AwardRateInfo> awardRateIntervalList = awardRateMap.get(strategyId);

        for (AwardRateInfo awardRateInfo : awardRateIntervalList) {
            String awardId = awardRateInfo.getAwardId();
            if (excludeAwardIds.contains(awardId)) {
                continue;
            }

            differenceAwardRateList.add(awardRateInfo);
            differenceDenominator = differenceDenominator.add(awardRateInfo.getAwardRate());
        }

        if (differenceAwardRateList.isEmpty())
            return "";
        if (differenceAwardRateList.size() == 1)
            return differenceAwardRateList.get(0).getAwardId();

        int random = new SecureRandom().nextInt(100) + 1;
        String awardId = "";
        int cursor = 0;

        for (AwardRateInfo awardRateInfo : differenceAwardRateList) {
            int rate = awardRateInfo.getAwardRate().divide(differenceDenominator, 2, BigDecimal.ROUND_UP)
                                    .multiply(new BigDecimal(100))
                                    .intValue();
            if (random <= (cursor + rate)) {
                awardId = awardRateInfo.getAwardId();
                break;
            }

            cursor += rate;
        }

        return awardId;
    }
}
