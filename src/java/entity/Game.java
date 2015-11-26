/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Matt
 */
@Entity
@Table(name = "Game")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Game.findAll", query = "SELECT g FROM Game g"),
    @NamedQuery(name = "Game.findByGameID", query = "SELECT g FROM Game g WHERE g.gameID = :gameID"),
    @NamedQuery(name = "Game.findByTitle", query = "SELECT g FROM Game g WHERE g.title = :title"),
    @NamedQuery(name = "Game.findByDescription", query = "SELECT g FROM Game g WHERE g.description = :description"),
    @NamedQuery(name = "Game.findByGenre", query = "SELECT g FROM Game g WHERE g.genre = :genre"),
    @NamedQuery(name = "Game.findByPrice", query = "SELECT g FROM Game g WHERE g.price = :price"),
    @NamedQuery(name = "Game.findByDeveloper", query = "SELECT g FROM Game g WHERE g.developer = :developer"),
    @NamedQuery(name = "Game.findByPublisher", query = "SELECT g FROM Game g WHERE g.publisher = :publisher"),
    @NamedQuery(name = "Game.findByPublishDate", query = "SELECT g FROM Game g WHERE g.publishDate = :publishDate"),
    @NamedQuery(name = "Game.findBySystemSpecs", query = "SELECT g FROM Game g WHERE g.systemSpecs = :systemSpecs"),
    @NamedQuery(name = "Game.findByPlatform", query = "SELECT g FROM Game g WHERE g.platform = :platform"),
    @NamedQuery(name = "Game.findByAgeRating", query = "SELECT g FROM Game g WHERE g.ageRating = :ageRating"),
    @NamedQuery(name = "Game.findByUserScore", query = "SELECT g FROM Game g WHERE g.userScore = :userScore"),
    @NamedQuery(name = "Game.findBySingleMultiplayer", query = "SELECT g FROM Game g WHERE g.singleMultiplayer = :singleMultiplayer"),
    @NamedQuery(name = "Game.findByDownloadLink", query = "SELECT g FROM Game g WHERE g.downloadLink = :downloadLink")})
public class Game implements Serializable {
    @Lob
    @Column(name = "image")
    private byte[] image;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "GameID")
    private Integer gameID;
    @Size(max = 20)
    @Column(name = "title")
    private String title;
    @Size(max = 250)
    @Column(name = "description")
    private String description;
    @Size(max = 20)
    @Column(name = "genre")
    private String genre;
    @Column(name = "price")
    private Integer price;
    @Size(max = 20)
    @Column(name = "developer")
    private String developer;
    @Size(max = 20)
    @Column(name = "publisher")
    private String publisher;
    @Column(name = "publishDate")
    @Temporal(TemporalType.DATE)
    private Date publishDate;
    @Size(max = 200)
    @Column(name = "systemSpecs")
    private String systemSpecs;
    @Column(name = "platform")
    private Integer platform;
    @Column(name = "ageRating")
    private Integer ageRating;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "userScore")
    private Float userScore;
    @Column(name = "singleMultiplayer")
    private Integer singleMultiplayer;
    @Size(max = 100)
    @Column(name = "downloadLink")
    private String downloadLink;

    public Game() {
    }

    public Game(Integer gameID) {
        this.gameID = gameID;
    }

    public Integer getGameID() {
        return gameID;
    }

    public void setGameID(Integer gameID) {
        this.gameID = gameID;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getSystemSpecs() {
        return systemSpecs;
    }

    public void setSystemSpecs(String systemSpecs) {
        this.systemSpecs = systemSpecs;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public Integer getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(Integer ageRating) {
        this.ageRating = ageRating;
    }

    public Float getUserScore() {
        return userScore;
    }

    public void setUserScore(Float userScore) {
        this.userScore = userScore;
    }

    public Integer getSingleMultiplayer() {
        return singleMultiplayer;
    }

    public void setSingleMultiplayer(Integer singleMultiplayer) {
        this.singleMultiplayer = singleMultiplayer;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gameID != null ? gameID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Game)) {
            return false;
        }
        Game other = (Game) object;
        if ((this.gameID == null && other.gameID != null) || (this.gameID != null && !this.gameID.equals(other.gameID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Game[ gameID=" + gameID + " ]";
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
    
}
