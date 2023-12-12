package cs.jou.infrastructure.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cs.jou.infrastructure.pojo.Activity;
import cs.jou.infrastructure.service.ActivityService;
import cs.jou.infrastructure.mapper.ActivityMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【activity(活动配置)】的数据库操作Service实现
* @createDate 2023-12-07 23:28:24
*/
@Service
public class ActivityServiceImpl extends ServiceImpl<ActivityMapper, Activity>
    implements ActivityService{

}




