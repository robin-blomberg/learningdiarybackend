package fi.academy.learningdiary;

import javax.persistence.*;

import java.time.LocalDate;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@SequenceGenerator(name="seq", initialValue = 3)
public class Topic {
    @Id
    //@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
    //@GeneratedValue(strategy=GenerationType.AUTO)
    @GeneratedValue(strategy = SEQUENCE, generator = "topic_topic_id_seq")
    @SequenceGenerator(name = "topic_topic_id_seq", sequenceName = "topic_topic_id_seq", allocationSize = 1)
    @Column(unique = true, nullable = false)
    private Integer id;
    private String title;
    private String description;
    private String source;
    private boolean complete;
    @Column(name = "creation_date")
    private LocalDate creationDate;
    @Column(name = "completion_date")
    private LocalDate completionDate;

    public Topic() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
    }
}
