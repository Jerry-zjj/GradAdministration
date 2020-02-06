package com.ruoyi.system.service;

import java.util.Set;

/**
 * <p>
 * 角色信息表 服务类
 * </p>
 *
 * @author wxx
 * @since 2020-01-06
 */
public interface ISysRoleService  {

    /**
     * 根据用户ID查询角色
     *
     * @param userId 用户ID
     * @return 权限列表
     */
    public Set<String> selectRoleKeys(Long userId);


}
