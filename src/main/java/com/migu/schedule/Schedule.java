package com.migu.schedule;


import com.migu.schedule.constants.ReturnCodeKeys;
import com.migu.schedule.info.TaskInfo;

import java.util.*;

/*
*类名和方法不能修改
 */
public class Schedule {
    List<Integer> nodeList=new ArrayList<Integer>();
    List<Map<Integer,Integer>> taskList=new ArrayList<Map<Integer, Integer>>();
    private static Schedule instance = null;
   public  static Schedule getInstance(){
       if (instance == null) {
           instance = new Schedule();
       }
       return instance;
   }
//初始化系统
    public int init() {
        // TODO 方法未实现
        nodeList.clear();
        taskList.clear();


        return ReturnCodeKeys.E001;
    }

//注册节点
    public int registerNode(int nodeId) {
        // TODO 方法未实现
        if (nodeId>0) {
            if (!nodeList.contains(nodeId)) {
                nodeList.add(nodeId);
            }else{
                return ReturnCodeKeys.E004;
            }
        }else{
            return ReturnCodeKeys.E004;
        }
        return ReturnCodeKeys.E003;
    }
//注销节点
    public int unregisterNode(int nodeId) {
        // TODO 方法未实现
        if (nodeId>0) {
            if (!nodeList.contains(nodeId)) {
                nodeList.remove(nodeId);
            }else{
                return ReturnCodeKeys.E007;
            }
        }else{
            return ReturnCodeKeys.E004;
        }
        return ReturnCodeKeys.E006;
    }

//添加任务
    public int addTask(int taskId, int consumption) {
        // TODO 方法未实现
        if(taskId>0) {
            Map<Integer, Integer> taskMap = new HashMap<Integer, Integer>();
            taskMap.put(taskId, consumption);
            if (!taskList.contains(taskMap)){
                taskList.add(taskMap);
            }else {
                return ReturnCodeKeys.E010;
            }

        }else {
            return ReturnCodeKeys.E009;
        }
        return ReturnCodeKeys.E008;
    }

/*
* 删除任务
* */
    public int deleteTask(int taskId) {
        // TODO 方法未实现

        if(taskId>0){
            for (int i = 0; i < taskList.size(); i++) {
                Map<Integer,Integer> maptaskid=taskList.get(i);
                Iterator keys = maptaskid.keySet().iterator();
                while(keys.hasNext()){
                    String key = (String)keys.next();
                    if((taskId+"").equals(key)){
                        taskList.remove(i);
                        break;
                    }
                }
                if (i==taskList.size()-1){
                    return ReturnCodeKeys.E012;
                }
            }

        }else {
            return ReturnCodeKeys.E009;
        }
        return ReturnCodeKeys.E011;
    }

/*
* 任务调度
* */
    public int scheduleTask(int threshold) {
        // TODO 方法未实现


        return ReturnCodeKeys.E000;
    }

/*
* 查询任务状态
* */
    public int queryTaskStatus(List<TaskInfo> tasks) {
        // TODO 方法未实现


        return ReturnCodeKeys.E000;
    }

}
