package cs.jou.domain.strategy.service.draw;

import cs.jou.domain.strategy.service.handle.IDRawAlgorithm;
import cs.jou.domain.strategy.service.handle.impl.DefaultRateRandomDrawAlgorithm;
import cs.jou.domain.strategy.service.handle.impl.SingleRateRandomDrawAlgorithm;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DrawProvider {
    ThreadLocal<Integer> model = new ThreadLocal<>();
    private final Map<Integer, IDRawAlgorithm> drawMap = new ConcurrentHashMap<>();
    public DrawProvider() {
        drawMap.put(1, new DefaultRateRandomDrawAlgorithm());
        drawMap.put(2, new SingleRateRandomDrawAlgorithm());
    }

    void setModel(Integer model) {
        this.model.set(model);
    }

    public IDRawAlgorithm getAlgorithm() {
        return drawMap.get(this.model.get());
    }
}
