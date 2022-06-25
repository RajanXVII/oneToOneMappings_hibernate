package OneToOne.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="instructor_detail")
public class InstructorDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="youtube_channel")
	private String ytChannel;
	@Column(name="hobby")
	private String hobby;
	
	public InstructorDetail( String ytChannel, String hobby) {
		this.ytChannel = ytChannel;
		this.hobby = hobby;
	}
	
	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", ytChannel=" + ytChannel + ", hobby=" + hobby + "]";
	}

	public InstructorDetail() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYtChannel() {
		return ytChannel;
	}

	public void setYtChannel(String ytChannel) {
		this.ytChannel = ytChannel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

}
