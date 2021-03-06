package org.notima.api.fortnox.entities3;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="File")
public class FortnoxFile {

	private String url;
	
	private String 	comments;
	private String 	id;
	private String	archiveFileId;
	private String	name;
	private String	path;
	private long	size;
	
	@XmlAttribute(name="url")
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	@XmlElement(name="Comments")
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	@XmlElement(name="Id")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@XmlElement(name="ArchiveFileId")
	public String getArchiveFileId() {
		return archiveFileId;
	}
	public void setArchiveFileId(String archiveFileId) {
		this.archiveFileId = archiveFileId;
	}
	
	@XmlElement(name="Name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement(name="Path")
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	@XmlElement(name="Size")
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	
}
