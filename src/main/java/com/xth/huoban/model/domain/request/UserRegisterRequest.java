package com.xth.huoban.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author Mo_Cang
 * @since 2023/5/11 14:40
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = -8614496317552111415L;
    private String userAccount;
    private String userPassword;
    private String checkPassword;
}
