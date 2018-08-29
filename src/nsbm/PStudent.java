/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Pramuditha Kaushalya
 */
@Entity
@Table(name = "postgraduate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PStudent.findAll", query = "SELECT p FROM PStudent p")
    , @NamedQuery(name = "PStudent.findById", query = "SELECT p FROM PStudent p WHERE p.id = :id")
    , @NamedQuery(name = "PStudent.findByName", query = "SELECT p FROM PStudent p WHERE p.name = :name")
    , @NamedQuery(name = "PStudent.findByNic", query = "SELECT p FROM PStudent p WHERE p.nic = :nic")
    , @NamedQuery(name = "PStudent.findByAddress", query = "SELECT p FROM PStudent p WHERE p.address = :address")
    , @NamedQuery(name = "PStudent.findByHome", query = "SELECT p FROM PStudent p WHERE p.home = :home")
    , @NamedQuery(name = "PStudent.findByMobile", query = "SELECT p FROM PStudent p WHERE p.mobile = :mobile")
    , @NamedQuery(name = "PStudent.findByEmail", query = "SELECT p FROM PStudent p WHERE p.email = :email")
    , @NamedQuery(name = "PStudent.findByIntake", query = "SELECT p FROM PStudent p WHERE p.intake = :intake")
    , @NamedQuery(name = "PStudent.findByDigDip", query = "SELECT p FROM PStudent p WHERE p.digDip = :digDip")
    , @NamedQuery(name = "PStudent.findByInstitute", query = "SELECT p FROM PStudent p WHERE p.institute = :institute")
    , @NamedQuery(name = "PStudent.findByYear", query = "SELECT p FROM PStudent p WHERE p.year = :year")
    , @NamedQuery(name = "PStudent.findBySubject1", query = "SELECT p FROM PStudent p WHERE p.subject1 = :subject1")
    , @NamedQuery(name = "PStudent.findBySubject2", query = "SELECT p FROM PStudent p WHERE p.subject2 = :subject2")
    , @NamedQuery(name = "PStudent.findBySubject3", query = "SELECT p FROM PStudent p WHERE p.subject3 = :subject3")
    , @NamedQuery(name = "PStudent.findBySubject4", query = "SELECT p FROM PStudent p WHERE p.subject4 = :subject4")
    , @NamedQuery(name = "PStudent.findBySubject5", query = "SELECT p FROM PStudent p WHERE p.subject5 = :subject5")
    , @NamedQuery(name = "PStudent.findBySubject6", query = "SELECT p FROM PStudent p WHERE p.subject6 = :subject6")})
public class PStudent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Name")
    private String name;
    @Basic(optional = false)
    @Column(name = "NIC")
    private String nic;
    @Basic(optional = false)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @Column(name = "Home")
    private int home;
    @Basic(optional = false)
    @Column(name = "Mobile")
    private int mobile;
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @Column(name = "Intake")
    private String intake;
    @Basic(optional = false)
    @Column(name = "DigDip")
    private String digDip;
    @Basic(optional = false)
    @Column(name = "Institute")
    private String institute;
    @Basic(optional = false)
    @Column(name = "Year")
    private int year;
    @Basic(optional = false)
    @Column(name = "Subject1")
    private String subject1;
    @Basic(optional = false)
    @Column(name = "Subject2")
    private String subject2;
    @Basic(optional = false)
    @Column(name = "Subject3")
    private String subject3;
    @Basic(optional = false)
    @Column(name = "Subject4")
    private String subject4;
    @Basic(optional = false)
    @Column(name = "Subject5")
    private String subject5;
    @Basic(optional = false)
    @Column(name = "Subject6")
    private String subject6;

    public PStudent() {
    }

    public PStudent(Integer id) {
        this.id = id;
    }

    public PStudent(Integer id, String name, String nic, String address, int home, int mobile, String email, String intake, String digDip, String institute, int year, String subject1, String subject2, String subject3, String subject4, String subject5, String subject6) {
        this.id = id;
        this.name = name;
        this.nic = nic;
        this.address = address;
        this.home = home;
        this.mobile = mobile;
        this.email = email;
        this.intake = intake;
        this.digDip = digDip;
        this.institute = institute;
        this.year = year;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
        this.subject5 = subject5;
        this.subject6 = subject6;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIntake() {
        return intake;
    }

    public void setIntake(String intake) {
        this.intake = intake;
    }

    public String getDigDip() {
        return digDip;
    }

    public void setDigDip(String digDip) {
        this.digDip = digDip;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSubject1() {
        return subject1;
    }

    public void setSubject1(String subject1) {
        this.subject1 = subject1;
    }

    public String getSubject2() {
        return subject2;
    }

    public void setSubject2(String subject2) {
        this.subject2 = subject2;
    }

    public String getSubject3() {
        return subject3;
    }

    public void setSubject3(String subject3) {
        this.subject3 = subject3;
    }

    public String getSubject4() {
        return subject4;
    }

    public void setSubject4(String subject4) {
        this.subject4 = subject4;
    }

    public String getSubject5() {
        return subject5;
    }

    public void setSubject5(String subject5) {
        this.subject5 = subject5;
    }

    public String getSubject6() {
        return subject6;
    }

    public void setSubject6(String subject6) {
        this.subject6 = subject6;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PStudent)) {
            return false;
        }
        PStudent other = (PStudent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "nsbm.PStudent[ id=" + id + " ]";
    }
    
}
