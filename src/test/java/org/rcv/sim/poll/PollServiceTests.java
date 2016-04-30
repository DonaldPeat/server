package org.rcv.sim.poll;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.neo4j.ogm.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.mockito.BDDMockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PollServiceTests {

	@Autowired
	Session session;

	PollRepository pollRepo = mock(PollRepository.class);

	@After
	public void buildGDB(){
		session.purgeDatabase();
	}


	@Test
	public void testLoadPoll(){




    }

	//TODO - write a unit test for every method on every class you implement



}
