/*
 * Copyright (C) 2007-2008 Luís Reis <luiscubal@gmail.com>
 * Copyright (C) 2007-2008 TGMG <thegamemakerguru@hotmail.com>
 * Copyright (C) 2008 Serge Humphrey <bob@bobtheblueberry.com>
 * 
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */
package org.gcreator.threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Allows simple and easy multi-threading.
 * @author Serge Humphrey
 */


public final class ThreadPool {
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
    
    public static void shutdown() {
        executor.shutdown();
    }
    
    public static ScheduledThreadPoolExecutor getExecutor() {
        return executor;
    }
}
