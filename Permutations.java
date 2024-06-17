
import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Character>> permute(String str) {
        List<List<Character>> res = new ArrayList<>();
        int len = str.length();
        if (len == 0) {
            return res;
        }

        List<Character> path = new ArrayList<>();
        dfs(str, 0, path, res);
        return res;
    }

    private static void dfs(String str, int depth, List<Character> path, List<List<Character>> res) {
        if (depth == str.length()) {
            res.add(new ArrayList<>(path));
            StringBuilder sbd = new StringBuilder();
            for (char c : path) {
                sbd.append(c);
            }
            System.out.println(sbd);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            path.add(str.charAt(i));
            dfs(str, depth + 1, path, res);
            path.remove(path.size() - 1);
        }
    }
}
