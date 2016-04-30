package org.rcv.sim.poll;

import org.junit.After;
import org.junit.runner.RunWith;
import org.neo4j.ogm.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PollRepoTests {

	@Autowired
	Session session;

	@After
	public void buildGDB(){
		session.purgeDatabase();
	}





}
