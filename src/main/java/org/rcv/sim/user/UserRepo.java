package org.rcv.sim.user;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

/**
 *
 */
@Repository
public interface UserRepo extends GraphRepository<UserNode> {

    UserNode findByUid(String id);


}
