class Solution {
    
    static int answer;
    static boolean [] v;    
    
    
    
    
    
    public int solution(int k, int[][] dungeons) {
        int n = dungenons.length;
        v = new boolean[n];
        
        dfs(0, v , dungenons);
        
        
        
        
        
        
            
        return answer;
    }
}