package com.migu.schedule;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by O on 2018/6/20.
 */
public class ScheduleTest {

    Schedule schedule =Schedule.getInstance();
    @Test
    public void init() throws Exception {
        Schedule schedule =Schedule.getInstance();
        schedule.init();
    }

    @Test
    public void registerNode() throws Exception {
        Schedule schedule =Schedule.getInstance();
        schedule.registerNode(1);
    }

    @Test
    public void unregisterNode() throws Exception {
        Schedule schedule =Schedule.getInstance();
        schedule.unregisterNode(1);
    }

    @Test
    public void addTask() throws Exception {
        Schedule schedule =Schedule.getInstance();
        schedule.addTask(1,10);
    }

    @Test
    public void deleteTask() throws Exception {
        Schedule schedule =Schedule.getInstance();
        schedule.deleteTask(1);
    }

    @Test
    public void scheduleTask() throws Exception {

    }

    @Test
    public void queryTaskStatus() throws Exception {

    }

}
