package co.wordbe.jpaspringdatajpa.repository;

public interface NestedClosedProjections {
    String getUsername();
    TeamInfo getTeam();

    interface TeamInfo {
        String getName();
    }
}
