package com.ruoyi.system.service;

import com.ruoyi.system.domain.SysLogininfor;

/**
 * <p>
 * 系统访问记录 服务类
 * </p>
 *
 * @author wxx
 * @since 2020-01-06
 */
public interface ISysLogininforService  {

    /**
     * 新增系统登录日志
     *
     * @param logininfor 访问日志对象
     */
    public void insertLogininfor(SysLogininfor logininfor);
}
