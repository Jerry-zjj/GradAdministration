package com.ruoyi.system.service;

import com.ruoyi.system.domain.SysOperLog;

/**
 * <p>
 * 操作日志记录 服务类
 * </p>
 *
 * @author wxx
 * @since 2020-01-06
 */
public interface ISysOperLogService  {

    /**
     * 新增操作日志
     *
     * @param operLog 操作日志对象
     */
    public void insertOperlog(SysOperLog operLog);


}
