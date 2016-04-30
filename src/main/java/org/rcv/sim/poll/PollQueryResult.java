package org.rcv.sim.poll;

import org.rcv.sim.candidate.CandidateNode;
import org.rcv.sim.vote.VoteNode;
import org.springframework.data.neo4j.annotation.QueryResult;

import java.util.Collection;
import java.util.Set;

/**
 * Note: this exists purely as an optimization that may or may not be necessary when READING large polls (50k+ votes),
 * as it should be considerably more efficient to query for this than putting it together via PollNode. Of course, this
 * can only be useful for reads, there is no write support.
 */
@QueryResult
public class PollQueryResult implements Poll {
    private PollNode poll;
    private Set<CandidateNode> candidates;
    private Set<VoteNode> votes;

    @Override
    public String getName() {
        return poll.getName();
    }

    @Override
    public String getId() {
        return poll.getId();
    }

    @Override
    public Collection<VoteNode> getVotes() {
        return votes;
    }

    @Override
    public Collection<CandidateNode> getCandidates() {
        return candidates;
    }

}
