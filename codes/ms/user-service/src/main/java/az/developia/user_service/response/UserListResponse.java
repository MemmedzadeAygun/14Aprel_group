package az.developia.user_service.response;

import java.util.List;

import az.developia.user_service.entity.User;
import lombok.Data;

@Data
public class UserListResponse {

	private List<User> userListResponse;
	private List<UserResponse> userListResponseWithBooks;
}
