package az.developia.spring_project_14aprel.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String firstName; //first_name
	private String lastName;
	private String username;
	private String email;
	private String password;
	
	@OneToOne(mappedBy = "user")
	private Address address;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Order> orders; 
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Favorite> favorites;

}
