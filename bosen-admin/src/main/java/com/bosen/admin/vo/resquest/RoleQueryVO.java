package com.bosen.admin.vo.resquest;

import com.bosen.common.domain.PageVO;
import lombok.Data;

/**
 * @author Lucas
 * @version 2.0.0
 * @date 2023/2/26
 */
@Data
public class RoleQueryVO extends PageVO {
    /**
     * 角色名称
     */
    private String name;
}
