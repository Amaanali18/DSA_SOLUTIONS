class Solution {
    public boolean canAliceWin(int n) {
        int move = 10;
        boolean remove = false;
        while(n>=move){
            n-=move;
            remove = !remove;
            move-=1;
        }
        return remove;
    }
}