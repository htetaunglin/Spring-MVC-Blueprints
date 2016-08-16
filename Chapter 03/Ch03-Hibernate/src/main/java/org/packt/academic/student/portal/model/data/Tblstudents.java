package org.packt.academic.student.portal.model.data;

// Generated 03 12, 16 1:32:12 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Tblstudents generated by hbm2java
 */
@Entity
@Table(name = "tblstudents", catalog = "smp")
public class Tblstudents implements java.io.Serializable {

	private Integer studentId;
	private Level level;
	private Semester semester;
	private Status status;
	private String firstName;
	private String lastName;
	private String middleName;
	private String gender;
	private Date birthDate;
	private String degree;
	private String address;
	private String mobile;
	private String email;
	private String username;
	private Tblgpa tblgpa;
	private Set<Tblstudentgrades> tblstudentgradeses = new HashSet<Tblstudentgrades>(
			0);

	public Tblstudents() {
	}

	public Tblstudents(Level level, Semester semester, Status status,
			String firstName, String lastName, String middleName,
			String gender, Date birthDate, String degree, String address,
			String mobile, String email, String username) {
		this.level = level;
		this.semester = semester;
		this.status = status;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.degree = degree;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.username = username;
	}

	public Tblstudents(Level level, Semester semester, Status status,
			String firstName, String lastName, String middleName,
			String gender, Date birthDate, String degree, String address,
			String mobile, String email, String username, Tblgpa tblgpa,
			Set<Tblstudentgrades> tblstudentgradeses) {
		this.level = level;
		this.semester = semester;
		this.status = status;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.degree = degree;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.username = username;
		this.tblgpa = tblgpa;
		this.tblstudentgradeses = tblstudentgradeses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "studentID", unique = true, nullable = false)
	public Integer getStudentId() {
		return this.studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "level", nullable = false)
	public Level getLevel() {
		return this.level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "semester", nullable = false)
	public Semester getSemester() {
		return this.semester;
	}

	public void setSemester(Semester semester) {
		this.semester = semester;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "status", nullable = false)
	public Status getStatus() {
		return this.status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Column(name = "firstName", nullable = false, length = 50)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "lastName", nullable = false, length = 50)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "middleName", nullable = false, length = 50)
	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Column(name = "gender", nullable = false, length = 10)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "birthDate", nullable = false, length = 10)
	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Column(name = "degree", nullable = false, length = 45)
	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Column(name = "address", nullable = false, length = 100)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "mobile", nullable = false, length = 12)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "email", nullable = false, length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "username", nullable = false, length = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "tblstudents")
	public Tblgpa getTblgpa() {
		return this.tblgpa;
	}

	public void setTblgpa(Tblgpa tblgpa) {
		this.tblgpa = tblgpa;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblstudents")
	public Set<Tblstudentgrades> getTblstudentgradeses() {
		return this.tblstudentgradeses;
	}

	public void setTblstudentgradeses(Set<Tblstudentgrades> tblstudentgradeses) {
		this.tblstudentgradeses = tblstudentgradeses;
	}

}