package az.developia.spring_project_14aprel.responseDto;

import java.util.List;

import az.developia.spring_project_14aprel.entity.Address;
import az.developia.spring_project_14aprel.entity.Favorite;
import az.developia.spring_project_14aprel.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDto {
	private Integer id;
	private String firstName; 
	private String lastName;
	private String username;
	private String email;
	private String password;
	private List<OrderResponseDto> orders; 
}
