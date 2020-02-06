package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.SysMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 菜单权限表 Mapper 接口
 * </p>
 *
 * @author wxx
 * @since 2020-01-06
 */
@Mapper
public interface SysMenuMapper {

    /**
     * 根据用户ID查询权限
     *
     * @param userId 用户ID
     * @return 权限列表
     */
    public List<String> selectPermsByUserId(Long userId);
}
