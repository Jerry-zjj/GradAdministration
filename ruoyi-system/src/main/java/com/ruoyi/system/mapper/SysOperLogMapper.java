package com.ruoyi.system.mapper;
import com.ruoyi.system.domain.SysOperLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * <p>
 * 操作日志记录 Mapper 接口
 * </p>
 *
 * @author wxx
 * @since 2020-01-06
 */
@Mapper
public interface SysOperLogMapper  {

    /**
     * 新增操作日志
     *
     * @param operLog 操作日志对象
     */
    public void insertOperlog(SysOperLog operLog);
}
