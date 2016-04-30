package org.rcv.sim.vote;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import org.rcv.sim.candidate.CandidateNode;

/**
 *
 */
@RelationshipEntity(type = CastToRelationship.TYPE)
public class CastToRelationship {

    public static final String TYPE = "CAST_TO";

    @StartNode
    VoteNode vote;

    @EndNode
    CandidateNode candidateNode;

    int choice;

    public CastToRelationship(VoteNode vote, CandidateNode candidateNode, int choice) {
        this.vote = vote;
        this.candidateNode = candidateNode;
        this.choice = choice;
    }


}
