package com.ooqiu.gaming.server.web.admin.module.channel.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.google.common.collect.Lists;
import com.ooqiu.gaming.server.commons.constant.DubboVersionConstant;
import com.ooqiu.gaming.server.domain.Channel;
import com.ooqiu.gaming.server.web.admin.dto.TreeDTO;
import com.ooqiu.gaming.service.admin.api.ChannelService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: BernardLowe
 * @Description:
 * @Date: Created in 8:51 2019/5/14
 * @Modified By: BernardLowe
 */
@Controller
@RequestMapping(value = "channel")
public class ChannelController {
    @Reference(version = DubboVersionConstant.DUBBO_VERSION_GAMING_SERVER_SERVICE_ADMIN)
    private ChannelService channelService;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list(Model model) {
        List<Channel> targetList = Lists.newArrayList();
        List<Channel> sourceList = channelService.selectAll();
        // 频道排序
        sortChannelList(targetList, sourceList);
        model.addAttribute("channels", targetList);
        return "modules/channel/list";
    }

    @RequestMapping(value = "form", method = RequestMethod.GET)
    public String form(Model model) {
        List<Channel> channels = channelService.selectAll();
        model.addAttribute("channels", channels);
        return "modules/channel/form";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(Channel channel) {
        int result = channelService.save(channel);
        System.out.println(result);
        return "redirect:/channel/list";
    }

    @ResponseBody
    @RequestMapping(value = "tree", method = RequestMethod.GET)
    public List<TreeDTO> treeData(String pid) {
        List<TreeDTO> treeDTOList = Lists.newArrayList();
        if (StringUtils.isBlank(pid) || "#".equals(pid)) {
            pid = "0";
        }
        List<Channel> channels = channelService.selectByPid(Long.parseLong(pid));
        for (Channel channel : channels) {
            TreeDTO treeDTO = new TreeDTO();
            treeDTO.setId(channel.getId());
            treeDTO.setText(channel.getName());
            treeDTO.setIcon("");
            treeDTO.setChildren("0".equals(channel.getIsParent()));
            treeDTOList.add(treeDTO);
        }
        return treeDTOList;
    }

    /**
     * @Description: 频道排序， 用于配合前端属性表格展示
     * @auther: BernardLowe
     * @date: 22:56 2019/5/14
     * @param: [targetList, sourceList]
     * @return: void
     */
    private void sortChannelList(List<Channel> targetList, List<Channel> sourceList) {
        for (Channel channel : sourceList) {
            // 判断是否为父节点
            if ("0".equals(channel.getIsParent())) {
                targetList.add(channel);
                // 判断是否有子节点
                for (Channel subChannel : sourceList) {
                    if (subChannel.getPid().equals(channel.getId())) {
                        targetList.add(subChannel);
                    }
                }
            }
        }
    }
}
