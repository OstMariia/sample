package jp.co.axrossroad.sample;


public class UserProject {

    private String startedAt;
    private String finishedAt;
    private String title;
    private String description;
    private String processes;
    private String roleCode;
    private String roleName;
    private String numberOfMembers;
    private String platforms;
    private String languages;

      public UserProject(String startedAt, String finishedAt, String title, String description, String processes, String roleCode,
     String roleName, String numberOfMembers, String platforms, String languages) {

        this.startedAt = startedAt;
        this.finishedAt =finishedAt;
        this.title = title;
        this.description = description;
        this.processes = processes;
        this.roleCode = roleCode;
        this.roleName = roleName;
        this.numberOfMembers = numberOfMembers;
        this.platforms = platforms;
        this.languages = languages;

    }

    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProcesses() {
        return processes;
    }

    public void setProcesses(String processes) {
        this.processes = processes;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getNumberOfMembers() {
        return numberOfMembers;
    }

    public void setNumberOfMembers(String numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

}
