package com.nowcoder.community.util;

/**
 * @author superzap
 * @create 2022-09-17 12:35
 */
public interface CommunityConstant {

    /**
     * 激活成功
     */
    int ACTIVATION_SUCCESS = 0;

    /**
     * 重复的激活
     */
    int ACTIVATION_REPEAT = 1;

    /**
     * 激活失败
     */
    int ACTIVATION_FALLURE = 2;

    /**
     * 默认状态的登录凭证的超时时间
     */
    int DEFAULT_EXPIRED_SECONDS = 3600 * 12;

    /**
     * 记住状态的登录凭证超时时间
     */
    int REMEMBER_EXPIRED_SECONDS = 3600 * 24 * 100;

    /**
     * 实体类型：贴子
     */
    int ENTITY_TYPE_POST = 1;

    /**
     * 实体类型：评论
     */
    int ENTITY_TYPE_COMMENT = 2;

    /**
     * 实体类型：用户
     */
    int ENTITY_TYPE_USER = 3;

    /**
     * 事件主题：评论
     */
    String TOPIC_COMMENT = "comment";

    /**
     * 事件主题：点赞
     */
    String TOPIC_LIKE = "like";

    /**
     * 事件主题：关注
     */
    String TOPIC_FOLLOW = "follow";

    /**
     * 事件主题：发帖
     */
    String TOPIC_PUBLISH = "publish";

    /**
     * 事件主题：删贴
     */
    String TOPIC_DELETE = "delete";

    /**
     * 事件主题：分享
     */
    String TOPIC_SHARE = "share";

    /**
     * 系统用户ID
     */
    int SYSTEM_USER_ID = 1;

    /**
     * 权限：普通用户
     */
    String AUTHORITY_USER = "user";

    /**
     * 权限：管理员
     */
    String AUTHORITY_ADMIN = "admin";

    /**
     * 权限：版主
     */
    String AUTHORITY_MODERATOR = "moderator";
}
