package az.developia.spring_project_14aprel.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@EqualsAndHashCode
//@Data
//@Builder
@Entity
@Table(name = "book")
public class Book implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	
	@Column(name = "publish_year")
	private Integer year;
	private String author;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Favorite> favorite; 
}
