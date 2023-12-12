package cs.jou.infrastructure.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cs.jou.infrastructure.pojo.Strategy;
import cs.jou.infrastructure.service.StrategyService;
import cs.jou.infrastructure.mapper.StrategyMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【strategy(策略配置)】的数据库操作Service实现
* @createDate 2023-12-07 23:28:24
*/
@Service
public class StrategyServiceImpl extends ServiceImpl<StrategyMapper, Strategy>
    implements StrategyService{

}




