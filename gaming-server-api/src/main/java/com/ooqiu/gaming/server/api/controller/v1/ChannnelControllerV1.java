package com.ooqiu.gaming.server.api.controller.v1;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ooqiu.gaming.server.commons.constant.DubboVersionConstant;
import com.ooqiu.gaming.server.domain.Channel;
import com.ooqiu.gaming.service.channel.ChannelService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: BernardLowe
 * @Description:
 * @Date: Created in 15:36 2019/5/16
 * @Modified By: BernardLowe
 */
@RestController
@RequestMapping(value = "${rest.path.api.v1}/channel")
public class ChannnelControllerV1 {
    @Reference(version = DubboVersionConstant.DUBBO_VERSION_GAMING_SERVER_SERVICE_CHANNEL)
    private ChannelService channelService;

    /**
     * @Description: 获取全部频道
     * @auther: BernardLowe
     * @date: 15:40 2019/5/16
     * @param: []
     * @return: java.util.List<com.ooqiu.gaming.server.domain.Channel>
     */
    @ApiOperation(value = "获取频道列表", notes = "获取全部频道列表")
    @RequestMapping(value = "data",method = RequestMethod.GET)
    public List<Channel> data(){
        return channelService.selectAll();
    }
}
