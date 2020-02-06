package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.SysLogininfor;
import com.ruoyi.system.mapper.SysLogininforMapper;
import com.ruoyi.system.service.ISysLogininforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统访问记录 服务实现类
 * </p>
 *
 * @author wxx
 * @since 2020-01-06
 */
@Service
public class SysLogininforServiceImpl  implements ISysLogininforService {
    @Autowired
    private SysLogininforMapper logininforMapper;

    /**
     * 新增系统登录日志
     *
     * @param logininfor 访问日志对象
     */
    @Override
    public void insertLogininfor(SysLogininfor logininfor)
    {
        logininforMapper.insertLogininfor(logininfor);
    }
}
