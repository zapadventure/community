package com.nowcoder.community.dao;

import com.nowcoder.community.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author superzap
 * @create 2022-09-20 11:44
 */
@Mapper
public interface CommentMapper {

    List<Comment> selectCommentsByEntity(int entityType,int entityId,int offset,int limit);

    int selectCountByEntity(int entityType,int entityId);

    int insertComment(Comment comment);

    // 通过贴子id，查贴子
    Comment selectCommentById(int id);

    // 查用户贴子，通过用户id，分页page，limit
    List<Comment> selectCommentsByUser(int userId,int offset,int limit);

    // 查用户贴子数，通过用户id
    int selectCountByUser(int userId);

}
