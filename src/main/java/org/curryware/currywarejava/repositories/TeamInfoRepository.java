package org.curryware.currywarejava.repositories;

import org.curryware.currywarejava.models.TeamInfo;

public interface TeamInfoRepository {

    Iterable<TeamInfo> findAll();
}
