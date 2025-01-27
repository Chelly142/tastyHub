package com.example.tastyhub.fixture.user;

import com.example.tastyhub.common.domain.user.dtos.DuplicatedNickName;
import com.example.tastyhub.common.domain.user.dtos.DuplicatedUserName;
import com.example.tastyhub.common.domain.user.dtos.LoginRequest;
import com.example.tastyhub.common.domain.user.dtos.SignupRequest;
import com.example.tastyhub.common.domain.user.entity.User;
import com.example.tastyhub.common.domain.user.entity.User.userType;

public class UserFixture {

    public static final DuplicatedUserName DUPLICATED_USER_NAME =
        DuplicatedUserName.builder()
            .username("username")
            .build();

    public static final DuplicatedNickName DUPLICATED_NICK_NAME =
        DuplicatedNickName.builder()
            .nickname("nickname").build();

    public static final SignupRequest SIGNUP_REQUEST =
        SignupRequest.builder()
            .username("username")
            .userImg(null)
            .password("password")
            .email("email01@gmail.com")
            .nickname("nickname")
            .build();

    public static final LoginRequest LOGIN_REQUEST =
        LoginRequest.builder()
            .username("username")
            .password("password")
            .build();
    public static final User USER =
        User.builder()
            .username("username")
            .password("password")
            .userType(userType.COMMON)
            .userImg(null)
            .email("email@gmail.com")
            .nickname("nickname")
            .build();
}
