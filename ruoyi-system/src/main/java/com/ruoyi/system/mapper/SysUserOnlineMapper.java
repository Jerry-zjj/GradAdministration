package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.SysUserOnline;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 在线用户记录 Mapper 接口
 * </p>
 *
 * @author wxx
 * @since 2020-01-06
 */
@Mapper
public interface SysUserOnlineMapper {

    /**
     * 保存会话信息
     *
     * @param online 会话信息
     * @return 结果
     */
    public int saveOnline(SysUserOnline online);
}
