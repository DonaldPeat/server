package org.rcv.sim.poll;

import org.springframework.data.neo4j.repository.GraphRepository;

/**
 *
 */
public interface PollRepository extends GraphRepository<PollNode> {
    PollNode findByUid(String id);
}
