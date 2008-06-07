/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.threading;

/**
 * 
 * @author bob
 */

import java.util.concurrent.*;

public class ThreadPool {
    private static ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(2);
    /**
     * Don't allow instantation.
     */
    private ThreadPool() {
    }
    
    public static ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit) {
        return executor.schedule(command, delay, unit);
    }
    
    public static ScheduledFuture<?> scheduleWithFixedDelay(Runnable command, long initialDelay,long delay, TimeUnit unit) {
        return executor.scheduleWithFixedDelay(command, initialDelay, delay, unit);
    }
    
    public static ScheduledFuture<?> schedule(Callable<?> callable,long delay, TimeUnit unit) {
        return executor.schedule(callable, delay, unit);
    }
    
    public static ScheduledFuture<?> scheduledAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) {
        return executor.scheduleAtFixedRate(command, initialDelay, period, unit);
    }
    
    public static ScheduledFuture<?> scheduledAtFixedRate(Runnable command, long period, TimeUnit unit) {
        return executor.scheduleAtFixedRate(command, 0, period, unit);
    }
}
