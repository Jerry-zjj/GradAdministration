package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.SysUserOnline;
import com.ruoyi.system.mapper.SysUserOnlineMapper;
import com.ruoyi.system.service.ISysUserOnlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 在线用户记录 服务实现类
 * </p>
 *
 * @author wxx
 * @since 2020-01-06
 */
@Service
public class SysUserOnlineServiceImpl  implements ISysUserOnlineService {


    @Autowired
    private SysUserOnlineMapper userOnlineDao;

    /**
     * 保存会话信息
     *
     * @param online 会话信息
     */
    @Override
    public void saveOnline(SysUserOnline online)
    {
        userOnlineDao.saveOnline(online);
    }

}
