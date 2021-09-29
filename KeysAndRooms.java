import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();
        dfs(rooms, visited, 0);
        return visited.size() == rooms.size();
    }

    private void dfs(List<List<Integer>> rooms, Set<Integer> visited, int curIndex) {
        if (visited.contains(curIndex))
            return;

        visited.add(curIndex);

        for (int r : rooms.get(curIndex)) {
            dfs(rooms, visited, r);
        }
    }
}
