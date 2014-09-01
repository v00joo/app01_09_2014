package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "LEinOC")
public class LEinOC {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "timestamp")
    private Date timestamp;

    @Column(name = "user_id")
    private String user_id;

    @Column(name = "oc_id")
    private String oc_id;

    @Column(name = "le_id")
    private String le_id;

    @Column(name = "le_name")
    private String le_name;

    @Column(name = "p_name")
    private String p_name;

    @Column(name = "up_name")
    private String up_name;

    public LEinOC() {
    }

    public LEinOC(long id, Date timestamp, String user_id, String oc_id, String le_id, String le_name, String p_name, String up_name) {
        this.id = id;
        this.timestamp = timestamp;
        this.user_id = user_id;
        this.oc_id = oc_id;
        this.le_id = le_id;
        this.le_name = le_name;
        this.p_name = p_name;
        this.up_name = up_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getOc_id() {
        return oc_id;
    }

    public void setOc_id(String oc_id) {
        this.oc_id = oc_id;
    }

    public String getLe_id() {
        return le_id;
    }

    public void setLe_id(String le_id) {
        this.le_id = le_id;
    }

    public String getLe_name() {
        return le_name;
    }

    public void setLe_name(String le_name) {
        this.le_name = le_name;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getUp_name() {
        return up_name;
    }

    public void setUp_name(String up_name) {
        this.up_name = up_name;
    }

    @Override
    public String toString() {
        return "LEinOC{" +
                "id=" + id +
                ", timestamp=" + timestamp +
                ", user_id='" + user_id + '\'' +
                ", oc_id='" + oc_id + '\'' +
                ", le_id='" + le_id + '\'' +
                ", le_name='" + le_name + '\'' +
                ", p_name='" + p_name + '\'' +
                ", up_name='" + up_name + '\'' +
                '}';
    }
}
