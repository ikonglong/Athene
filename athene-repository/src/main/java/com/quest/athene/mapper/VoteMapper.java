package com.quest.athene.mapper;

import com.quest.athene.domain.model.Vote;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2014/8/26.
 */
public interface VoteMapper {

    /**
     * 保存投票
     * @param vote
     */
    public void saveVote(Vote vote);

    /**
     * 根据投票人ID 获取投票
     * @param voteParamMap
     * @return
     */
    public Vote findVoteByVoterIdAndAnswerId(@Param(value="vote") Map<String,Long> voteParamMap);

    /**
     * 根据投票者ID查询投票
     * @param voterId
     * @return
     */
    public List<Vote> findVotesByVoterId(long voterId);

    /**
     * 根据答案ID查询投票
     * @param answerId
     * @return
     */
    public List<Vote> findVotesByAnswerId(long answerId);

    /**
     * 根据投票者ID删除投票
     * @param vote
     */
    public void deleteVoteByVoterId(Vote vote);

    /**
     * 根据投票ID删除投票
     * @param vote
     */
    public void deleteVoteByVoteId(Vote vote);

    /**
     * 根据投票目标ID删除投票
     * @param vote
     */
    public void deleteVoteByTargetId(Vote vote);
}
