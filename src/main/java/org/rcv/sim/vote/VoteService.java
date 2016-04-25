package org.rcv.sim.vote;

import org.rcv.sim.candidate.CandidateNode;
import org.rcv.sim.candidate.CandidateRepo;
import org.rcv.sim.poll.PollNode;
import org.rcv.sim.poll.PollRepository;
import org.rcv.sim.user.UserNode;
import org.rcv.sim.user.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@Service
public class VoteService {

    @Autowired
    VoteRepository voteRepo;

    @Autowired
    PollRepository pollRepo;

    @Autowired
    CandidateRepo candidateRepo;

    @Autowired
    UserRepo userRepo;

    public void saveVote(VoteInput input){
        UserNode user = userRepo.findByUid(input.userId);

        PollNode poll = pollRepo.findByUid(input.pollId);

        // choice # to candidate chosen
        Map<Integer, CandidateNode> choices = new HashMap<>();

        CandidateNode cand;
        for (int i = 0; i < input.choices.length; i++) {

        }

        //FILL IN THE BLANK

         VoteNode vn = new VoteNode(user, poll, choices);

         this.voteRepo.save(vn);


    }



}
