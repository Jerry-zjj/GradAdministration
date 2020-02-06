package com.ruoyi.system.service;

import com.ruoyi.system.domain.SysUserOnline;

/**
 * <p>
 * 在线用户记录 服务类
 * </p>
 *
 * @author wxx
 * @since 2020-01-06
 */
public interface ISysUserOnlineService  {
    /**
     * 保存会话信息
     *
     * @param online 会话信息
     */
    public void saveOnline(SysUserOnline online);
}
