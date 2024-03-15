package jp.ac.ohara.seisaku.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nikki")
public class NikkiModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nikkiid")
    private Long nikkiid;

    @Column(name = "day", length = 12, nullable = false)
    private String day;

    @Column(name = "title", length = 32, nullable = false)
    private String title;
    
    @Column(name = "content", length = 1024, nullable = false)
    private String content;
    
    public Long getNikkiid() {
        return nikkiid;
    }

    public void setNikkiid(Long nikkiid) {
        this.nikkiid = nikkiid;
    }
    
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
