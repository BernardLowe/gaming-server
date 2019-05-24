package com.ooqiu.gaming.service.admin;

import com.ooqiu.gaming.server.domain.Channel;
import com.ooqiu.gaming.service.admin.mapper.ChannelMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: BernardLowe
 * @Description:
 * @Date: Created in 16:28 2019/5/10
 * @Modified By: BernardLowe
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GamingServerServiceAdminApplicationTest {
    @Autowired
    private ChannelMapper channelMapper;

    @Test
    public void testChannelSelectAll() {
        List<Channel> channelList = channelMapper.selectAll();
        System.out.println(channelList);
    }
}
