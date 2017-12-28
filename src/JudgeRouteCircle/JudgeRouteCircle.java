package JudgeRouteCircle;

public class JudgeRouteCircle {

    public boolean getJudgeRouteCircle(String moves) {
        int y = 0, x = 0;
        for(char c : moves.toCharArray()){
            if(c == 'U') y++;
            else if (c == 'D') y--;
            else if (c == 'L') x--;
            else if (c == 'R') x++;
        }
        return (y == 0 && x == 0);
    }
}
