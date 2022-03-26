package com.xiaoxujindachang.community.dao;

import com.xiaoxujindachang.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    //考虑分页的处理,offset:起始行行号，limit:每一页多少条行号
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit , int orderMode);

    //@Param注解用于给参数取别名
    //如果只有一个参数，并且在if里使用，则必须取别名
    int selectDiscussPostRows(@Param("userId") int userId);

    int insertDiscussPost(DiscussPost discussPost);

    DiscussPost selectDiscussPostById(int id);

    int updateCommentCount(int id,int commentCount);

    int updateType(int id , int type);

    int updateStatus(int id , int status);

    int updateScore (int id,  double score);
}
