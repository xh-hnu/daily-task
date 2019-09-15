package com.hnu.xuhe.dailytask.ui.home.entity;

import lombok.Data;

/**
 * @author xuhe
 */
@Data
public class TaskItem {

    private String studyContent;
    private String studyTime;
    private String level;
    private int bgColor;

    public TaskItem(String studyContent, String studyTime, String level, int bgColor) {
        this.studyContent = studyContent;
        this.studyTime = studyTime;
        this.level = level;
        this.bgColor = bgColor;
    }

    public String getStudyContent() {
        return studyContent;
    }

    public void setStudyContent(String studyContent) {
        this.studyContent = studyContent;
    }

    public String getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(String studyTime) {
        this.studyTime = studyTime;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getBgColor() {
        return bgColor;
    }

    public void setBgColor(int bgColor) {
        this.bgColor = bgColor;
    }

    @Override
    public String toString() {
        return "TaskItem{" +
                "studyContent='" + studyContent + '\'' +
                ", studyTime='" + studyTime + '\'' +
                ", level='" + level + '\'' +
                ", bgColor=" + bgColor +
                '}';
    }
}
