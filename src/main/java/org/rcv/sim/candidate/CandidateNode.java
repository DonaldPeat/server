package org.rcv.sim.candidate;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 *
 */
@NodeEntity()
public class CandidateNode implements Candidate {

    //TODO add fields (which get persisted as properties on the node )




     // sdn boilerplate
    private CandidateNode(){}
    @GraphId private Long neo4jPrivateId;

    @Override
    public String getId() {
        //TODO
        throw new RuntimeException("not implemented");
    }

    @Override
    public String getName() {
        //TODO
        throw new RuntimeException("not implemented");
    }

    @Override
    public String getPhoto() {
        //TODO
        throw new RuntimeException("not implemented");
    }
}
