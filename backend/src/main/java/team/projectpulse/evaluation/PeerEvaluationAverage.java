package team.projectpulse.evaluation;

import java.util.ArrayList;
import java.util.List;

public class PeerEvaluationAverage {

    private Integer studentId;
    private String week;
    private String firstName;
    private String lastName;
    private String email;
    private String teamName;
    private Double averageTotalScore;
    private List<String> publicComments;
    private List<String> privateComments;
    private List<RatingAverage> ratingAverages;


    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Double getAverageTotalScore() {
        return averageTotalScore;
    }

    public void setAverageTotalScore(Double averageTotalScore) {
        this.averageTotalScore = averageTotalScore;
    }

    @SuppressWarnings("PMD.ReturnEmptyCollectionRatherThanNull")
    public List<String> getPublicComments() {
        // Null means comments were not supplied; an empty list means they were supplied with no entries.
        return publicComments == null ? null : List.copyOf(publicComments);
    }

    public void setPublicComments(List<String> publicComments) {
        this.publicComments = publicComments == null ? null : new ArrayList<>(publicComments);
    }

    @SuppressWarnings("PMD.ReturnEmptyCollectionRatherThanNull")
    public List<String> getPrivateComments() {
        // Null means comments are unavailable or were not supplied; an empty list means no entries.
        return privateComments == null ? null : List.copyOf(privateComments);
    }

    public void setPrivateComments(List<String> privateComments) {
        this.privateComments = privateComments == null ? null : new ArrayList<>(privateComments);
    }

    @SuppressWarnings("PMD.ReturnEmptyCollectionRatherThanNull")
    public List<RatingAverage> getRatingAverages() {
        // Null means ratings were not supplied; an empty list means they were supplied with no entries.
        return ratingAverages == null ? null : List.copyOf(ratingAverages);
    }

    public void setRatingAverages(List<RatingAverage> ratingAverages) {
        this.ratingAverages = ratingAverages == null ? null : new ArrayList<>(ratingAverages);
    }

}
