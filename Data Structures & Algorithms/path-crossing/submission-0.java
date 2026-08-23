class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> vis = new HashSet<>();
        int x = 0, y = 0;
        vis.add(x+","+y);
        for(char c:path.toCharArray()){
            if(c == 'N')
                y++;
            else if(c == 'E')
                x++;
            else if(c == 'S')
                y--;
            else
                x--;
            String pos = x+","+y;
            if(vis.contains(pos))
                return true;
            vis.add(pos);
        }
        return false;
    }
}