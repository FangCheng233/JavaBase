package com.fc.base.thread.threadpool;

import java.util.List;
import java.util.concurrent.*;

/**
 * @ClassName MyScheduledThreadPoolExecutor
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/4/16 9:21 上午
 * @Version 1.0
 */
public class MyScheduledThreadPoolExecutor extends ScheduledThreadPoolExecutor {
    @Override
    protected <V> RunnableScheduledFuture<V> decorateTask(Runnable runnable, RunnableScheduledFuture<V> task) {
        return super.decorateTask(runnable, task);
    }

    @Override
    protected <V> RunnableScheduledFuture<V> decorateTask(Callable<V> callable, RunnableScheduledFuture<V> task) {
        return super.decorateTask(callable, task);
    }

    public MyScheduledThreadPoolExecutor(int corePoolSize) {
        super(corePoolSize);
    }

    public MyScheduledThreadPoolExecutor(int corePoolSize, ThreadFactory threadFactory) {
        super(corePoolSize, threadFactory);
    }

    public MyScheduledThreadPoolExecutor(int corePoolSize, RejectedExecutionHandler handler) {
        super(corePoolSize, handler);
    }

    public MyScheduledThreadPoolExecutor(int corePoolSize, ThreadFactory threadFactory, RejectedExecutionHandler handler) {
        super(corePoolSize, threadFactory, handler);
    }

    @Override
    public ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit) {
        return super.schedule(command, delay, unit);
    }

    @Override
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long delay, TimeUnit unit) {
        return super.schedule(callable, delay, unit);
    }

    @Override
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period, TimeUnit unit) {
        return super.scheduleAtFixedRate(command, initialDelay, period, unit);
    }

    @Override
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable command, long initialDelay, long delay, TimeUnit unit) {
        return super.scheduleWithFixedDelay(command, initialDelay, delay, unit);
    }

    @Override
    public void execute(Runnable command) {
        super.execute(command);
    }

    @Override
    public Future<?> submit(Runnable task) {
        return super.submit(task);
    }

    @Override
    public <T> Future<T> submit(Runnable task, T result) {
        return super.submit(task, result);
    }

    @Override
    public <T> Future<T> submit(Callable<T> task) {
        return super.submit(task);
    }

    @Override
    public void setContinueExistingPeriodicTasksAfterShutdownPolicy(boolean value) {
        super.setContinueExistingPeriodicTasksAfterShutdownPolicy(value);
    }

    @Override
    public boolean getContinueExistingPeriodicTasksAfterShutdownPolicy() {
        return super.getContinueExistingPeriodicTasksAfterShutdownPolicy();
    }

    @Override
    public void setExecuteExistingDelayedTasksAfterShutdownPolicy(boolean value) {
        super.setExecuteExistingDelayedTasksAfterShutdownPolicy(value);
    }

    @Override
    public boolean getExecuteExistingDelayedTasksAfterShutdownPolicy() {
        return super.getExecuteExistingDelayedTasksAfterShutdownPolicy();
    }

    @Override
    public void setRemoveOnCancelPolicy(boolean value) {
        super.setRemoveOnCancelPolicy(value);
    }

    @Override
    public boolean getRemoveOnCancelPolicy() {
        return super.getRemoveOnCancelPolicy();
    }

    @Override
    public void shutdown() {
        super.shutdown();
    }

    @Override
    public List<Runnable> shutdownNow() {
        return super.shutdownNow();
    }

    @Override
    public BlockingQueue<Runnable> getQueue() {
        return super.getQueue();
    }
}
