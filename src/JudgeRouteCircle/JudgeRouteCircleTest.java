package JudgeRouteCircle;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class JudgeRouteCircleTest {

    @Test
    public void judgeRouteCircleTest1() {
        JudgeRouteCircle judgeRouteCircleObj = new JudgeRouteCircle();
        boolean getJudgeRouteCircle = judgeRouteCircleObj.getJudgeRouteCircle("RRDDLLUU");
        assertEquals(true, getJudgeRouteCircle);
    }

    @Test
    public void judgeRouteCircleTest2() {
        JudgeRouteCircle judgeRouteCircleObj = new JudgeRouteCircle();
        boolean getJudgeRouteCircle = judgeRouteCircleObj.getJudgeRouteCircle("RRDDLLU");
        assertEquals(false, getJudgeRouteCircle);
    }

    @Test
    public void judgeRouteCircleTest3() {
        JudgeRouteCircle judgeRouteCircleObj = new JudgeRouteCircle();
        boolean getJudgeRouteCircle = judgeRouteCircleObj.getJudgeRouteCircle("UULLLD");
        assertEquals(false, getJudgeRouteCircle);
    }
}
