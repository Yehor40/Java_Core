package org.lambda;

public class ExecutableImpl implements Exec{
    @Override
    public int execute(int x,int y) {
        System.out.println("Executes");
        return y*x+1;
    }
}
