package pt.ulisboa.tecnico.socialsoftware.tutor.statement.dto;

import java.io.Serializable;

public class StatementCreationDto implements Serializable {
    private Integer numberOfQuestions = 5;
    private String questionType;
    private String assessment;
//    private String[] topics;

    public Integer getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(Integer numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }

    /*    public String[] getTopics() {
        return topics;
    }

    public void setTopics(String[] topics) {
        this.topics = topics;
    }*/

    @Override
    public String toString() {
        return "StatementCreationDto{" +
                "numberOfQuestions=" + numberOfQuestions +
                ", questionType='" + questionType + '\'' +
                ", assessment='" + assessment + '\'' +
                '}';
    }
}
