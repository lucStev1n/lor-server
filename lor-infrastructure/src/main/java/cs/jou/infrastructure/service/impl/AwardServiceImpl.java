package cs.jou.infrastructure.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cs.jou.infrastructure.pojo.Award;
import cs.jou.infrastructure.service.AwardService;
import cs.jou.infrastructure.mapper.AwardMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【award(奖品配置)】的数据库操作Service实现
* @createDate 2023-12-07 23:28:24
*/
@Service
public class AwardServiceImpl extends ServiceImpl<AwardMapper, Award>
    implements AwardService{

}




