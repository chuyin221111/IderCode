public class MaxArray {

    public int sum(int []x) {
        int Max;
        Max=x[0];
        for (int i = 0; i <x.length-1; i++)
        {

            if(Max<x[i+1])
            {
                Max=x[i+1];

            }

        }
        return Max;
    }
}
