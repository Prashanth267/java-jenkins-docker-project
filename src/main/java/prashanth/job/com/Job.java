package prashanth.job.com;

public class Job {
    private String jobTitle;
    private String company;
    private String location;
    private String description;

    public Job(String jobTitle, String company, String location, String description) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.location = location;
        this.description = description;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }
}
