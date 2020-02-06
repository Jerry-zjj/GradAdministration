package com.ruoyi.system.mapper;
import com.ruoyi.system.domain.SysLogininfor;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 系统访问记录 Mapper 接口
 * </p>
 *
 * @author wxx
 * @since 2020-01-06
 */
@Mapper
public interface SysLogininforMapper  {

    /**
     * 新增系统登录日志
     *
     * @param logininfor 访问日志对象
     */
    public void insertLogininfor(SysLogininfor logininfor);
}
