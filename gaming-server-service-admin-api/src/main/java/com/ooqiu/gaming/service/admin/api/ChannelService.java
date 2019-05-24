package com.ooqiu.gaming.service.admin.api;

import com.ooqiu.gaming.server.domain.Channel;

import java.util.List;

/**
 * @Author: BernardLowe
 * @Description:
 * @Date: Created in 14:05 2019/5/13
 * @Modified By: BernardLowe
 */
public interface ChannelService {
    /**
     * @Description: 查询所有频道
     * @auther: BernardLowe
     * @date: 15:15 2019/5/13
     * @param: []
     * @return: java.util.List<com.ooqiu.gaming.server.domain.Channel>
     */
    public List<Channel> selectAll();

    /**
     * @Description: 根据父节点查子节点
     * @auther: BernardLowe
     * @date: 21:42 2019/5/14
     * @param: [pid]
     * @return: java.util.List<com.ooqiu.gaming.server.domain.Channel>
     */
    public List<Channel> selectByPid(Long pid);

    /**
     * @Description: 根据id查询
     * @auther: BernardLowe
     * @date: 15:16 2019/5/13
     * @param: [id]
     * @return: com.ooqiu.gaming.server.domain.Channel
     */
    public Channel getById(String id);

    /**
     * @Description: 保存频道
     * @auther: BernardLowe
     * @date: 18:45 2019/5/14
     * @param: [channel]
     * @return: int
     */
    public int save(Channel channel);

}
