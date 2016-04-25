package org.rcv.sim.candidate;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import org.rcv.sim.vote.VoteNode;

/**
 *
 */
@RelationshipEntity(type = "CHOICE")
public class ChoiceRelationship {

    @StartNode
    VoteNode vote;

    @EndNode
    CandidateNode candidate;

    int choice;

    public ChoiceRelationship(VoteNode vote, CandidateNode candidate, int choice) {
        this.vote = vote;
        this.candidate = candidate;
        this.choice = choice;
    }
}
