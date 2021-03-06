package com.yeahmobi.yscheduler.web.vo;

import java.util.Date;

import com.yeahmobi.yscheduler.model.Attempt;
import com.yeahmobi.yscheduler.model.TaskInstance;
import com.yeahmobi.yscheduler.model.type.TaskInstanceStatus;

/**
 * @author Ryan Sun
 */
public class TaskInstanceVO {

    private Long               id;

    private Long               taskId;

    private TaskInstanceStatus status;

    private Date               createTime;

    private Date               updateTime;

    private Attempt            attempt;

    private int                execTimes;

    private Date               startTime;

    private Long               workflowInstanceId;

    private String             workflowName;

    private Date               endTime;

    private Date               scheduleTime;

    public TaskInstanceVO() {
    }

    public TaskInstanceVO(TaskInstance instance) {
        this.id = instance.getId();
        this.taskId = instance.getTaskId();
        this.status = instance.getStatus();
        this.startTime = instance.getStartTime();
        this.createTime = instance.getCreateTime();
        this.updateTime = instance.getUpdateTime();
        this.workflowInstanceId = instance.getWorkflowInstanceId();
        this.endTime = instance.getEndTime();
        this.scheduleTime = instance.getScheduleTime();
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getScheduleTime() {
        return this.scheduleTime;
    }

    public void setScheduleTime(Date scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTaskId() {
        return this.taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public TaskInstanceStatus getStatus() {
        return this.status;
    }

    public void setStatus(TaskInstanceStatus status) {
        this.status = status;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Attempt getAttempt() {
        return this.attempt;
    }

    public void setAttempt(Attempt attempt) {
        this.attempt = attempt;
    }

    public int getExecTimes() {
        return this.execTimes;
    }

    public void setExecTimes(int execTimes) {
        this.execTimes = execTimes;
    }

    public String getWorkflowName() {
        return this.workflowName;
    }

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    public Long getWorkflowInstanceId() {
        return this.workflowInstanceId;
    }

    public void setWorkflowInstanceId(Long workflowInstanceId) {
        this.workflowInstanceId = workflowInstanceId;
    }

}
