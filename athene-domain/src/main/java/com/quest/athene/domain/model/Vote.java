package com.quest.athene.domain.model;

/**
 * Created by Administrator on 2014/8/26.
 */
public class Vote extends BaseEntity {

    /**
     * 投票ID
     */
    private long voteId;

    /**
     * 投票人ID
     */
    private long voterId;

    /**
     * 投票对象 目前只对答案投票
     */
    private long voteObjectId;

    public long getVoteId() {
        return voteId;
    }

    public void setVoteId(long voteId) {
        this.voteId = voteId;
    }

    public long getVoterId() {
        return voterId;
    }

    public void setVoterId(long voterId) {
        this.voterId = voterId;
    }

    public long getVoteObjectId() {
        return voteObjectId;
    }

    public void setVoteObjectId(long voteObjectId) {
        this.voteObjectId = voteObjectId;
    }
}
