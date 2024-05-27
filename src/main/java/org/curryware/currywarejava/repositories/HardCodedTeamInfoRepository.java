package org.curryware.currywarejava.repositories;

import org.curryware.currywarejava.models.TeamInfo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HardCodedTeamInfoRepository implements TeamInfoRepository {

    private static final List<TeamInfo> teamInfo = new ArrayList<>();

    @Override
    public List<TeamInfo> findAll() {

        for (int counter = 0; counter < 7; counter++) {
            TeamInfo team = getTeamInfo(counter);
            teamInfo.add(team);
        }
        return teamInfo;
    }

    private TeamInfo getTeamInfo(int id) {

        return switch (id) {
            case 1 -> new TeamInfo("OLCC 2021", 406, 967657);
            case 2 -> new TeamInfo("OLCC 2022", 414, 951179);
            case 3 -> new TeamInfo("OLCC 2023", 423, 321592);
            case 4 -> new TeamInfo("Picard 2021", 406, 652824);
            case 5 -> new TeamInfo("Picard 2022", 414, 665216);
            case 6 -> new TeamInfo("Picard 2023", 423, 670923);
            default -> new TeamInfo("Datadog 2023", 423, 661655);
        };
    }
}
