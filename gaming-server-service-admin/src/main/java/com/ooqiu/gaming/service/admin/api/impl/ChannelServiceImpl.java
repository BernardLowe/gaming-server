package com.ooqiu.gaming.service.admin.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ooqiu.gaming.server.commons.constant.DubboVersionConstant;
import com.ooqiu.gaming.server.domain.Channel;
import com.ooqiu.gaming.service.admin.api.ChannelService;
import com.ooqiu.gaming.service.admin.mapper.ChannelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;
import utils.IDUtils;

import java.util.Date;
import java.util.List;

/**
 * @Author: BernardLowe
 * @Description:
 * @Date: Created in 14:07 2019/5/13
 * @Modified By: BernardLowe
 */
@Service(version = DubboVersionConstant.DUBBO_VERSION_GAMING_SERVER_SERVICE_ADMIN)
public class ChannelServiceImpl implements ChannelService {
    @Autowired
    private ChannelMapper channelMapper;

    @Override
    public List<Channel> selectAll() {
        return channelMapper.selectAll();
    }

    @Override
    public List<Channel> selectByPid(Long pid) {
        Example example = new Example(Channel.class);
        example.createCriteria().andEqualTo("pid",pid);
        return channelMapper.selectByExample(example);
    }

    @Override
    public Channel getById(String id) {
        return null;
    }

    @Override
    public int save(Channel channel) {
        channel.setId(IDUtils.genId());
        channel.setIsParent("1");
        channel.setCreateDate(new Date());
        channel.setUpdateDate(new Date());
        if(channel.getPid()==null||channel.getPid()==0L){
            channel.setPid(0L);
            channel.setIsParent("0");
        }
        channelMapper.insert(channel);
        return 0;
    }
}
