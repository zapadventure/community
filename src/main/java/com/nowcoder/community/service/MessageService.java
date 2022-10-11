package com.nowcoder.community.service;

import com.nowcoder.community.dao.MessageMapper;
import com.nowcoder.community.entity.Message;
import com.nowcoder.community.util.SensitiveFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.util.HtmlUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author superzap
 * @create 2022-09-21 10:36
 */
@Service
public class MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Autowired
    private SensitiveFilter sensitiveFilter;

    // 查询当前用户的会话列表，针对每个会话只返回一条最新的私信
    public List<Message> findConversations(int userId,int offset,int limit) {
        return messageMapper.selectConversations(userId,offset,limit);
    }

    // 查询当前用户的会话数量
    public int findConversationCount(int userId) {
        return messageMapper.selectConversationCount(userId);
    }

    // 查询某个会话所包含的私信列表
    public List<Message> findLetters(String conversationId,int offset,int limit) {
        return messageMapper.selectLetters(conversationId,offset,limit);
    }

    // 查询某个会话所包含的私信数量
    public int findLetterCount(String conversationId) {
        return messageMapper.selectLetterCount(conversationId);
    }

    // 查询未读私信的数量
    public int findLetterUnreadCount(int userId,String conversationId) {
        return messageMapper.selectLetterUnreadCount(userId,conversationId);
    }

    // 新增消息
    public int addMessage(Message message) {
        // 过滤标签
        message.setContent(HtmlUtils.htmlEscape(message.getContent()));
        // 过滤敏感词
        message.setContent(sensitiveFilter.filter(message.getContent()));
        return messageMapper.insertMessage(message);
    }

    // 读取消息，改为 已读
    public int readMessage(List<Integer> ids) {
        return messageMapper.updateStatus(ids,1);
    }

    public int deleteMessage(int id) {
        return messageMapper.updateStatus(Arrays.asList(new Integer[]{id}), 2);
    }

    // 查询最新的通知
    public Message findLatestNotice(int userId,String topic) {
        return messageMapper.selectLatestNotice(userId,topic);
    }

    // 查询通知数量
    public int findNoticeCount(int userId,String topic) {
        return messageMapper.selectNoticeCount(userId,topic);
    }

    // 查询未读的通知数量
    public int findNoticeUnreadCount(int userId,String topic) {
        return messageMapper.selectNoticeUnreadCount(userId,topic);
    }

    // 查询某个主题所包含的通知列表
    public List<Message> findNotices(int userId,String topic,int offset,int limit) {
        return messageMapper.selectNotices(userId,topic,offset,limit);
    }
}
