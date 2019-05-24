package com.ooqiu.gaming.server.web.admin.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: BernardLowe
 * @Description: 前端树结构
 * @Date: Created in 21:33 2019/5/14
 * @Modified By: BernardLowe
 */
@Data
public class TreeDTO implements Serializable {
    private long id;
    private String icon;
    private String text;
    private boolean children;
}
