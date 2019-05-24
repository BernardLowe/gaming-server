package com.ooqiu.gaming.service.channel;

import com.ooqiu.gaming.server.domain.Channel;

import java.util.List;

/**
 * @Author: BernardLowe
 * @Description:
 * @Date: Created in 17:08 2019/5/15
 * @Modified By: BernardLowe
 */
public interface ChannelService {

    /**
     * @Description: 查询所有接口
     * @auther: BernardLowe
     * @date: 17:09 2019/5/15
     * @param: []
     * @return: java.util.List<com.ooqiu.gaming.server.domain.Channel>
     */
    public List<Channel> selectAll();
}
