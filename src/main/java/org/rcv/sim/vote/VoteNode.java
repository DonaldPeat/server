package org.rcv.sim.vote;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.rcv.sim.candidate.Candidate;
import org.rcv.sim.candidate.CandidateNode;
import org.rcv.sim.poll.Poll;
import org.rcv.sim.poll.PollNode;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 */
@NodeEntity
public class VoteNode implements Vote {

    @Relationship(type = PollNode.CAST_IN_RELATIONSHIP_TYPE)
    PollNode castIn;

    @Relationship
    Set<CastToRelationship> choices = new HashSet<>();


    VoteNode(PollNode poll, Map<Integer, CandidateNode> choices){
        this.castIn = poll;
        choices.entrySet().forEach(entry ->
                this.choices.add(new CastToRelationship(this, entry.getValue(), entry.getKey()))
        );

    }


    @Override
    public Poll getCastIn() {
        return this.castIn;
    }

    @Override
    public Map<Integer, ? extends Candidate> getChoices() {
        //TODO donald
        throw new RuntimeException("not implemented");
    }
}
