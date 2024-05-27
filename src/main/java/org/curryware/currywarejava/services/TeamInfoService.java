package org.curryware.currywarejava.services;

import org.curryware.currywarejava.models.TeamInfo;
import org.curryware.currywarejava.repositories.TeamInfoRepository;
import org.springframework.stereotype.Service;

@Service
public class TeamInfoService {

    private final TeamInfoRepository teamInfoRepository;

    public TeamInfoService(TeamInfoRepository teamInfoRepository) {
        this.teamInfoRepository = teamInfoRepository;
    }

    public Iterable<TeamInfo> findAll() {
        return teamInfoRepository.findAll();
    }
}
