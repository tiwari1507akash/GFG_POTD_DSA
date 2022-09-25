Ques-Two players, Player 1 and Player 2, are given an integer N to play a game. The rules of the game are as follows :
1. In one turn, a player can remove any set bit of N in its binary representation to make a new N.
2. Player 1 always takes first turn.
3. If a player cannot make a move, he loses.
Assume that both the players play optimally.

class Solution {
    public static int swapBitGame(long N) {
        int cnt=0;
        while(n>0){
            if((n&1)==1){
                cnt++;
            }
            n>>=1;
        }
        return cnt%2==0?2:1;
    }
}

Input:
N = 8
Output:
1
Explanation:
N = 8
N = 1000 (binary)
Player 1 takes the bit.
The remaining bits are all zero.
Player 2 cannot make a move, 
so Player 1 wins.
