package com.ruoyi.system.domain;
import com.ruoyi.common.core.domain.BaseEntity;

import java.io.Serializable;

/**
 * <p>
 * 角色和部门关联表
 * </p>
 *
 * @author wxx
 * @since 2020-01-06
 */

public class SysRoleDept extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 部门ID
     */
    private Long deptId;


    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "SysRoleDept{" +
        "roleId=" + roleId +
        ", deptId=" + deptId +
        "}";
    }
}
