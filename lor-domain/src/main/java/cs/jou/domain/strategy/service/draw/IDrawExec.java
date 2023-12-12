package cs.jou.domain.strategy.service.draw;

import cs.jou.domain.strategy.model.DrawReq;
import cs.jou.domain.strategy.model.DrawResult;

public interface IDrawExec {
    DrawResult exec(DrawReq cmd);
}
