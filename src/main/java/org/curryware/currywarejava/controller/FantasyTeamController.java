package org.curryware.currywarejava.controller;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.curryware.currywarejava.models.TeamInfo;
import org.curryware.currywarejava.services.TeamInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("teaminfo")
public class FantasyTeamController {

    private static final Logger logger = LoggerFactory.getLogger(FantasyTeamController.class);
    private final TeamInfoService teamInfoService;

    public FantasyTeamController(TeamInfoService teamInfoService) {
        this.teamInfoService = teamInfoService;
    }

    @GetMapping(value = "/getteams", produces = "application/json")
    public @ResponseBody String getTeamInfo() {

        logger.info("Getting team information");
        Iterable<TeamInfo> teamInfoList = teamInfoService.findAll();
        List<TeamInfo> teamInfo = new ArrayList<>();
        teamInfoList.forEach(teamInfo::add);
        logger.error("Found {} teams", teamInfo.size());
        String jsonString = new Gson().toJson(teamInfo);
        teamInfo.clear();

        return jsonString;
    }
}
