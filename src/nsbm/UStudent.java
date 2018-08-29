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
@Table(name = "undergraduate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Undergraduate_1.findAll", query = "SELECT u FROM Undergraduate_1 u")
    , @NamedQuery(name = "Undergraduate_1.findById", query = "SELECT u FROM Undergraduate_1 u WHERE u.id = :id")
    , @NamedQuery(name = "Undergraduate_1.findByName", query = "SELECT u FROM Undergraduate_1 u WHERE u.name = :name")
    , @NamedQuery(name = "Undergraduate_1.findByNic", query = "SELECT u FROM Undergraduate_1 u WHERE u.nic = :nic")
    , @NamedQuery(name = "Undergraduate_1.findByAddress", query = "SELECT u FROM Undergraduate_1 u WHERE u.address = :address")
    , @NamedQuery(name = "Undergraduate_1.findByHome", query = "SELECT u FROM Undergraduate_1 u WHERE u.home = :home")
    , @NamedQuery(name = "Undergraduate_1.findByMobile", query = "SELECT u FROM Undergraduate_1 u WHERE u.mobile = :mobile")
    , @NamedQuery(name = "Undergraduate_1.findByEmail", query = "SELECT u FROM Undergraduate_1 u WHERE u.email = :email")
    , @NamedQuery(name = "Undergraduate_1.findByIntake", query = "SELECT u FROM Undergraduate_1 u WHERE u.intake = :intake")
    , @NamedQuery(name = "Undergraduate_1.findByALyear", query = "SELECT u FROM Undergraduate_1 u WHERE u.aLyear = :aLyear")
    , @NamedQuery(name = "Undergraduate_1.findByIndexNum", query = "SELECT u FROM Undergraduate_1 u WHERE u.indexNum = :indexNum")
    , @NamedQuery(name = "Undergraduate_1.findByZcore", query = "SELECT u FROM Undergraduate_1 u WHERE u.zcore = :zcore")
    , @NamedQuery(name = "Undergraduate_1.findByIRank", query = "SELECT u FROM Undergraduate_1 u WHERE u.iRank = :iRank")
    , @NamedQuery(name = "Undergraduate_1.findByDrank", query = "SELECT u FROM Undergraduate_1 u WHERE u.drank = :drank")
    , @NamedQuery(name = "Undergraduate_1.findByStream", query = "SELECT u FROM Undergraduate_1 u WHERE u.stream = :stream")
    , @NamedQuery(name = "Undergraduate_1.findBySubject1", query = "SELECT u FROM Undergraduate_1 u WHERE u.FSubject1 = :FSubject1")
    , @NamedQuery(name = "Undergraduate_1.findBySubject2", query = "SELECT u FROM Undergraduate_1 u WHERE u.FSubject2 = :FSubject2")
    , @NamedQuery(name = "Undergraduate_1.findBySubject3", query = "SELECT u FROM Undergraduate_1 u WHERE u.FSubject3 = :FSubject3")
    , @NamedQuery(name = "Undergraduate_1.findBySubject1", query = "SELECT u FROM Undergraduate_1 u WHERE u.SSubject1 = :SSubject1")
    , @NamedQuery(name = "Undergraduate_1.findBySubject2", query = "SELECT u FROM Undergraduate_1 u WHERE u.SSubject2 = :SSubject2")
    , @NamedQuery(name = "Undergraduate_1.findBySubject3", query = "SELECT u FROM Undergraduate_1 u WHERE u.SSubject3 = :SSubject3")})
public class UStudent implements Serializable {

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
    @Column(name = "ALyear")
    private int aLyear;
    @Basic(optional = false)
    @Column(name = "IndexNum")
    private int indexNum;
    @Basic(optional = false)
    @Column(name = "Zcore")
    private double zcore;
    @Basic(optional = false)
    @Column(name = "IRank")
    private int iRank;
    @Basic(optional = false)
    @Column(name = "Drank")
    private int drank;
    @Column(name = "Stream")
    private String stream;
    @Basic(optional = false)
    @Column(name = "FSubject1")
    private String FSubject1;
    @Basic(optional = false)
    @Column(name = "FSubject2")
    private String FSubject2;
    @Basic(optional = false)
    @Column(name = "FSubject3")
    private String FSubject3;
    @Basic(optional = false)
    @Column(name = "SSubject1")
    private String SSubject1;
    @Basic(optional = false)
    @Column(name = "SSubject2")
    private String SSubject2;
    @Basic(optional = false)
    @Column(name = "SSubject3")
    private String SSubject3;

    public UStudent() {
    }

    public UStudent(Integer id) {
        this.id = id;
    }

        public UStudent(Integer id, String name, String nic, String address, int home, int mobile, String email, String intake, int aLyear, int indexNum, double zcore, int iRank, int drank, String stream, String fsubject1, String fsubject2, String fsubject3, String ssubject1, String ssubject2, String ssubject3) {
        this.id = id;
        this.name = name;
        this.nic = nic;
        this.address = address;
        this.home = home;
        this.mobile = mobile;
        this.email = email;
        this.intake = intake;
        this.aLyear = aLyear;
        this.indexNum = indexNum;
        this.zcore = zcore;
        this.iRank = iRank;
        this.drank = drank;
        this.stream = stream;
        this.FSubject1 = fsubject1;
        this.FSubject2 = fsubject2;
        this.FSubject3 = fsubject3;
        this.SSubject1 = ssubject1;
        this.SSubject2 = ssubject2;
        this.SSubject3 = ssubject3;
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

    public int getALyear() {
        return aLyear;
    }

    public void setALyear(int aLyear) {
        this.aLyear = aLyear;
    }

    public int getIndexNum() {
        return indexNum;
    }

    public void setIndexNum(int indexNum) {
        this.indexNum = indexNum;
    }

    public double getZcore() {
        return zcore;
    }

    public void setZcore(double zcore) {
        this.zcore = zcore;
    }

    public int getIRank() {
        return iRank;
    }

    public void setIRank(int iRank) {
        this.iRank = iRank;
    }

    public int getDrank() {
        return drank;
    }

    public void setDrank(int drank) {
        this.drank = drank;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getFSubject1() {
        return FSubject1;
    }

    public void setFSubject1(String FSubject1) {
        this.FSubject1 = FSubject1;
    }

    public String getFSubject2() {
        return FSubject2;
    }

    public void setFSubject2(String FSubject2) {
        this.FSubject2 = FSubject2;
    }

    public String getFSubject3() {
        return FSubject3;
    }

    public void setFSubject3(String FSubject3) {
        this.FSubject3 = FSubject3;
    }
    
    public String getSSubject1() {
        return SSubject1;
    }

    public void setSSubject1(String SSubject1) {
        this.SSubject1 = SSubject1;
    }

    public String getSSubject2() {
        return SSubject2;
    }

    public void setSSubject2(String SSubject2) {
        this.SSubject2 = SSubject2;
    }

    public String getSSubject3() {
        return SSubject3;
    }

    public void setSSubject3(String SSubject3) {
        this.SSubject3 = SSubject3;
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
        if (!(object instanceof UStudent)) {
            return false;
        }
        UStudent other = (UStudent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "nsbm.Undergraduate_1[ id=" + id + " ]";
    }
    
}
