package com.ruoyi.system.mapper;
import com.ruoyi.system.domain.SysRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 角色信息表 Mapper 接口
 * </p>
 *
 * @author wxx
 * @since 2020-01-06
 */
@Mapper
public interface SysRoleMapper {

    /**
     * 根据用户ID查询角色
     *
     * @param userId 用户ID
     * @return 角色列表
     */
    public List<SysRole> selectRolesByUserId(Long userId);
}
