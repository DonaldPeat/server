package org.rcv.sim.vote;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.rcv.sim.candidate.Candidate;
import org.rcv.sim.candidate.CandidateNode;
import org.rcv.sim.candidate.ChoiceRelationship;
import org.rcv.sim.poll.PollNode;
import org.rcv.sim.user.UserNode;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 */
@NodeEntity
public class VoteNode implements Vote {

    @Relationship
    UserNode castBy;

    @Relationship
    PollNode castIn;

    @Relationship
    Set<ChoiceRelationship> choices = new HashSet<>();

    VoteNode(UserNode user, PollNode poll, Map<Integer, CandidateNode> choices){
        this.castBy = user;
        this.castIn = poll;

        choices.entrySet().forEach(entry -> {
            this.choices.add(new ChoiceRelationship(this, entry.getValue(), entry.getKey()));
        });

      //  this.choices = choices.keySet().stream().map();
    }


    @Override
    public List<Candidate> getChoices() {
        return null;
    }
}
