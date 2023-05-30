package com.xth.huoban.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Mo_Cang
 * @since 2023/5/11 14:59
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 4996190053430899730L;
    private String userAccount;
    private String userPassword;
}
