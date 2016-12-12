/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

/**
 *
 * @author brass
 */
public class ApproveLoanBean {
     private int approve_id;
    private int loanreq_id;
    private int loanbankreq_id;
    private String firstName;
    private String judgment;
    private Double approvedamount;
    private Double installlments;
    private String timerepayment;
    private String createdby;
    private String updateby;
    private int created;
    private int updated;
    private String todo;

    public int getApprove_id() {
        return approve_id;
    }

    public void setApprove_id(int approve_id) {
        this.approve_id = approve_id;
    }

    public int getLoanreq_id() {
        return loanreq_id;
    }

    public void setLoanreq_id(int loanreq_id) {
        this.loanreq_id = loanreq_id;
    }

    public int getLoanbankreq_id() {
        return loanbankreq_id;
    }

    public void setLoanbankreq_id(int loanbankreq_id) {
        this.loanbankreq_id = loanbankreq_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getJudgment() {
        return judgment;
    }

    public void setJudgment(String judgment) {
        this.judgment = judgment;
    }

    public Double getApprovedamount() {
        return approvedamount;
    }

    public void setApprovedamount(Double approvedamount) {
        this.approvedamount = approvedamount;
    }

    public Double getInstalllments() {
        return installlments;
    }

    public void setInstalllments(Double installlments) {
        this.installlments = installlments;
    }

    public String getTimerepayment() {
        return timerepayment;
    }

    public void setTimerepayment(String timerepayment) {
        this.timerepayment = timerepayment;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public int getUpdated() {
        return updated;
    }

    public void setUpdated(int updated) {
        this.updated = updated;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
    
}
