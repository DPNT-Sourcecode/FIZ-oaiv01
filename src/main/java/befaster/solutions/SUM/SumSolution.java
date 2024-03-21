package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;

@SuppressWarnings("unused")
public class SumSolution {

    public int compute(int x, int y) {
    	if((x>-1 && x<=100) &&(y>-1 && y<=100))
    		return x+y;
    	else
    		return 0;
       // throw new SolutionNotImplementedException();
    }

}


