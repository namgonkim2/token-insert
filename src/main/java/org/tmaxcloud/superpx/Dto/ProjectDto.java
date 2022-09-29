package org.tmaxcloud.superpx.Dto;

public class ProjectDto {

    public ProjectDto(int projectId, String filePath, String fileName) {
        this.projectId = projectId;
        this.filePath = filePath;
        this.fileName = fileName;
    }

    private int projectId;
    private String filePath;
    private String fileName;

    public int getProjectId() {
        return projectId;
    }
    public String getFilePath() {
        return filePath;
    }
    public String getFileName() {
        return fileName;
    }
    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "ProjectDto{" +
                "projectId=" + projectId +
                ", filePath='" + filePath + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
