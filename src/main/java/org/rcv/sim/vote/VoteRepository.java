package org.rcv.sim.vote;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

/**
 *
 */
@Repository
public interface VoteRepository extends GraphRepository<VoteNode> {




}
