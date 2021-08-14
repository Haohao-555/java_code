package demo;

public class City {
	   private String name;//³ÇÊÐÃû
	   private String description;//ÃèÊö;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public City(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	}
